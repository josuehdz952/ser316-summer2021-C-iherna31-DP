package monsterBuilderDP;

/**
	 * Nested attack class that is used to create an array of attacks for each monster when created
	 * @author irvin
	 *
	 */
public class attack {
		public String attackName;
		public String attackType;
		public double attackDamage;
		public double bonusType;
		public boolean criticalStrike;
		
		public attack() {
			attackName = "";
			attackType = "";
			attackDamage = 0;
			bonusType = 0;
		}
}
