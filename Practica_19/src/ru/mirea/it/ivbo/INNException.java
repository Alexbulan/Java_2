package ru.mirea.it.ivbo;

public class INNException extends RuntimeException {
    public INNException(){
        super("INN or FIO is not correct!");
    }
}
