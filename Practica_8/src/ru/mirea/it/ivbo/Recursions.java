package ru.mirea.it.ivbo;

public class Recursions {
    public int sumOfElements = 0;
// Без двух нулей
    public int withoutTwoZero(int a, int b) {
        if (a > b + 1) return 0;
        if (a == 0 || b == 0) return 1;
        return withoutTwoZero(a, b - 1) + withoutTwoZero(a - 1, b - 1);
    }

// от 1 до n
    public void oneToN(int n) {
        if (n != 1) oneToN(n - 1);
        System.out.printf("%s ", n);
    }

// от A до B
    public void aToB(int a, int b) {
        if (b != a) aToB(a, b - 1);
        System.out.printf("%s ", b);
    }

// Сумма цифр числа
    public void sumOfNums(int n){
        if(n / 10 != 0) sumOfNums(n / 10);
        sumOfElements += n % 10;
    }
}
