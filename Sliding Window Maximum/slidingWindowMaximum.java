import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    //This function finds out the maximum element in all subarrays of size K
	public static void printKMax(int arr[], int n, int k){
		int j, max;
        for (int i = 0; i <= n - k; i++) {
            max = arr[i];
            for (j = 1; j < k; j++) {
				if (arr[i + j] > max)
					max = arr[i + j];
			}
			System.out.print(max + " ");
		}
	}
	//Main Function
	public static void main(String args[]){
		int arr[] = { 1, 2, 3,1,4,5};
		int k = 3;
		printKMax(arr, arr.length, k);
	}
}
