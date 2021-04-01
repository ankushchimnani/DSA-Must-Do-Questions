import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
	//This function finds the last first occurence of a particular element K,in the given array, if present. 
	public static int upperBound(int[] arr,int k){
		int low = 0;
		int high = arr.length-1;
      	int ans = -1;
		while(low <= high){
			int mid = low + (high - low)/2;
			if (arr[mid] == k){
				ans = mid;
				low = mid + 1;
			}else if (arr[mid] > k) high = mid - 1;
			else{
				low = mid + 1;
			}
		}
		return ans;
	}
	//This function finds the last first occurence of a particular element K,in the given array, if present. 
	public static int lowerBound(int[] arr,int k){
		int low = 0;
		int high = arr.length-1;
		int ans = -1;
		while(low <= high){
			int mid = low + (high - low)/2;
			if (arr[mid] == k){
				ans = mid;
				high = mid - 1;
			}else if (arr[mid] > k) high = mid - 1;
			else{
				low = mid + 1;
			}
		}
		return ans;
	}
	//This function finds the frequency of a particular element k, in the given array.
	public static int frequencyInSortedArray(int[] arr,int k){
		int lowerBound = lowerBound(arr,k);
      		int upperBound = upperBound(arr,k);
      		if (lowerBound == -1 || upperBound == -1) return 0; //if the element is not present in the array.
      		return upperBound - lowerBound + 1;
	}
	//Main Function
	public static void main(String[] args){
		int N = 10; 
		int Q = 3;
		int[] arr = {1,3,3,4,5,6,7,7,8,9};
		int[] query = {3,7,11};
		for (int i=0;i<query.length;i++){
			int ans = frequencyInSortedArray(arr,query[i]);
          	System.out.println(ans);
		}
	}
}
