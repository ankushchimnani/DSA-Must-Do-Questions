
import java.io.*;
import java.lang.*;
import java.util.*;

class Main{
	//This class implements the stack data structure using two queues.
	static class Stack {
		static Queue<Integer> q1 = new LinkedList<Integer>();
		static Queue<Integer> q2 = new LinkedList<Integer>();
		static int curr_size;

		Stack(){
			curr_size = 0;
		}

		static void push(int x){
			curr_size++;
			q2.add(x);
			while (!q1.isEmpty()) {
				q2.add(q1.peek());
				q1.remove();
			}
			Queue<Integer> q = q1;
			q1 = q2;
			q2 = q;
		}
		static int pop(){
			if (q1.isEmpty())
				return -1;
            int ans =q1.peek();
			q1.remove();
			curr_size--;
            return ans;
		}
		static int top(){
			if (q1.isEmpty()) return -1;
			return q1.peek();
		}

		static int size(){
			return curr_size;
		}
	}

	//Main Function
    public static void main(String[] args){
		Stack stack = new Stack();
		stack.push(2);
		stack.push(3);
        System.out.println(stack.pop());
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.size());
	}
}
