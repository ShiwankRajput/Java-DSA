package Stack_And_Queues.Introduction_to_Stack;

import java.util.Stack;

public class InBuiltStackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(52);
        stack.push(23);
        stack.push(45);
        stack.push(12);
        stack.push(36);

        stack.pop();
        stack.pop();
        stack.pop();

        for (int i=0; i<stack.size(); i++){
            System.out.print(stack.get(i)+" ");
        }


    }

}
