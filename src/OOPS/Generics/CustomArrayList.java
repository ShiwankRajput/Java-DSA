package OOPS.Generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
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
        int[] temp = new int[data.length * 2];

        for (int i=0; i<data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
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

        //in-built arrayList -->

//        ArrayList list = new ArrayList();
//        list.add(10);
//        list.add(15);
//        list.add(24);
//        list.get(0);
//        list.set(0,11);
//        System.out.println(list.size());
//
//        System.out.println(list);

        //custom ArrayList -->

        CustomArrayList list1 = new CustomArrayList();
        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.get(1);
        list1.set(1,11);
        System.out.println(list1.size());
        System.out.println(list1);

    }
}
