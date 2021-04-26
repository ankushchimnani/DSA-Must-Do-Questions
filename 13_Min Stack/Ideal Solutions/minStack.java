import java.io.*;
import java.lang.*;
import java.util.*;


//This class implements the minstack functionality, using two stacks.
class MinStack{
	Stack<Integer> stack;
	Stack<Integer> minstack;
	int min = Integer.MAX_VALUE;
	public MinStack(){
		stack = new Stack<>();
		minstack = new Stack<>();
	}

	public void push(int x){
		stack.push(x);
		if (x <= min){
			min = x;
			minstack.push(x);
		}
	}
	public void pop(){
		if(!stack.isEmpty()){
			int temp = stack.pop();
			if (temp == min){
				minstack.pop();
			}
			if (minstack.isEmpty()){
				min = Integer.MAX_VALUE;
			}else{
				min = minstack.peek(); 
			}
		}
	}
	public int getMin(){
		if (!stack.isEmpty()) return min;
        return -1; //If the stack is empty.
	}
	public int top(){
		if (!stack.isEmpty()) return stack.peek();
        return -1; //If the stack is empty.
	}
}

class Main{
	//Main Function
	public static void main(String[] args){
		MinStack object = new MinStack();
		object.push(3);
		object.push(5);
		object.push(1);
		System.out.println(object.getMin());
		object.pop();
		System.out.println(object.getMin());
	}
}	
