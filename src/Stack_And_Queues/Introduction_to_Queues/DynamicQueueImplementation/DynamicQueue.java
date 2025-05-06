package Stack_And_Queues.Introduction_to_Queues.DynamicQueueImplementation;

import Stack_And_Queues.Introduction_to_Queues.CircularQueueImplementation.CircularQueue;

public class DynamicQueue extends CircularQueue {

    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int value) throws Exception {

        //just doubling the size of array if stack is full
        if(isFull()){
            int[] temp = new int[data.length * 2];

            for (int i=0; i<data.length; i++){
                temp[i] = data[(front + i) % data.length];
            }

            front = 0;
            end = data.length;

            data = temp;  //changing reference after transfer of element to temp

        }

        // at this point we know that stack is not full
        return super.insert(value);
    }
}
