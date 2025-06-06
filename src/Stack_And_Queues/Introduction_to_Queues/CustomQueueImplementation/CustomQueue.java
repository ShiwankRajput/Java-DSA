package Stack_And_Queues.Introduction_to_Queues.CustomQueueImplementation;

public class CustomQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int value) throws Exception{
        if(isFull()){
            throw new Exception("Queue is full");
        }

        data[end] = value;
        end++;

        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty, cannot remove item.");
        }

        int removed = data[0];

        //shifting elements to adjacent left
        for (int i=1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;

        return removed;

    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty, cannot see the front element");
        }

        return data[0];

    }

    public void display(){
        for (int i=0; i<end; i++){
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }

}
