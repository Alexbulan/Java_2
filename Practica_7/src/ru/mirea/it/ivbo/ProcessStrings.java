package ru.mirea.it.ivbo;

public class ProcessStrings implements StringWorkable{
    @Override
    public int countingCharacters(String s, char k) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == k) count++;
        }
        return count;
    }

    @Override
    public String stringOfOddCharacters(String s) {
        StringBuilder new_s = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 != 0) new_s.append(s.charAt(i));
        }
        return new_s.toString();
    }

    @Override
    public String inverting(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
