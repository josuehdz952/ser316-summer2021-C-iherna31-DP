import java.util.Random;

public class worldManager {
	int numTrainers;
	Random rand =  new Random();
	public worldManager() {
		//creates random num of players between 1 and 5
		numTrainers = (rand.nextInt(5) + 1);
	}
	
	public void createTrainers() {
		
	}
	
}
