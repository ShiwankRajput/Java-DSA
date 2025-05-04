package Stack_And_Queues.Introduction_to_Stack.DynamicStackImplementation;

import Stack_And_Queues.DynamicStackImplementation.DynamicStack;
import Stack_And_Queues.Introduction_to_Stack.CustomStackImplementation.StackException;

public class TestDynamicStack {

    public static void main(String[] args) throws StackException {

        Stack_And_Queues.DynamicStackImplementation.DynamicStack stack = new DynamicStack(4);

        stack.push(15);
        stack.push(120);
        stack.push(53);
        stack.push(17);
        stack.push(51);
        stack.push(11);
        stack.push(89);

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

    }

}
