package ru.mirea.it.ivbo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generic {
    public static <T> List<T> convertToList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }

    public static <T> T getMemberOfArray(T [] array, int index){
        if(array.length > index && index >= 0)
            return array[index - 1];
        return null;
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[] {0, 1, 2, 3, 4, 5};
        String[] letters = new String[] {"a", "b", "c", "d", "e"};

        List<Integer> numsList = convertToList(nums);
        List<String> lettersList = convertToList(letters);

        System.out.println("List of nums: " + numsList);
        System.out.println("List of letters: " + lettersList);
        System.out.println("The second number of list of nums: " + getMemberOfArray(nums, 2));
        System.out.println("The ninth number of list of letters: " + getMemberOfArray(letters, 9));
    }
}
