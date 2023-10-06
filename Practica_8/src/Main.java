import ru.mirea.it.ivbo.Recursions;

public class Main {
    public static void main(String[] args) {
        Recursions r = new Recursions();
        System.out.print("From 1 to 8:\n");
        r.oneToN(8);
        System.out.println("\n");
        r.sumOfNums(2122434234);
        System.out.printf("Sum of elements of '2122434234': %d\n", r.sumOfElements);
        System.out.print("\nFrom 10 to 25:\n");
        r.aToB(10, 25);
        System.out.print("\n\nWithout two '0': " + r.withoutTwoZero(3, 3));
    }}