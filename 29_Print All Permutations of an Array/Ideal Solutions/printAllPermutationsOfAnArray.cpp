#include <bits/stdc++.h>
using namespace std;

// Function to print all permutations of an array

void permutations(int arr[], int l, int r, int N){
    
	//Only permutations for an array having single element
	
	if (l == r){
		
		for(int i=0; i < N; i++)
		cout<<arr[i]<<" ";
		
		cout<<"\n";
		
	}
	
	else{
		
		for (int i = l; i <= r; i++){
                        
			swap(arr[l], arr[i]);

			permutations(arr, l+1, r, N);

			swap(arr[l], arr[i]);
		}
	}
}


int main(){
    
	int N = 3;
	
	int arr[] = { 0, 1, 2 };
	
	permutations(arr, 0, N-1, N);
	
	return 0;
}
