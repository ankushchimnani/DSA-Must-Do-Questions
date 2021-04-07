#include <bits/stdc++.h>
using namespace std;

// Function to sort the input array of 0's, 1's and 2'.

void sort012(int arr[], int N){
    
    int cnt0 = 0, cnt1 = 0, cnt2 = 0;
    
    // Count the number of 0, 1 and 2 present in th array
    
    for( int i = 0; i<N ; i++ ){
        
        if(arr[i] == 0)
           cnt0++;
        
        else if(arr[i] == 1)
           cnt1++;
           
        else
           cnt2++;
    }
    
    // Update the array
    
    int i = 0;
    
    while(cnt0--){
        arr[i++] = 0;
        
    }
    
    while(cnt1--){
        arr[i++] = 1;
    }
	
	while(cnt2--){
        arr[i++] = 2;
    }
    
    // print the updated array
    
    for( int i = 0; i<N; i++)
    cout<<arr[i]<<" ";
    
}

int main(){
    
    int N = 6; // Size of the array
    
	int arr[] = { 0, 1, 2, 0, 1, 2 };

	sort012(arr, N);

	return 0;
}
