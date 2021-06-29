package monsterBuilderDP;

/**
 * Using a Builder DP for creating monsters. Monster is the "Product" as defined
 * in the Go4 builder design pattern.
 * 
 * @author Irvin
 * @version 1.0
 */
public class monsters {
    public String name;
    public double defense;
    public double health;
    public attack[] attacks;
    public String type;
    // when monster is created xp starts at 0 and level starts at 1
    public int xp = 0;
    public int level = 1;

    /**
     * Setter for monster name
     * 
     * @param name new monster's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for monster Name
     * 
     * @return monter name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for monster defense
     * 
     * @param defense new monster defense
     */
    public void setDefense(double defense) {
        this.defense = defense;
    }

    /**
     * getter for monster defense
     * 
     * @return monsters defense
     */
    public double getDefense() {
        return this.defense;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return this.health;
    }

    public void setAttacks(attack[] attacks) {
        this.attacks = attacks;
    }

    public attack getAttack(int attackNum) {
        // if invalid attackNum is passed neutral attack will be chosen
        if (attackNum >= attacks.length || attackNum < 0) {
            return attacks[0];
        } else {
            return attacks[attackNum];
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public void setXP(int xp) {
        if (this.xp != 0) {
            this.xp = xp + this.xp;
        } else {
            this.xp = xp;
        }
    }

    public int getXP() {
        return this.xp;
    }

    public void setLevel() {
        if (xp >= 100) {
            level++;
            xp = xp - 100;
        }
    }

    public int getLevel() {
        return this.level;
    }
}
