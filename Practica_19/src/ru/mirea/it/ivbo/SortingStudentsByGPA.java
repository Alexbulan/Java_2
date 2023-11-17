package ru.mirea.it.ivbo;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
//    Student[] iDNumber = new Student[]{
//            new Student("A", "b", "f", 1, 23, 5, 1999, 11, 4, 23, 11, 22),
//            new Student("B", "c", "s", 2, 9, 4,1998, 8, 11, 2, 14, 21),
//            new Student("C", "d", "s", 2, 9, 3,1998, 6, 15, 9, 1, 1)
//    };
//    public void setArray(Student[] iDNumber) {
//        for(int i = 0; i < iDNumber.length; i++) {
//            this.iDNumber[i] = iDNumber[i];
//        }
//    }
//
//    public void outArray() {
//        for (Student student : iDNumber) {
//            System.out.println(student);
//        }
//    }
    @Override
    public int compare(Student o1, Student  o2) {
        return 0;
    }

    public Student[] mergeSort(Student[] array, int left, int right) {
        int dlmtr = left + ((right - left) / 2) + 1;
        if (dlmtr > 0 && right > (left + 1)) {
            mergeSort(array, left, dlmtr - 1);
            mergeSort(array, dlmtr, right);
        }
        Student[] buf = new Student[right - left + 1];
        int cur = left;
        for (int i = 0; i < buf.length; i++) {
            if (dlmtr > right || compare(array[cur], array[dlmtr]) < 0) {
                buf[i] = array[cur];
                cur++;
            } else {
                buf[i] = array[dlmtr];
                dlmtr++;
            }
        }
        System.arraycopy(buf, 0, array, left, buf.length);
        return array;
    }

    int partition(Student[] array, int begin, int end) {
        int count = begin;
        for (int i = begin; i < end; i++) {
            if (compare(array[i], array[end]) < 0) {
                Student tmp = array[count];
                array[count] = array[i];
                array[i] = tmp;
                count++;
            }
        }
        Student tmp = array[end];
        array[end] = array[count];
        array[count] = tmp;
        return count;
    }

    public void quickSort(Student[] array, int begin, int end) {
        if (end <= begin) return;
        int p = partition(array, begin, end);
        quickSort(array, begin, p - 1);
        quickSort(array, p + 1, end);
    }

//    public static void main(String[] args) {
//        SortingStudentsByGPA s = new SortingStudentsByGPA();
//        s.outArray();
//        s.iDNumber = s.mergeSort(s.iDNumber, 0, s.iDNumber.length-1);
//        s.outArray();
//        s.quickSort(s.iDNumber, 0, s.iDNumber.length-1);
//        s.outArray();
//    }
}
