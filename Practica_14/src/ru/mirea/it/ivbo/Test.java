package ru.mirea.it.ivbo;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        Pattern p = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m = p.matcher(s);
        System.out.println(s + ": " + m.matches());

        Pattern p1 = Pattern.compile("\\+\\s*\\d+");
        String s1 = in.nextLine();
        Matcher m1 = p1.matcher(s1);
        System.out.println(s1 + ": " + m1.find());

        String date = in.nextLine();
        Pattern p2 = Pattern.compile("(\\d{2})\\W(\\d{2})\\W(\\d{4})");
        Matcher m2 = p2.matcher(date);
        System.out.println(date + ": " + m2.find());
        Pattern p3 = Pattern.compile("^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/((?:1[6-9]|[2-9]\\d)\\d{2})$");
        Matcher m3 = p3.matcher(date);
        System.out.println(date + ": " + m3.find());


//        StringTokenizer st = new StringTokenizer(date,"/");
//        int count = 0;
//        while(st.hasMoreTokens()){
//            int s = Integer.parseInt(st.nextToken());
//            count += 1;
//            if(count == 3){
//                if (1900 <= s & s<= 9999){
//                    System.out.println(s);
//                }
//            }else{
//                System.out.println("Incorrect format");
//            }
//        }
    }
}
