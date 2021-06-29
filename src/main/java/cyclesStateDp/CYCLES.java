package cyclesStateDp;

public class CYCLES {
    private CYCLESTATE stateS;
    private String weather;

    public CYCLES(CYCLESTATE state) {
        stateS = state;
        weather = state.getWeather();
    }

    public void changeWeather() {
        stateS.changeWeather(this);
        weather = stateS.getWeather();
    }

    public void changeCycle() {
        stateS.changeCycle(this);
        weather = stateS.getWeather();
    }

    public String getWeather() {
        return weather;
    }

    public void setState(CYCLESTATE s) {
        stateS = s;
    }

}
