/**
 * @param x int 4
 */

import java.util.Arrays;

public class CustomArrayList <T>{

    private static final int DEFAULT_CAPACITY = 2;
    private T[] elements;
    private int size;

    public CustomArrayList() {
        this.elements =(T[]) new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
    public void add(T element){
        if (size == elements.length){
            grow();
        }
        elements[size] = element;
        size++;
    }
    public T get(int index){
        return elements[index];
    }
//    public void delete(int i){
//        size--;
//        if(size > i){
//            System.arraycopy(elements, i+1, elements);
//        }
//    }
    private void  grow() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }
}
