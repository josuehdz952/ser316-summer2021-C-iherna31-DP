package cyclesStateDp;

import java.util.Random;

public class weather {
    private String weather[] = { "Sunny", "Cloudy", "In-doors", "Undeground" };
    Random rand = new Random();

    public String generateWeather() {
        int i = rand.nextInt(4);
        return weather[i];
    }
}
