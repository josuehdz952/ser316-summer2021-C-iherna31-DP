package monsterBuilderDP;


public class mewtwoMonsterBuilder implements monsterBuilder{
	private monsters mewtwo = new monsters();
	@Override
	public void addName() {
		// TODO Auto-generated method stub
		mewtwo.setName("Mewtwo");
	}

	@Override
	public void addDefense() {
		// TODO Auto-generated method stub
		mewtwo.setDefense(90.0);
	}

	@Override
	public void addHealth() {
		// TODO Auto-generated method stub
		mewtwo.setHealth(106.0);
	}

	@Override
	public void addAttacks() {
		// TODO Auto-generated method stub
		attack[] mewAttacks = new attack[4];
		mewAttacks[0].attackName = "Confusion";
		mewAttacks[0].attackType = "Psychic";
		mewAttacks[0].attackDamage = 5.0;
		mewAttacks[0].bonusType = 1.20;
		
		mewAttacks[1].attackName = "Psystrike";
		mewAttacks[1].attackType = "Psychic";
		mewAttacks[1].attackDamage = 10.0;
		mewAttacks[1].bonusType = 1.20;
		
		mewAttacks[2].attackName = "Swift";
		mewAttacks[2].attackType = "Normal";
		mewAttacks[2].attackDamage = 6.0;
		mewAttacks[2].bonusType = 1;
		
		mewAttacks[3].attackName = "Future Sight";
		mewAttacks[3].attackType = "Psychic";
		mewAttacks[3].attackDamage = 12.0;
		mewAttacks[3].bonusType = 1.20;
		
		mewtwo.setAttacks(mewAttacks);
	}

	@Override
	public void addType() {
		// TODO Auto-generated method stub
		mewtwo.setType("Psychic");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return mewtwo.name;
	}

	@Override
	public double getDefense() {
		// TODO Auto-generated method stub
		return mewtwo.defense;
	}

	@Override
	public double getHealth() {
		// TODO Auto-generated method stub
		return mewtwo.health;
	}

	@Override
	public attack getAttack(int attackNum) {
		// TODO Auto-generated method stub
		// if invalid attackNum is passed neutral attack will be chosen
		if (attackNum >= mewtwo.attacks.length || attackNum < 0) {
			return mewtwo.attacks[0];
		} else {
			return mewtwo.attacks[attackNum];
		}
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return mewtwo.type;
	}

	@Override
	public int getXP() {
		// TODO Auto-generated method stub
		return mewtwo.xp;
	}

	@Override
	public int getLevel() {
		// TODO Auto-generated method stub
		return mewtwo.level;
	}

}
