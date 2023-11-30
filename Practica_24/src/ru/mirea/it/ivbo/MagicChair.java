package ru.mirea.it.ivbo;

public class MagicChair implements Chair{
    public void doMagic(){
        System.out.println("magic...");
    }

    @Override
    public String getName() {
        return "Magic";
    }
}
