package Stack_And_Queues.Introduction_to_Stack.Questions;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
// minimum number of parentheses that can be added to make it valid.

import java.util.Stack;

public class MinAddParenthesesValid {

    public int minAddToMakeValid(String s){

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == ')'){
                if(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
        }

        return stack.size();

    }

}
