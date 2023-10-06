package ru.mirea.it.ivbo;

public class MathFunc implements MathCalculable{
    double r = 1;

    public MathFunc(double r) {
        this.r = r;
    }

    @Override
    public double exponentiation(double num, int n) {
        double res = 1;
        for(int i = 1; i < n; i++) res *= num;
        return res;
    }

    @Override
    public double moduleOfComplexNumber(int a, int b) {
        return (exponentiation(a, 2) + exponentiation(b, 2)) * 0.5;
    }
    public double lengthOfCirc(){
        return 2 * PI * r;
    }
}
