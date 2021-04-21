import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	
	//This function implements the binary search for k.
	public static boolean binarySearch(int[] arr,int n,int k){
		int low = 0;
		int high = n - 1;
		while(low <= high){
			int mid = low + (high - low)/2; //This ensures that integer overflow does not take place. 
			if (arr[mid] == k) return true;
			else if (arr[mid] > k) high = mid - 1; //searching in the left half
			else{
				low = mid + 1; //searching in the right half
			}
		}
		return false;
	}

	//Main Function
	public static void main(String[] args){
		int n = 4;
		int arr[] = {1,3,4,7};
		int k = 3; //The element to be searched.
		System.out.println(binarySearch(arr,n,k));

	}

}