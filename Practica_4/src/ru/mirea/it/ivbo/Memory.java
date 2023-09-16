package ru.mirea.it.ivbo;

public class Memory {
    private Brands brand;
    private int capacity;
    private int frequency;
    private int vacant_space;

    public Memory(Brands brand, int capacity, int frequency, int vacant_space) {
        this.brand = brand;
        this.capacity = capacity;
        this.frequency = frequency;
        this.vacant_space = vacant_space;
    }

    public Brands getBrand() {
        return brand;
    }

    public void setBrand(Brands brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getVacant_space() {
        return vacant_space;
    }

    public void setVacant_space(int vacant_space) {
        this.vacant_space = vacant_space;
    }
}
