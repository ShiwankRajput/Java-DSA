package Stack_And_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class inBuiltQueueExample {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(14);
        queue.add(16);
        queue.add(9);
        queue.add(5);
        queue.add(24);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        Deque<String> deque = new ArrayDeque<>();
        deque.add("Shiwank");
        deque.addLast("Dev");
        deque.add("Kumar");
        deque.remove();
        System.out.println(deque.getFirst());


    }

}
