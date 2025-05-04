package Stack_And_Queues.Introduction_to_Stack.CustomStackImplementation;

public class TestCustomStack {

    public static void main(String[] args) throws Exception {

        CustomStack stack = new CustomStack(4);

        stack.push(15);
        stack.push(120);
        stack.push(53);
        stack.push(17);

        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

    }

}
