package ru.mirea.it.ivbo;

import java.util.Scanner;
import java.util.random.RandomGenerator;
public class Poker {
    static int n;
    static String[] deck = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "V", "D", "K", "T"};
    static int[] count = new int[13];

    public static void distribution(int n) {
        int k;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                k = RandomGenerator.getDefault().nextInt(0, 13);
                count[k] += 1;
                while (count[k] > 4) {
                    k = RandomGenerator.getDefault().nextInt(0, 13);
                    count[k] += 1;
                }
                System.out.print(deck[k] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        n = scanner.nextInt();
        distribution(n);
    }
}

