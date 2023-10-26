package ru.mirea.it.ivbo;

import java.util.Date;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date curr_date = new Date();
        System.out.println("The current date: "+ curr_date);
        Date curr2_date = new Date();
        System.out.println("Enter year: ");
        int year = in.nextInt();
        System.out.println("Enter month (1-12): ");
        int month = in.nextInt();
        System.out.println("Enter date (1-31): ");
        int date = in.nextInt();
        System.out.println("Enter hours (0-23): ");
        int hrs = in.nextInt();
        System.out.println("Enter minutes (0-59): ");
        int min = in.nextInt();
        System.out.printf("%s %te %<tB %<tY\n", "The current date:", curr_date);
        Date new_date = new Date(year-1900, month-1, date, hrs, min);
        System.out.printf("%s %te %<tB %2$tY\n", "The entered date:", new_date);
        if(curr_date.compareTo(curr2_date) == 0)
            System.out.println("The current date is the same as the one entered");
    }
}
