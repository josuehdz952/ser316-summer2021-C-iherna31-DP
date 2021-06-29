package trainerDP;

import java.util.LinkedList;

import monsterBuilderDP.bulbasaurMonsterBuilder;
import monsterBuilderDP.mewtwoMonsterBuilder;
import monsterBuilderDP.monsterBuilder;
import monsterBuilderDP.monsterDirector;
import monsterBuilderDP.monsters;
import monsterBuilderDP.pikachuMonsterBuilder;

/**
 * Implementing a facade Structural design pattern for adding and getting
 * monsters from trainer
 * 
 * @author irvin
 *
 */
public class trainer {
    String name;
    private LinkedList<monsterBuilder> trainerMonsters;
    private int trainerLevel;
    private int trainerXP;

    public trainer(String name) {
        this.name = name;
        trainerMonsters = new LinkedList<monsterBuilder>();
        trainerLevel = 1;
        trainerXP = 0;
    }

    public String getTrainerName() {
        return name;
    }

    /**
     * adds monsters to trainers Library of monsters
     * 
     * @param m1
     */
    public void addMonsterToTrainer(monsterBuilder m1) {
        if (trainerMonsters.size() >= 6) {
            System.out.println("Cannot add more monsters to your Library");
        } else {
            trainerMonsters.add(m1);
        }
    }

    /**
     * gets monsters from trainer at with name
     * 
     * @param name index
     */
    public monsterBuilder getMonsterFromTrainer(monsterBuilder target) {
        monsterBuilder mon;
        int i = trainerMonsters.indexOf(target);
        if (i >= 0) {
            mon = trainerMonsters.get(i);
            return mon;
        } else {
            System.out.print("Couldn't find specified Monster, choosing first in your Library");
            mon = trainerMonsters.getFirst();
            return mon;
        }
    }

    public int getTrainerLevel() {
        return trainerLevel;
    }

    public int getTrainerXP() {
        return trainerXP;
    }

    /**
     * adds XP to trainer for battles won, when XP reaches 100 it will level up
     * trainer
     * 
     * @param xp int number of experience won in battle
     */
    public void addXP(int xp) {
        trainerXP = trainerXP + xp;
        while (trainerXP >= 100) {
            trainerLevel++;
            trainerXP -= 100;
            System.out.println("Level has been increased to: " + trainerLevel);

            if (trainerLevel >= 2 && trainerLevel < 3) {

                monsterDirector director = new monsterDirector();
                monsterBuilder x = new bulbasaurMonsterBuilder();

                director.makeMonster(x);
                addMonsterToTrainer(x);
                System.out.println(name + " has unlocked new monster " + x.getName());
            }
            if (trainerLevel >= 3 && trainerLevel < 4) {

                monsterDirector director = new monsterDirector();
                monsterBuilder x = new mewtwoMonsterBuilder();

                director.makeMonster(x);
                addMonsterToTrainer(x);
                System.out.println(name + " has unlocked new monster " + x.getName());
            }
        }
    }

}
