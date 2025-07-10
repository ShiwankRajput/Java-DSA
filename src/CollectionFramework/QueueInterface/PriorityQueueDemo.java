package CollectionFramework.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        // part of QueueInterface
        // order elements based on natural ordering(for primitives  lowest first)
        // custom comparator for customized ordering
        // does not allow null elements

        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> y-x);
        pq.add(1);
        pq.add(5);
        pq.add(0);
        pq.add(10);
        System.out.println(pq);  // priorityQueue means head consist of priority element and for
        // integers it is lowest as possible or we can define comparator for deciding arrangement.
        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }

        /*

            Internal Working -->

            Priority Queue is implemented as min-heap by default (for natural ordering)

        */


    }

}
