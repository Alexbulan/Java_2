import ru.mirea.it.ivbo.CustomMapImpl;

public class Main {
    public static void main(String[] args) {
        CustomMapImpl<String, Integer> map = new CustomMapImpl<>();
        map.put("0", 0);
        map.put("5", 5);
        map.put("8", 8);
        map.put("10", 10);
        map.put("11", 11);
        System.out.println(map.values());
    }
}