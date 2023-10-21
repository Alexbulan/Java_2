import ru.mirea.it.ivbo.SortingStudentsByGPA;
import ru.mirea.it.ivbo.Student;

public class Main {
    public static void main(String[] args) {
        Student[] iDNumber = new Student[]{
                new Student("A", "b", "f", 1, 23, 1, 1999, 11, 4, 23, 11, 22),
                new Student("B", "c", "s", 2, 9, 2,1998, 8, 11, 2, 14, 21),
                new Student("C", "d", "s", 2, 9, 3,1998, 6, 15, 9, 1, 1)
        };
        System.out.println("Hello world!");
        SortingStudentsByGPA s = new SortingStudentsByGPA();
        s.setArray(iDNumber);
        s.outArray();
        iDNumber = s.mergeSort(iDNumber, 0, iDNumber.length-1);
        s.outArray();
    }
}