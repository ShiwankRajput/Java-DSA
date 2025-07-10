package CollectionFramework.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueInterfaceDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        System.out.println(queue.size());

        System.out.println(queue.remove());  // throws exception if isEmpty
        System.out.println(queue.poll());    // it does not

        queue.add(2);
        System.out.println(queue.element());  // throws exception if isEmpty
        System.out.println(queue.peek());     // it does not




        Queue<Integer> queue1 = new ArrayBlockingQueue<>(2);
        System.out.println(queue1.add(1));
        System.out.println(queue1.offer(2));
        System.out.println(queue1.offer(3));  //returns false as it does not add elements but if we use add(),
                                                // then it throws exception


    }

}
