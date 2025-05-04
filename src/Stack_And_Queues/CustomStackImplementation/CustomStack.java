package Stack_And_Queues.CustomStackImplementation;

public class CustomStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    private int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int value) throws StackException{
        if(isFull()){
            throw new StackException("Stack is Full, cannot push");
        }

        ptr++;
        data[ptr] = value;

        return true; // element is inserted
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty, cannot pop");
        }

        int removed = data[ptr];
        ptr--;

        return removed;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is empty, cannot peek an element.");
        }

        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length-1;  //ptr is at last of data array or stack
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
