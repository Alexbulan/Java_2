public class Main {
    public static void main(String[] args) {

        CustomArrayList<User> users = new CustomArrayList<>();
        CustomArrayList<Integer> numbers = new CustomArrayList<>();

        var user1 = new User("test1", "test1", 18);
        var user2 = new User("test2", "test2", 20);
        var user3 = new User("test3", "test3", 22);

        users.add(user1);
        users.add(user2);
        users.add(user3);

        int exampleNumber = 6;

        numbers.add(1);
        numbers.add(2);
        numbers.add(exampleNumber);

        System.out.println(users);
    }
}