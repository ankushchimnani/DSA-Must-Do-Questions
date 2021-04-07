#include <bits/stdc++.h>
using namespace std;


// Function to check if any two numbers of array add to k

void kSum(int arr[], int N, int k){
	
	//Initializing two pointers
	
	int i = 0, j = N-1;
	
	while(i<j){
	    
	    // If sum of two numbers is greater than k then,
	    // move the last pointer one step back.
	    
        if( arr[i] + arr[j] > k )
            j--;
        
        // If sum of two numbers is less than k then,
	    // move the first pointer one step ahead.   
	    
        else if( arr[i] + arr[j] < k )
            i++;
            
        // Else given numbers add to k   
        
        else
            break;
        }
        
        // No answer exists if pointer i becomes greater than or equal to j
        
        if(i>=j)
        cout<<-1<<"\n";
	    
	    else
	    cout<<i<<" "<<j<<"\n";
}

int main(){
    
	
	int N = 4; // size of array
	
	int arr[] = {2, 7, 11, 15};
	
	int k = 9;

	kSum(arr, N, k);
		
    return 0;
}
