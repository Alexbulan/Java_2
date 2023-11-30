package ru.mirea.it.ivbo;

public class VictorianChair implements Chair {
    public int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return "Victorian with age " + age;
    }
}
