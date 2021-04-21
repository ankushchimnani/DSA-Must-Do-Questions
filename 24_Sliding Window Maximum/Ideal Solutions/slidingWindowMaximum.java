import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    //This function finds out the maximum element in all subarrays of size K
	public static List<Integer> slidingWindowMaximum(int arr[], int k){
        if (k > arr.length) return new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i=0;i<arr.length;i++){
			pq.add(arr[i]);
			if (pq.size() == k) {
                ans.add(pq.peek());
                pq.remove(arr[i-k+1]);
            }
		}
		return ans;
	}
	//Main Function
	public static void main(String args[]){
		int arr[] = {1,2,3,1,4,5};
		int k = 3;
		List<Integer> ans = slidingWindowMaximum(arr,k);
		for (Integer i : ans) System.out.print(i + " ");
	}
}
