package ru.mirea.it.ivbo;

public class Main {
//    static int number = 123;
//    static String s = "Hello";
    public static void main(String[] args) {
        int[] number = new int[10];
        int[] nums = {1, 2, 3};

        System.out.println(number[0]);

        User[] users = {
                new User("admin", "admin"),
                new User("moderator","moderator"),
        };
        var i = 0;
        while(i < users.length){
            System.out.println(users[i]);
            i++;
        }
//        System.out.println(s);
//
//        User user = new User();
//        User user2 = new User("user2Username", "12341");
//
//        System.out.println(user.getUsername());
//
//        user.setUsername("Override");
//
//        System.out.println(user.getUsername());
//        System.out.println(user.getPassword());
//
//        System.out.println(user2.getUsername());
//
//        System.out.println(user.counter);
    }
}
