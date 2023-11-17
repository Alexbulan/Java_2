package ru.mirea.it.ivbo;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String name, String surname) {
        super("Student  with name \"" + name + "\" and surname \"" + surname + "\" - not found!");
    }
}
