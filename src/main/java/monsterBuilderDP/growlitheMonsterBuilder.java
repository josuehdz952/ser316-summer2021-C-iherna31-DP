package monsterBuilderDP;

public class growlitheMonsterBuilder implements monsterBuilder {
    private monsters growlithe = new monsters();

    @Override
    public void addName() {
        growlithe.setName("Growlithe");
    }

    @Override
    public void addDefense() {
        growlithe.setDefense(45.0);
    }

    @Override
    public void addHealth() {
        // TODO Auto-generated method stub
        growlithe.setHealth(55);
    }

    @Override
    public void addAttacks() {
        // TODO Auto-generated method stub
        attack[] gAttacks = new attack[3];

        gAttacks[0] = new attack();
        gAttacks[0].attackName = "Flamethrower";
        gAttacks[0].attackType = "Fire";
        gAttacks[0].attackDamage = 75.0;
        gAttacks[0].bonusType = 1.20;

        gAttacks[1] = new attack();
        gAttacks[1].attackName = "Howl";
        gAttacks[1].attackType = "Normal";
        gAttacks[1].attackDamage = 0.0;
        gAttacks[1].bonusType = 1;

        gAttacks[2] = new attack();
        gAttacks[2].attackName = "Bite";
        gAttacks[2].attackType = "Normal";
        gAttacks[2].attackDamage = 60.0;
        gAttacks[2].bonusType = 1.0;

        growlithe.setAttacks(gAttacks);

    }

    @Override
    public void addType() {
        // TODO Auto-generated method stub
        growlithe.setType("Fire");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return growlithe.name;
    }

    @Override
    public double getDefense() {
        // TODO Auto-generated method stub
        return growlithe.defense;
    }

    @Override
    public double getHealth() {
        // TODO Auto-generated method stub
        return growlithe.health;
    }

    @Override
    public attack getAttack(int attackNum) {
        // TODO Auto-generated method stub
        // if invalid attackNum is passed neutral attack will be chosen
        if (attackNum >= growlithe.attacks.length || attackNum < 0) {
            return growlithe.attacks[0];
        } else {
            return growlithe.attacks[attackNum];
        }
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return growlithe.type;
    }

    @Override
    public int getXP() {
        // TODO Auto-generated method stub
        return growlithe.xp;
    }

    @Override
    public int getLevel() {
        // TODO Auto-generated method stub
        return growlithe.level;
    }

}
