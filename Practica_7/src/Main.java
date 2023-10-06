import ru.mirea.it.ivbo.MathCalculable;
import ru.mirea.it.ivbo.MathFunc;
import ru.mirea.it.ivbo.ProcessStrings;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc(5);
        System.out.println(mc1.exponentiation(2.1, 4));
        MathFunc m = new MathFunc(5);
        System.out.println(m.lengthOfCirc());
        System.out.println("Hello world!");
        ProcessStrings ps = new ProcessStrings();
        System.out.println(ps.countingCharacters("Hello world!", 'l'));
        System.out.println(ps.inverting("Hello world!"));
        System.out.println(ps.stringOfOddCharacters("Hello world!"));
    }
}