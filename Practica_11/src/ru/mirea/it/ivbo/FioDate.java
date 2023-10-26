package ru.mirea.it.ivbo;

import java.util.Date;
import java.util.Scanner;

public class FioDate {
    static void inputFio() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter FIO: ");
        String fio = in.nextLine();
        System.out.println("FIO: " + fio);
    }
    static void getDateOfBeginTask() {
        Date getDateOfTask = new Date();
        System.out.printf("%s %te %<tB %<tY %<tT\n", "Date of begin:", getDateOfTask);
    }
    static void getDateOfFinishTask() {
        Date getDateOfFinishTask = new Date();
        getDateOfFinishTask = new Date(getDateOfFinishTask.getTime() + (3600 * 24 * 1000 * 7));
        System.out.printf("%s %te %<tB %<tY %<tT\n","Date of finish task:", getDateOfFinishTask);
    }
    public static void main(String[] args) {
        inputFio();
        getDateOfBeginTask();
        getDateOfFinishTask();
    }
}
