package be.ephec.java.cours02.temperature;

public class Temperature {

    private double temperature;
    private TemperatureUnit unit;

    public Temperature(double temperature, TemperatureUnit unit) {
        this.temperature = temperature;
        this.unit = unit;
    }

    public double getValue(TemperatureUnit unit) {
        if (this.unit == unit)
            return temperature;
        else if (unit == TemperatureUnit.CELSIUS && this.unit == TemperatureUnit.FARENHEIT) {
            // y = (x – 32) * 5/9
            return (temperature - 32) * 5. / 9;
        } else if (unit == TemperatureUnit.FARENHEIT && this.unit == TemperatureUnit.CELSIUS) {
            // y = x*9/5 + 32
            return temperature * 9. / 5 + 32;
        } else return Double.NaN;
    }

    public void setValue(double temperature, TemperatureUnit unit) {
        this.unit = unit;
        this.temperature = temperature;
    }
}

