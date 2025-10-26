package Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Wildcards_InGenerics {

    public static void main(String[] args) {

        // Unknown wildcard :-
        printList(new ArrayList<String>());
        printList(new LinkedList<Integer>());

        // Upper Bounded wildcard :-
        process(new ArrayList<Double>());

        // Lower Bounded wildcard :-
        addNumbers(new ArrayList<>());


    }

    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }

    public static void process(List<? extends Number> list){
        for(Number number:list){
            System.out.println(number.doubleValue());
        }
    }

    public static void addNumbers(List<? super Integer> list){
        list.add(11);
        list.add(12);
    }

}
