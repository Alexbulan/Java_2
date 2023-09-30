package ru.mirea.it.ivbo;

public class Fahrenheit implements Convertable{
    double temperature;
    double newTemperature;

    public Fahrenheit(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Fahrenheit temperature = " + temperature +
                ", newTemperature = " + newTemperature;
    }

    @Override
    public void convert() {
        this.newTemperature = temperature * 1.8 + 32;
    }
}
