package Generics;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericsArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    private CustomGenericsArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new Array.
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull(){
        return size == data.length;
    }
    public T remove(){
        T remove = (T)data[--size];
        return remove;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArrayList{" +
                "data= " + Arrays.toString(data) +
                ", size= " + size +
                '}';
    }

    public static void main(String[] args) {
        // Internal ArrayList provided in Java.
        // ArrayList list = new ArrayList();

        CustomGenericsArrayList<Integer> list2 = new CustomGenericsArrayList<>();
//        list2.add(3);
//        list2.add(5);
//        list2.add(9);
        for (int i = 0; i < 14; i++) {
            list2.add(2 * i);
        }
        System.out.println(list2);
    }
}
