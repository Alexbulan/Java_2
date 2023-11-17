import ru.mirea.it.ivbo.JenerikClass;

public class Main {
    public static void main(String[] args) {
        JenerikClass<Integer,String,Double> jClass = new JenerikClass<>(1, "abcd", 2.5);
        jClass.returnClassName();
    }
}