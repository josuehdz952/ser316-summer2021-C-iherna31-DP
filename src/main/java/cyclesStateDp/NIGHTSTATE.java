package cyclesStateDp;

public class NIGHTSTATE implements CYCLESTATE {
    public weather nWeather = new weather();
    public String nightWeather;

    public NIGHTSTATE() {
        nightWeather = nWeather.generateWeather();
        System.out.println("It is NIGHT and weather is " + nightWeather);
    }

    @Override
    public void changeCycle(CYCLES cycle) {
        // TODO Auto-generated method stub
        cycle.setState(new DAYSTATE());
    }

    @Override
    public void changeWeather(CYCLES cycle) {
        // TODO Auto-generated method stub
        nightWeather = nWeather.generateWeather();
        System.out.println("It is NIGHT and weather is " + nightWeather);
    }

    @Override
    public String getWeather() {
        // TODO Auto-generated method stub
        return nightWeather;
    }

}
