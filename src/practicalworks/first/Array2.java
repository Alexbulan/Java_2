package practicalworks.first;

import java.util.Scanner;

public class Array2 {
    static int[] arr = new int[10];
    static int sum = 0, max = -1_000_000_000, min = 1_000_000_000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 10){
            arr[i] = sc.nextInt();
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            sum += arr[i];
            i++;
        }
        System.out.println("Sum: " + sum + '\n' + "Max: " + max + '\n' + "Min: " + min);
    }
}
