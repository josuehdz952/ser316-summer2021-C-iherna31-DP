package monsterBuilderDP;

public interface monsterBuilder {
    // all monsters start with a Zero XP and a Level 1
    public abstract void addName();

    public abstract void addDefense();

    public abstract void addHealth();

    public abstract void addAttacks();

    public abstract void addType();

    public abstract String getName();

    public abstract double getDefense();

    public abstract double getHealth();

    public abstract attack getAttack(int attackNum);

    public abstract String getType();

    public abstract int getXP();

    public abstract int getLevel();

}
