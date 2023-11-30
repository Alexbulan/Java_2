package ru.mirea.it.ivbo;

import java.util.Stack;

public class Excception {
    public void clearResult() {
        result = 0;
    }

    private double result;
    private String exp;

    public double getResult() {
        return result;
    }

    public String getExpression() {
        return exp;
    }

    public void calc(String exp) throws noResultException {
        this.exp = exp;
        result = 0;
        Stack<Double> res = new Stack<>();
        String number = "";
        for (int i = 0; i < exp.length(); i++) {
            char symbol = exp.charAt(i);
            try {
                if (symbol != ' ' && symbol != '*' && symbol != '/' && symbol != '+' && symbol != '-') {
                    number += symbol;
                } else {
                    if(!number.equals("")) {
                        Double num = Double.parseDouble(number);
                        res.push(num);
                        number = "";
                    }
                    if (symbol != ' ') {
                        if (res.size() >= 2) {
                            double a = res.pop();
                            System.out.println(a);
                            double b = res.pop();
                            System.out.println(b);
                            switch (symbol){
                                case '+' -> result = a + b;
                                case '-' -> result = b - a;
                                case '*' -> result = a * b;
                                case '/' -> result = b / a;
                            }
                            res.push(result);
                        } else throw new noResultException();
                    }
                }
            }catch (Exception e) {
                throw new noResultException();
            }
        }
        result = res.pop();
    }
}