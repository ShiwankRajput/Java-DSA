package Stack_And_Queues.Introduction_to_Stack.Questions;


import java.util.Stack;


//https://leetcode.com/problems/implement-queue-using-stacks/
// (1) - Implement queue using stacks :-

/*

 * Your QueueUsingStack object will be instantiated and called as such:
 * QueueUsingStack obj = new QueueUsingStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();

 */

public class QueueUsingStack {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x);
    }

    public int pop() {
        while(!first.empty()){
            second.push(first.pop());
        }

        int removed = second.pop();

        while(!second.empty()){
            first.push(second.pop());
        }

        return removed;
    }

    public int peek() {

        while(!first.empty()){
            second.push(first.pop());
        }

        int peeked = second.peek();

        while(!second.empty()){
            first.push(second.pop());
        }

        return peeked;

    }

    public boolean empty() {
        return first.empty();
    }

}
