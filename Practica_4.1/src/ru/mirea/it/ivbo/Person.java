package ru.mirea.it.ivbo;

public class Person {
    private String fullName;
    private int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public void move(){
        System.out.println(fullName + " двигается");
    }

    public void talk(){
        System.out.println(fullName + " говорит");
    }
}
