import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
	//This function calculates the maximum sum of a subarray, for a given array.
	public static int maximumSumSubarray(int[] arr){
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;
		for (int i = 0;i<arr.length;i++){
			max_ending_here += arr[i];
			if (max_so_far < max_ending_here){
				max_so_far = max_ending_here;
			}
			if (max_ending_here < 0){
				max_ending_here = 0;
			}
		} 
		return max_so_far;
	}
	//Main Function
	public static void main(String[] args){
		int[] arr = {2, -3, 4, -1, -2, 1, 5, -3};
		int ans = maximumSumSubarray(arr);
		System.out.println(ans);
	}
}