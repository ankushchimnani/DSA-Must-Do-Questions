import java.util.*;
import java.lang.*;
import java.io.*;


class Main{
	//This function finds the minimum element in a rotated & sorted array.
	public static int minimumInSortedRotatedArray(int[] arr){
		if (arr == null || arr.length == 0) return -1;
		if (arr.length == 1) return arr[0];
		int low = 0;
		int high = arr.length-1;
		if (arr[low] < arr[high]) return arr[low];
		while(low <= high){
			int mid = low + (high - low)/2;
			if (arr[mid] > arr[mid + 1]) return arr[mid + 1];
			if (arr[mid] < arr[mid - 1]) return arr[mid];
			if (arr[mid] > arr[low]) low = mid + 1;
			else{
				high = mid - 1;
			}
		}
		return -1;
	}
	//Main Function
	public static void main(String[] args){
		int[] arr = {1,2,3};
		int ans = minimumInSortedRotatedArray(arr);
		System.out.println(ans);

	}
}