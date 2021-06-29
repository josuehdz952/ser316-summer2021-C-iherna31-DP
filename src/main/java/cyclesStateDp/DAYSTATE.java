package cyclesStateDp;

public class DAYSTATE implements CYCLESTATE {
    weather dWeather = new weather();
    String dayWeather;

    public DAYSTATE() {
        dayWeather = dWeather.generateWeather();
        System.out.println("It is DAY and weather is " + dayWeather);
    }

    @Override
    public void changeCycle(CYCLES cycle) {
        // TODO Auto-generated method stub
        cycle.setState(new NIGHTSTATE());
    }

    @Override
    public void changeWeather(CYCLES cycle) {
        // TODO Auto-generated method stub
        dayWeather = dWeather.generateWeather();
        System.out.println("It is DAY and weather is " + dayWeather);

    }

    @Override
    public String getWeather() {
        // TODO Auto-generated method stub
        return dayWeather;
    }

}
