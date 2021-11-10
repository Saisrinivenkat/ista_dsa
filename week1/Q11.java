package ISTA.week1;

import java.util.Stack;

public class Q11 {
    //Valid Parentheses
    //testcase:
    //Input: s = "()"
    //Output: true

    class Solution {
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<Character>();

            for(char i : s.toCharArray()){
                // if(i == '(' || i == '{' || i == '['){
                //     st.push(i);
                // }
                // else{
                //     if(st.isEmpty()){
                //         return false;
                //     }
                //     if( i == ')' && st.peek() != '(' ){
                //         return false;
                //     }
                //     if( i == '}' && st.peek() != '{' ){
                //         return false;
                //     }
                //     if( i == ']' && st.peek() != '[' ){
                //         return false;
                //     }
                //     st.pop();
                // }
                if(i == '('){
                    st.push(')');
                }
                else  if(i == '{'){
                    st.push('}');
                }
                else  if(i == '['){
                    st.push(']');
                }
                else if( st.isEmpty() || st.pop() != i ){
                    return false;
                }
            }


            return st.isEmpty();
        }
    }
}
