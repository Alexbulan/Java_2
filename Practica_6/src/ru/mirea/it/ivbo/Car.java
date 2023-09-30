package ru.mirea.it.ivbo;

public class Car implements Priceable{
    double price;

    public Car(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car`s price is " + getPrice();
    }

    @Override
    public double getPrice() {
        return price;
    }
}
