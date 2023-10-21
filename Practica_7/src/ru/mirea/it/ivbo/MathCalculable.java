package ru.mirea.it.ivbo;

public interface MathCalculable {
    double moduleOfComplexNumber(int a, int b);
    double PI = 3.14159;
    default double exponentiation(double num, int n) {
        double res = 1;
        for(int i = 1; i < n; i++) res *= num;
        return res;
    }
}
