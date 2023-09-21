import ru.mirea.it.ivbo.Matrix;
import ru.mirea.it.ivbo.Person;

public class Main {
    public static void main(String[] args) {
        double[][] arr = new double[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                arr[i][j] = i * j;
            }
        }
        Matrix matrix = new Matrix(arr, 10, 10);
        System.out.println(matrix);
        System.out.println("Hello world!");
    }

    Person person = new Person();
    Person person2 = new Person("Sasha", 18);
}