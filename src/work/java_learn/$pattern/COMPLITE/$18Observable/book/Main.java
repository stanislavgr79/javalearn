package work.java_learn.$pattern.COMPLITE.$18Observable.book;

public class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        weatherData.setMeasurements(33, 44, 55);
        weatherData.registerObserver(new CurrentConditionDisplay(weatherData));
//        new CurrentConditionDisplay(weatherData);
        weatherData.notifyObservers();
    }
}
