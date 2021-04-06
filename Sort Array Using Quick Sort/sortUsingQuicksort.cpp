#include <bits/stdc++.h>
using namespace std;

// Function for partition

int partition (int arr[], int lo, int hi){
    
	int pivot = arr[hi]; // pivot
	
	int idx = (lo - 1); // Index of smaller element and indicates the right position of pivot found so far

	for (int j = lo; j <= hi - 1; j++){
	    
		// If current element is smaller than the pivot
		if (arr[j] < pivot)
		{
			idx++; // increment index of smaller element
			
			swap(arr[idx], arr[j]);
		}
	}
	swap(arr[idx + 1], arr[hi]);
	
	return (idx + 1);
}

// Function for quick sort 

void quickSort(int arr[], int lo, int hi){
    
	if ( lo < hi ){
	    
		// partitioning index
		
		int pi = partition(arr, lo, hi);

		// sort all elements before partition index
		quickSort(arr, lo, pi - 1);
		
		//sort all elements after partition index
		quickSort(arr, pi + 1, hi);
		
	}
}

int main(){  
    
    int N = 6;
    
	int arr[] = {2, 6, 3, 0, 4, 1};
	
	quickSort(arr, 0, N - 1);
	
	for(int i = 0; i < N ; i++)
	cout<<arr[i]<<" ";
	
	return 0;
}
