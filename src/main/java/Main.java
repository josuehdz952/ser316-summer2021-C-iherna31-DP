import monsterBuilderDP.*;
import trainerDP.*;
import java.util.Random;

import cyclesStateDp.*;

public class Main {
/**
 * Main class is in charge of creating the trainers and monsters and adding them to the player also it is in charge of simulating
 * the battles
 * @param args
 */
    public static void main(String[] args) {
        System.out.println("Hello Trainers!!");
        trainer t1 = new trainer("Josue");
        System.out.println("Trainer " + t1.getTrainerName() + " has joined the world");
        trainer t2 = new trainer("Melhase");
        System.out.println("Trainer " + t2.getTrainerName() + " has joined the world");

        // creating starter monsters
        monsterDirector director = new monsterDirector();

        monsterBuilder pikachu = new pikachuMonsterBuilder();
        director.makeMonster(pikachu);

        t1.addMonsterToTrainer(pikachu);
        System.out.print(t1.getTrainerName() + " has chosen as starter monster: "); 
        System.out.println("" + pikachu.getName());

        monsterBuilder growlithe = new growlitheMonsterBuilder();
        director.makeMonster(growlithe);

        monsterBuilder bulbasaur = new bulbasaurMonsterBuilder();
        director.makeMonster(bulbasaur);

        monsterBuilder mewtwo = new mewtwoMonsterBuilder();
        director.makeMonster(mewtwo);

        t2.addMonsterToTrainer(growlithe);
        System.out.println(t2.getTrainerName() + " has chosen as starter monster: " + growlithe.getName() + "\n");

        System.out.println("Preparing for first battle");

        String weather;
        System.out.println("Selecting weather.....");
        CYCLES cycle = new CYCLES(new DAYSTATE());
        weather = cycle.getWeather();
        double totalDamage;
        System.out.println("First trainer selecting monsters to battle with......");
        monsterBuilder attacker = t1.getMonsterFromTrainer(pikachu);
        Random rand = new Random();
        // selecting attack
        System.out.println("Second trainer selecting monsters to battle with......");
        monsterBuilder defender = t2.getMonsterFromTrainer(growlithe);
        double defenderHp = defender.getHealth();
        double attackerHp = attacker.getHealth();
        winnerFacade win = new winnerFacade();
        int i;
        attack temp;
        while (attackerHp > 0) {
            i = rand.nextInt(5);
            temp = attacker.getAttack(i);
            System.out.println(attacker.getName() + " is starting attack.");
            totalDamage = calculateDamage(defender, temp);
            defenderHp = defenderHp - totalDamage;
            System.out.println("Damge Dealt is: " + totalDamage);
            System.out.println(defender.getName() + " has " + defenderHp + " left");
            if (defenderHp <= 0) {
                win.assesWon(t1, 250);
                break;
            }

            i = rand.nextInt(5);
            temp = defender.getAttack(i);
            System.out.println(defender.getName() + " is starting attack.");
            totalDamage = calculateDamage(attacker, temp);
            attackerHp = attackerHp - totalDamage;
            System.out.println("Damge Dealt is: " + totalDamage);
            System.out.println(attacker.getName() + " has " + attackerHp + " left");
            if (attackerHp <= 0) {
                win.assesWon(t2, 250);
                break;
            }
            System.out.println("LOOKS LIKE THE WEATHER IS CHANGING.....");
            cycle.changeWeather();
        }

    }

    public static double calculateDamage(monsterBuilder defender, attack a) {
        double defense = defender.getDefense();

        double damage = (a.attackDamage * a.bonusType) - defense;
        if (damage <= 0) {
            damage = 0;
        }
        return damage;

    }
}
