package ru.mirea.it.ivbo;

import java.util.Calendar;
import java.util.Date;

public class LabClassDriver {
    public static void main(String[] args) {
        Student student1 = new Student("Alex", "Bbbbb");
        Student student2 = new Student("Boris", "Ccccc");
        Student student3 = new Student("Clay", "Ddddd");
        Student student4 = new Student("Name", "Surname");
        Student[] students = new Student[]{student1, student2, student3, student4};
        for (Student student : students) {
            System.out.println(student);
        }
        LabClassUI labClassUI = new LabClassUI(students);
    }
}
