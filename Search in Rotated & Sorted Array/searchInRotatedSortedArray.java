import java.io.*;
import java.lang.*;
import java.util.*;

class Main{
	//This function finds out the index of a particular element if it exists, using binary search
	public static int searchInRotatedSortedArray(int[] arr,int low,int high,int k){
		while(low <= high){
			int mid = low + (high - low)/2;
			if (arr[mid] == k) return mid;
			else if (arr[mid] > k) high = mid - 1;
			else{
				low = mid + 1;
			}
		}
		return  -1;
	}
	//This function finds out the index at which the array is rotated.
	public static int findPivotIndex(int[] arr){
		if (arr == null || arr.length == 0) return -1;
		if (arr.length == 0) return 0;
		if (arr[0] < arr[arr.length-1]) return 0;
		int low = 0;
		int high = arr.length-1;
		while(low <= high){
			int mid = low + (high - low);
			if (arr[mid] < arr[high]) high = mid;
			else if (arr[mid] > arr[high]) low = mid + 1;
			else{
				if (high != 0 && arr[high] >= arr[high - 1]) high--;
				else{
					return high;
				}
			}
		}
		return low;
	}
	public static void main(String[] args){
		int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
		int pivot = findPivotIndex(arr);
		int ans1 = searchInRotatedSortedArray(arr,0,pivot-1,target);
		int ans2 = searchInRotatedSortedArray(arr,pivot,arr.length-1,target);
		if (ans1 != -1) System.out.println(ans1);
		else if (ans2 != -1) System.out.println(ans2);
		else{
			System.out.println(-1);
		}


	}
}
