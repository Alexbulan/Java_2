package ru.mirea.it.ivbo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Converter {
    static double curr;
    static int num;

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a currency:\n 1 - Rubles\n 2 - Dollars\n 3 - Euros\n 4 - Pounds");
        num = sc.nextInt();
        switch (num) {
            case 1 -> {
                System.out.println("Enter amount in rubles:");
                curr = sc.nextFloat();
                System.out.println("Dollar: " + f.format(curr / 96.16));
                System.out.println("Euro: " + f.format(curr / 103.23));
                System.out.println("Pounds: " + f.format(curr / 120.11));
            }
            case 2 -> {
                System.out.println("Enter amount in dollars:");
                curr = sc.nextFloat();
                System.out.println("Ruble: " + f.format(curr * 96.16));
                System.out.println("Euro: " + f.format(curr * 0.931531));
                System.out.println("Pounds: " + f.format(curr * 0.80064));
            }
            case 3 -> {
                System.out.println("Enter amount in euros:");
                curr = sc.nextFloat();
                System.out.println("Ruble: " + f.format(curr * 103.23));
                System.out.println("Dollar: " + f.format(curr * 1.07));
                System.out.println("Pounds: " + f.format(curr * 0.859489));
            }
            case 4 -> {
                System.out.println("Enter amount in pounds:");
                curr = sc.nextFloat();
                System.out.println("Ruble: " + f.format(curr * 120.11));
                System.out.println("Dollar: " + f.format(curr * 1.25));
                System.out.println("Euro: " + f.format(curr * 1.16));
            }
            default -> System.out.println("Try again...");
        }
    }
}
