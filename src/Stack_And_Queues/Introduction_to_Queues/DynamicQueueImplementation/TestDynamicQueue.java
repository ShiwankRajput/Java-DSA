package Stack_And_Queues.Introduction_to_Queues.DynamicQueueImplementation;

public class TestDynamicQueue {

    public static void main(String[] args) throws Exception{

        DynamicQueue queue = new DynamicQueue(5);

        queue.insert(15);
        queue.insert(17);
        queue.insert(18);
        queue.insert(19);
        queue.insert(120);
        queue.insert(11);

        queue.display();
        queue.remove();
        queue.display();
        System.out.println(queue.front());

    }

}
