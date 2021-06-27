import monsterBuilderDP.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		monsterDirector director = new monsterDirector();
		monsterBuilder m1 = new pikachuMonsterBuilder();
		director.makeMonster(m1);
		System.out.println("" + m1.getName());
		System.out.println("" + m1.getDefense());
		System.out.println("" + m1.getHealth());
		System.out.println("" + m1.getType());
		System.out.println("" + m1.getXP());
		System.out.println("" + m1.getLevel());
		System.out.println("" + m1.getAttack(0).attackName);
		System.out.println("" + m1.getAttack(1).attackName);
	}
}
