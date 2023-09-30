package ru.mirea.it.ivbo;

public class Book implements Priceable{
    double price;

    public Book(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book`s price is " + getPrice();
    }
    @Override
    public double getPrice() {
        return price;
    }
}
