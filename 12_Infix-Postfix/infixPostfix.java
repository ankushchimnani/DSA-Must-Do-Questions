import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
    //This function implements the priority order of the operands.
    public static int priority(char a){
        if (a == '^') return 3;
        if (a == '*' || a == '/') return 2;
        if (a == '+' || a == '-') return 1;
        return -1;
    }
    //This function checks whether the particular character is an operand or an operator. 
    public static boolean isCharacter(char a){
        if (a == ')' || a == '(' || a == '+' || a == '-' || a == '*' || a == '/' || a == '^') return false;
        return true;
    }
    //This function checks converts the infix expression into postfix expression.
    public static String infixPostfix(String a){
        StringBuffer ans = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<a.length();i++){
            if (isCharacter(a.charAt(i))) ans.append(a.charAt(i));
            else if (a.charAt(i) == '(') stack.push(a.charAt(i));
            else if (a.charAt(i) == ')'){
                while(!stack.isEmpty() && stack.peek() != '(') ans.append(stack.pop());
                if (stack.isEmpty()) return "Wrong!";
                else{
                    stack.pop();
                }
            }else{
                while(!stack.isEmpty() && priority(stack.peek()) >= priority(a.charAt(i))) ans.append(stack.pop());
                stack.push(a.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.toString();
    }
    //Main Function.
    public static void main(String[] args){
        String a = "a+b-c+d*(e-f)/g+(h*(i/j))";
        System.out.println(infixPostfix(a));
    }
}