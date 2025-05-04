package Stack_And_Queues.Introduction_to_Stack.DynamicStackImplementation;

import Stack_And_Queues.Introduction_to_Stack.CustomStackImplementation.CustomStack;
import Stack_And_Queues.Introduction_to_Stack.CustomStackImplementation.StackException;

public class DynamicStack extends CustomStack {

    public DynamicStack(){
        super(); // it will call CustomStack()
    }

    public DynamicStack(int size){
        super(size);  // it will call CustomStack(int size);
    }

    @Override
    public boolean push(int value) throws StackException {

        //just doubling the size of array if stack is full
        if(isFull()){
            int[] temp = new int[data.length * 2];

            for (int i=0; i<data.length ; i++){
                temp[i] = data[i];
            }

            data = temp;  //changing reference after transfer of element to temp

        }

        // at this point we know that stack is not full
        return super.push(value);


    }
}
