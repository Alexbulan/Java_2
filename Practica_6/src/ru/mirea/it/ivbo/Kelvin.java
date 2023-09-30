package ru.mirea.it.ivbo;

public class Kelvin implements Convertable{
    double temperature;
    double newTemperature;

    @Override
    public String toString() {
        return "Kelvin temperature = " + temperature +
                ", newTemperature=" + newTemperature;
    }

    public Kelvin(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void convert() {
        this.newTemperature = temperature + 273;
    }
}
