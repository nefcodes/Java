import java.util.Stack;
class Solution {
    public boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();
        //turn string to char array and iterate over each char
        for(char c : s.toCharArray()){
            //if char is opening braces push in the stack
            if(isOpen(c)){
                stk.push((c));
            }
            //if it's a closing bracket
            else{
                //if top element of stack and current element is same
                if(stk.size() > 0 && isSameType(stk.peek(), c)){
                    stk.pop();
                }
                else {
                    return false; //
                }
            }
        }
        return stk.size() == 0; // if at the end no elements remain, then it's a programmer brackets.
    }
    //is it opening braces?
    private boolean isOpen(char c){
        return c == '(' || c == '{' || c == '['; // return true if any is opening braces
    }
    //are given two braces of same type?
    private boolean isSameType(char open, char close){
        return (open == '(' && close == ')' || open == '{' && close == '}' || open == '[' && close == ']');
    }
}
