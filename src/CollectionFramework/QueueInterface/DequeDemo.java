package CollectionFramework.QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>(); // faster iteration, low memory, no null allowed as compared to LinkedList
        // circular head and tail
        // no need to shift elements after remove just shift head and tail
        deque.addFirst(1);
        deque.addLast(2);
        deque.offerFirst(3);
        deque.offerLast(4);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.removeLast());


        Deque<Integer> deque1 = new LinkedList<>();  // good for insertion and deletion when we need to do it in middle

    }

}
