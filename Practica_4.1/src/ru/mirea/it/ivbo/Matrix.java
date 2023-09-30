package ru.mirea.it.ivbo;

import java.util.Arrays;

public class Matrix {
    private final double[][] array = new double[10][10];
    private final int lines;
    private final int columns;

    public Matrix(double[][] array, int lines, int columns) {
        for (int i = 0; i < lines; i++) {
            if (columns >= 0) System.arraycopy(array[i], 0, this.array[i], 0, columns);
        }
        this.lines = lines;
        this.columns = columns;
    }

    public void addition(double[][] array2) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] += array2[i][j];
            }
        }
    }

    public void multiplicationByNumber(int num) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] *= num;
            }
        }
    }

    public double[][] multiplication(double[][] array2) {
        double[][] array3 = new double[array.length][array[0].length];
        for (int i = 0; i < array3[0].length; i++)
            for (int j = 0; j < array3.length; j++)
                for (int k = 0; k < array[0].length; k++)
                    array3[i][j] = array3[i][j] + array[i][k] * array2[k][j];
        return array3;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                res += array[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }
}
