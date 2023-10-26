package ru.mirea.it.ivbo;

public class SortingStudentByGPA2 implements Comparable{
    Student[] iDNumber = new Student[]{
            new Student("A", "b", "f", 1, 23, 5, 1999, 11, 4, 23, 11, 22),
            new Student("B", "c", "s", 2, 9, 4,1998, 8, 11, 2, 14, 21),
            new Student("C", "d", "s", 2, 9, 3,1998, 6, 15, 9, 1, 1)
    };

    public void setArray(Student[] iDNumber) {
        System.arraycopy(iDNumber, 0, this.iDNumber, 0, iDNumber.length);
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    private void mergeSort2(Comparable[] array, int left, int right) {
        Comparable comp;
        int dlmtr = left + ((right - left) / 2) + 1;
        if (dlmtr > 0 && right > (left + 1)) {
            mergeSort2(array, left, dlmtr - 1);
            mergeSort2(array, dlmtr, right);
        }
        Comparable[] buf = new Comparable[right - left + 1];
        int cur = left;
        for (int i = 0; i < buf.length; i++) {
            if (dlmtr > right || array[cur].compareTo(array[dlmtr]) < 0) {
                buf[i] = array[cur];
                cur++;
            } else {
                buf[i] = array[dlmtr];
                dlmtr++;
            }
        }
        System.arraycopy(buf, 0, array, left, buf.length);
    }

    int partition2(Comparable[] array, int begin, int end) {
        int count = begin;
        for (int i = begin; i < end; i++) {
            if (array[i].compareTo(array[end]) < 0) {
                Comparable tmp = array[count];
                array[count] = array[i];
                array[i] = tmp;
                count++;
            }
        }
        Comparable tmp = array[end];
        array[end] = array[count];
        array[count] = tmp;
        return count;
    }

    private void quickSort2(Comparable[] array, int begin, int end) {
        if (end <= begin) return;
        int p = partition2(array, begin, end);
        quickSort2(array, begin, p - 1);
        quickSort2(array, p + 1, end);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
