package monsterBuilderDP;

public class bulbasaurMonsterBuilder implements monsterBuilder {

    private monsters bulbasaur = new monsters();

    @Override
    public void addName() {
        // TODO Auto-generated method stub
        bulbasaur.setName("Bulbasaur");
    }

    @Override
    public void addDefense() {
        // TODO Auto-generated method stub
        bulbasaur.setDefense(49.0);
    }

    @Override
    public void addHealth() {
        // TODO Auto-generated method stub
        bulbasaur.setHealth(45.0);
    }

    @Override
    public void addAttacks() {
        // attack gets a bonus of 20% if it matches type of monster
        attack[] bulAttacks = new attack[3];
        bulAttacks[0] = new attack();
        bulAttacks[0].attackName = "Razor Leaf";
        bulAttacks[0].attackType = "Grass";
        bulAttacks[0].attackDamage = 50.0;
        bulAttacks[0].bonusType = 1.20;

        bulAttacks[1] = new attack();
        bulAttacks[1].attackName = "Take Down";
        bulAttacks[1].attackType = "Normal";
        bulAttacks[1].attackDamage = 45.0;
        bulAttacks[1].bonusType = 1;

        bulAttacks[2] = new attack();
        bulAttacks[2].attackName = "Solar Beam";
        bulAttacks[2].attackType = "Grass";
        bulAttacks[2].attackDamage = 65.0;
        bulAttacks[2].bonusType = 1.20;

        bulbasaur.setAttacks(bulAttacks);
    }

    @Override
    public void addType() {
        // TODO Auto-generated method stub
        bulbasaur.setType("Grass");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return bulbasaur.name;
    }

    @Override
    public double getDefense() {
        // TODO Auto-generated method stub
        return bulbasaur.defense;
    }

    @Override
    public double getHealth() {
        // TODO Auto-generated method stub
        return bulbasaur.health;
    }

    @Override
    public attack getAttack(int attackNum) {
        // TODO Auto-generated method stub
        // if invalid attackNum is passed neutral attack will be chosen
        if (attackNum >= bulbasaur.attacks.length || attackNum < 0) {
            return bulbasaur.attacks[0];
        } else {
            return bulbasaur.attacks[attackNum];
        }
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return bulbasaur.type;
    }

    @Override
    public int getXP() {
        // TODO Auto-generated method stub
        return bulbasaur.xp;
    }

    @Override
    public int getLevel() {
        // TODO Auto-generated method stub
        return bulbasaur.level;
    }

}
