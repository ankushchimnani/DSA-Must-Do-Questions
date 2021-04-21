import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
//This class implements the queue data structure using two stacks.
static class Queue{
	 Stack<Integer> s1 = new Stack<Integer>();
	 Stack<Integer> s2 = new Stack<Integer>();

	private void enqueue(int x){
		while (!s1.isEmpty()){
			s2.push(s1.pop());
			//s1.pop();
		}
		s1.push(x);
		while (!s2.isEmpty()){
			s1.push(s2.pop());
			//s2.pop();
		}
	}
	private int dequeue(){
		if (s1.isEmpty()){
			System.out.println("Queue is Empty");
			System.exit(0);
		}
		int x = s1.peek();
		s1.pop();
		return x;
	}
}
//Main Function
public static void main(String[] args){
	int n = 5;
    int[] arr = {1,2,1,3,2,1,4,2};
    Queue queue = new Queue();
    for (int i=0;i<arr.length;i++){
        if (arr[i] == 1){
            queue.enqueue(arr[i+1]);
            i++;
        }else{
            System.out.println(queue.dequeue());
        }
    }
  }
}

