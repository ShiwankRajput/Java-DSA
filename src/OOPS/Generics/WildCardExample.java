package OOPS.Generics;

import java.util.Arrays;

// here T should be Numbers or it's subclasses
public class WildCardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }


    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size] = num;
        size++;
    }

    public Boolean isFull(){
        return data.length == size;
    }

    public void resize(){
        Object[] temp = new Object[data.length * 2];

        for (int i=0; i<data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove(){
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index){
        return (T) (data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        WildCardExample<Integer> list = new WildCardExample<>();
        list.add(15);
        list.add(45);
        list.get(0);
        System.out.println(list);

//        WildCardExample<String> list2 = new WildCardExample<String>();

        WildCardExample<Float> list2 = new WildCardExample<>();
        list2.add(25.36f);
        list2.add(45.36f);
        System.out.println(list2);
    }

}
