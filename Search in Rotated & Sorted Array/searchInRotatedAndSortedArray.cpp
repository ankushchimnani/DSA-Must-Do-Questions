#include <bits/stdc++.h>
using namespace std;

// Function that returns the position of key in a sorted and rotated array

int search(int arr[], int lo, int hi, int key){  
    
	if (lo > hi)
		return -1;

	int mid = (lo + hi) / 2;
	
	if (arr[mid] == key)
		return mid;

	if (arr[lo] <= arr[mid]) {
		
		if (key >= arr[lo] && key <= arr[mid])
			return search(arr, lo, mid - 1, key);
			
		return search(arr, mid + 1, hi, key);
	}

	if (key >= arr[mid] && key <= arr[hi])
		return search(arr, mid + 1, hi, key);

	return search(arr, lo, mid - 1, key);
}


int main(){
    
    int N = 7; // Size of the array
    
	int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
	
	int key = 0;
	
	int idx = search(arr, 0, N - 1, key);

		cout << idx << endl;
		
}
