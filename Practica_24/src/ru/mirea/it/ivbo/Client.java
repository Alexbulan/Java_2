package ru.mirea.it.ivbo;

public class Client {
    public Chair chair;

    public void sit(){
        System.out.println("Your chair - " + chair.getName());
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

}
