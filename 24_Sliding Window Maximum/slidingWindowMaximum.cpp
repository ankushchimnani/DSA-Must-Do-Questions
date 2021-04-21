#include <bits/stdc++.h>
using namespace std;

// Function to calculate Maximum element for all subarrays of size k

void kMax(int arr[], int N, int K){
	
	// Double Ended Queue, 
	// maintaining nonincreasing order of
	// values from front to rear in Qi.
	
	deque<int> dq(K);

	// Push the first window 
	
	for (int i = 0; i < K; ++i){
        
        // Remove all the elements of dequeue 
	    // which are less than or equal to arr[i]
	    
		while ((!dq.empty()) && arr[i] >= arr[dq.back()])
			// Remove from rear
			dq.pop_back();

		    // Add new element at rear of dequeue
		    dq.push_back(i);
	}

	for (int i = K; i < N; ++i){
	
		// The element at the front of
		// the dequeue is the largest element of
		// previous window
		cout << arr[dq.front()] << " ";

		// Remove the elements which
		// are out of this window
		while ((!dq.empty()) && dq.front() <= i-K)
		
			// Remove from front of queue
			dq.pop_front();

		while ((!dq.empty()) && arr[i] >= arr[dq.back()])
			dq.pop_back();

		dq.push_back(i);
	}

	// Print for the last window
	cout << arr[dq.front()];
}


int main(){
    
	int arr[] = { 1, 2, 3, 1, 4, 5 };
	
	int N = 6;
	int K = 3;
	
	kMax(arr, N, K);
	
	return 0;
}
