package work.$pattern.COMPLITE.$18Observable.book;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
//        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("\nCurrent: temperature %fF, humidity %f"
                ,temperature, humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
}
