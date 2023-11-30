package ru.mirea.it.ivbo;

import java.util.Scanner;

public class INN {
    static boolean isCorrectINN(String INN){
        return INN.matches("^(?=.*\\d).{10,12}$");
    }
    static boolean isCorrectFIO(String FIO){
        return FIO.matches("^(?=.*[a-zA-Z]).{3,50}$");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter FIO:");
            String FIO = sc.next();
            System.out.println("Enter INN:");
            String INN = sc.next();
            if(!isCorrectINN(INN) || !isCorrectFIO(FIO)){
                throw new INNException();
            }else{
                System.out.println("INN and FIO is correct!");
            }
        }catch (INNException e){
            System.out.println(e.getMessage());
        }
    }
}
