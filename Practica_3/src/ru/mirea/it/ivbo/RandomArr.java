package ru.mirea.it.ivbo;

import java.util.Random;
import java.util.Scanner;

public class RandomArr {
    static double[] array = new double[20];

    static void byMath(){
        for (int i = 0; i < 20; i++) {
            array[i] = Math.random();
        }
    }
    static void byRandom(){
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextDouble();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose method of generation: (1 - by Math, 2 - by Random)");
        int flag = sc.nextInt();
        if (flag == 1){
            byMath();
        }
        else if(flag == 2){
            byRandom();
        }
        else{
            System.out.println("Error!");
        }
        for (double a : array) {
            System.out.printf("%1$8.5f%n", a);
        }
    }
}
