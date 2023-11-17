package ru.mirea.it.ivbo;

public class EmptyStringException  extends IllegalArgumentException {
    public EmptyStringException(){
        super("The line is empty!");
    }
}
