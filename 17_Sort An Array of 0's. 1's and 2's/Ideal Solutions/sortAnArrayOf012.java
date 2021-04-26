import java.lang.*;
import java.util.*;
import java.io.*;

class Main {
    //This function prints the array
	static void printArr(int arr[], int n){
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
    //This function sorts the array of 0's,1's and 2's
	public static void sortArr(int arr[], int n){
		int i; 
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
		for (i = 0; i < n; i++) {
			switch (arr[i]) {
			case 0:
				cnt0++;
				break;
			case 1:
				cnt1++;
				break;
			case 2:
				cnt2++;
				break;
			}
		}
		i = 0;
		while (cnt0 > 0) {
			arr[i++] = 0;
			cnt0--;
		}
	
		while (cnt1 > 0) {
			arr[i++] = 1;
			cnt1--;
		}
		while (cnt2 > 0) {
			arr[i++] = 2;
			cnt2--;
		}
		printArr(arr, n);
	}
	
	// Main Function
	public static void main(String[] args){
		int arr[] = {0, 1, 2, 0, 1, 2};
		int n = arr.length;
		sortArr(arr, n);
	}
}
