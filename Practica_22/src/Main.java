import ru.mirea.it.ivbo.Calculator;
import ru.mirea.it.ivbo.CalculatorUI;
import ru.mirea.it.ivbo.Excception;
import ru.mirea.it.ivbo.noResultException;

public class Main {
    public static void main(String[] args) throws noResultException {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.calc("22 3 4 5 6 * + - /"));
        CalculatorUI calculator = new CalculatorUI(new Excception());
    }
}