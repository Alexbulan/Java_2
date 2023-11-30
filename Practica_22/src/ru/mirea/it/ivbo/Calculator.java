package ru.mirea.it.ivbo;

import java.util.Stack;

public class Calculator {

    private double result;
    private String line;

    public double calc(String line) throws noResultException {
        this.line = line;
        result = 0;
        String number = "";
        Stack<Double> res = new Stack<>();
        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
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
                            double b = res.pop();
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
        return result;
    }
}
