package practicalworks.first;
import java.util.Scanner;

public class Factorial {
    public static int count(int num){
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(count(num));
    }
}
