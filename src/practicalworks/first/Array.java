package practicalworks.first;

import java.util.Scanner;

public class Array {
    static int[] arr = new int[10];
    static double sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum: " + sum + '\n' + "Mean: " + sum / 10);
    }
}
