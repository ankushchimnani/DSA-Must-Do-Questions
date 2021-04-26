import java.io.*;
import java.lang.*;
import java.util.*;


class Main{

	//This function finds the peak element.
	public static int findPeakElement(int n,int[] arr){
		int low = 0;
		int high = arr.length-1;
		while(low < high){
			int mid = low + (high - low)/2;
			if (arr[mid] > arr[mid + 1]) high = mid;
			else{
				low = mid + 1;
			}
		}
		return low;
	}

	//Main Function
	public static void main(String[] args){
		int n = 4;
		int[] array = {1,2,3,1};
		int ans = findPeakElement(n,array);
		System.out.println(ans);
	}
}