package Stack_And_Queues.Introduction_to_Queues.CircularQueueImplementation;

public class CircularQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int end = 0;
    private int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int value) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full, cannot insert element");
        }

        data[end] = value;
        end++;
        end = end % data.length;

        size++;

        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty, cannot remove element");
        }

        int remove = data[front];
        front++;
        front = front % data.length;

        size--;

        return remove;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty, cannot see the front element");
        }

        return data[front];

    }

    public void display(){

        if(isEmpty()){
            System.out.println("Queue is empty, cannot display");
            return;
        }

        int i=front;

        do{
            System.out.print(data[i] + " -> ");
            i++;
            i = i % data.length;
        }while (i != end);

        System.out.println("END");

    }


}
