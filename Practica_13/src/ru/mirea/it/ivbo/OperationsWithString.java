package ru.mirea.it.ivbo;


public class OperationsWithString {
    public static void method(String str){
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(str.indexOf("!")) + str.substring(str.indexOf("Java")));
    }

    public static void main(String[] args) {
        method("I like Java!!!");
    }
}
