package monsterBuilderDP;

public class pikachuMonsterBuilder implements monsterBuilder {

	private monsters pikachu = new monsters();

	@Override
	public void addName() {
		pikachu.setName("Pikachu");
	}

	@Override
	public void addDefense() {
		pikachu.setDefense(40.0);
	}

	@Override
	public void addHealth() {
		pikachu.setHealth(35.0);
	}

	@Override
	public void addAttacks() {
		attack[] pikachuAttacks = new attack[2];
		// building attack 1
		pikachuAttacks[0] = new attack();
		pikachuAttacks[0].attackName = "Slam";
		pikachuAttacks[0].attackType = "Neutral";
		pikachuAttacks[0].attackDamage = 8.0;
		pikachuAttacks[0].bonusType = 1;
		
		pikachuAttacks[1] = new attack();
		pikachuAttacks[1].attackName = "Thunder";
		pikachuAttacks[1].attackType = "Electric";
		pikachuAttacks[1].attackDamage = 11.0;
		pikachuAttacks[1].bonusType = 1.20;
		
		pikachu.setAttacks(pikachuAttacks);
	}

	@Override
	public void addType() {
		pikachu.setType("Electric");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return pikachu.name;
	}

	@Override
	public double getDefense() {
		// TODO Auto-generated method stub
		return pikachu.defense;
	}

	@Override
	public double getHealth() {
		// TODO Auto-generated method stub
		return pikachu.health;
	}

	@Override
	public attack getAttack(int attackNum) {
		// TODO Auto-generated method stub
		// if invalid attackNum is passed neutral attack will be chosen
		if (attackNum >= pikachu.attacks.length || attackNum < 0) {
			return pikachu.attacks[0];
		} else {
			return pikachu.attacks[attackNum];
		}
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return pikachu.type;
	}

	@Override
	public int getXP() {
		// TODO Auto-generated method stub
		return pikachu.xp;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return pikachu.level;
	}

}
