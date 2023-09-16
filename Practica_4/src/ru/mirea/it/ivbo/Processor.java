package ru.mirea.it.ivbo;

public class Processor {
    private Brands brand;
    private int coresCount;
    private int frequency;

    public Processor(Brands brand, int cores, int frequency) {
        this.brand = brand;
        this.coresCount = cores;
        this.frequency = frequency;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public int getCores() {
        return coresCount;
    }

    public void setCores(int cores) {
        this.coresCount = cores;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
