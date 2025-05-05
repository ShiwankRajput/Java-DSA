package Stack_And_Queues.Introduction_to_Queues.CustomQueueImplementation;

public class TestCustomQueue {

    public static void main(String[] args) throws Exception{

        CustomQueue queue = new CustomQueue(5);

        queue.insert(87);
        queue.insert(15);
        queue.insert(10);
        queue.insert(13);
        queue.insert(17);

        System.out.println(queue.front());

        queue.remove();
        queue.remove();

        System.out.println(queue.front());
        System.out.println(queue.isFull());
        System.out.println(queue.isEmpty());
        queue.display();


    }


}
