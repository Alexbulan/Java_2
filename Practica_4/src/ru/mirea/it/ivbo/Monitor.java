package ru.mirea.it.ivbo;

public class Monitor {
    private Brands brand;
    private int frequency;

    public Monitor(Brands brand, int frequency) {
        this.brand = brand;
        this.frequency = frequency;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
