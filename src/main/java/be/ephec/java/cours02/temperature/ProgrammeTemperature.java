package be.ephec.java.cours02.temperature;

public class ProgrammeTemperature {
    public static void main(String[] args) {
        Temperature t1 = new Temperature(10, TemperatureUnit.CELSIUS);
        Temperature t2 = new Temperature(23, TemperatureUnit.FARENHEIT);

        System.out.printf("%.2f °C = %.2f °F %n", t1.getValue(TemperatureUnit.CELSIUS), t1.getValue(TemperatureUnit.FARENHEIT));
        System.out.printf("%.2f °F = %.2f °C %n", t2.getValue(TemperatureUnit.FARENHEIT), t2.getValue(TemperatureUnit.CELSIUS));

    }
}
