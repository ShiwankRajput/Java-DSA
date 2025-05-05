package Stack_And_Queues.Introduction_to_Queues.CircularQueueImplementation;

public class TestCircularQueue {

    public static void main(String[] args) throws Exception{

        CircularQueue queue = new CircularQueue(5);

        queue.insert(87);
        queue.insert(15);
        queue.insert(10);
        queue.insert(11);
        queue.insert(17);

        queue.display();
        queue.remove();
        queue.display();
        queue.insert(19);
        queue.display();

        System.out.println(queue.front());

    }

}
