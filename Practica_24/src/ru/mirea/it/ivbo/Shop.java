package ru.mirea.it.ivbo;

public class Shop {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Client client = new Client();
        VictorianChair v = chairFactory.createVictorianChair();
        FunctionalChair f = chairFactory.createFunctionalChair();
        MagicChair m = chairFactory.createMagicChair();
        System.out.println("Age: " + v.getAge());
        client.setChair(v);
        client.sit();
        System.out.println("Sum: " + f.sum(2,3));
        client.setChair(f);
        client.sit();
        client.setChair(m);
        client.sit();
        m.doMagic();
    }
}
