package ru.mirea.it.ivbo;

import java.util.Objects;

public class LabClass {
    public Student[] students;

    public LabClass(Student[] students) {
            this.students = students;
    }

    public Student searchStudent(String name, String surname) throws StudentNotFoundException {
        Student newStudent = new Student(name, surname);
        for (Student student : students) {
            if (Objects.equals(newStudent.getName(), student.getName()) && Objects.equals(newStudent.getSurname(), student.getSurname()))
                return student;
        }
        throw new StudentNotFoundException(name, surname);
    }
}
