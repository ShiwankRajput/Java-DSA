package CollectionFramework.ListInterface.Stack;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        int popped = stack.pop();
        System.out.println(popped);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.size());

        System.out.println(stack.search(3));  // it searches from top of stack but consider index as 1 from top

    }

}
