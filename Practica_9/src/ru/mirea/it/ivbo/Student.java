package ru.mirea.it.ivbo;

import java.util.Date;
import java.util.Scanner;

public class Student {
    private String name;
    private String surname;
    private String specialization;
    private int course;
    private int group;
    private int mark;
    private Date hbdate;

    public Student(String name, String surname, String specialization, int course, int group, int mark, int y, int m, int d, int h, int min, int sec) {
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.course = course;
        this.group = group;
        this.mark = mark;
        this.hbdate = new Date(y - 1900, m - 1, d, h, min, sec);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public Date getHbdate() {
        return hbdate;
    }

    public void setHbdate(Date hbdate) {
        this.hbdate = hbdate;
    }

    @Override
    public String toString() {
        Scanner in = new Scanner(System.in);
        String type_date = in.nextLine();
        String res = "Student " + name + " " + surname + "\n" +
                "specialization: " + specialization + "\n" +
                "course: " + course + "\n" +
                "group: " + group + "\n";
        switch (type_date) {
            case "short" -> {
                return  res + String.format("%s %te %<tB\n", "date of birth: ", hbdate);
            }
            case "medium" -> {
                return res + String.format("%s %te %<tB %<tY\n", "date of birth: ", hbdate);
            }
            case "full" -> {
                return res + String.format("%s %te %<tB %<tY %<tT\n", "date of birth: ", hbdate);
            }
            default -> {
                return res;
            }
        }
    }
}
