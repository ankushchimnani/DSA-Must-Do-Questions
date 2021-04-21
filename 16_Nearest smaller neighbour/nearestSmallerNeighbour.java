import java.io.*;
import java.util.*;
import java.lang.*;


class Main{
	//This function returns an array having the nearest smaller element for each number or -1 if it does not exists.
	public static int[] nearestSmallerNeighbour(int[] arr,int n){
		Stack<Integer> stack = new Stack<>();
		int[] ans = new int[n];
		for (int i=0;i<n;i++){
			while(!stack.isEmpty() && stack.peek() >= arr[i]) stack.pop();
			if (stack.isEmpty()) ans[i] = -1;
			else{
				ans[i] = stack.peek();
			}
			stack.push(arr[i]);
		}
		return ans;
	}
	//This function prints all the elements of an array on a single line.
	public static void printArray(int[] ans){
		for (int i=0;i<ans.length;i++){
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}
	//Main Function
	public static void main(String[] args){
		int n = 5;
		int[] arr = {1,2,5,3,5};
		int[] ans = nearestSmallerNeighbour(arr,n);
		printArray(ans);
	}
}