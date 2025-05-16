package Stack_And_Queues.Introduction_to_Stack.Questions;

// https://leetcode.com/problems/valid-parentheses/

/*

    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string
    is valid.

    An input string is valid if:

    (1) Open brackets must be closed by the same type of brackets.
    (2) Open brackets must be closed in the correct order.
    (3) Every close bracket has a corresponding open bracket of the same type.

*/

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(ch==')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                }
                if(ch=='}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }
                if(ch==']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();

    }

}
