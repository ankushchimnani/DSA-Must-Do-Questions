#include <bits/stdc++.h>
using namespace std;

// Function to calculate nearest smaller neighbour for all array elements

void nearestSmallerNeighbour(int arr[], int N){
  
	stack<int> S;

	for (int i=0; i<N; i++){
    
		// remove the top of stack S till top element is greater than or equal to arr[i]
		
		while (!S.empty() && S.top() >= arr[i])
			S.pop();

		// condition for empty stack
		if (S.empty())
			cout <<-1<<" ";
			
		else //Else print the nearest smaller neighbour
			cout << S.top() << " ";

		S.push(arr[i]);
    
	}
}

int main(){
  
	int N = 5; // size of array
	
        int arr[] =  { 1, 2, 5, 3, 5 };
    
	nearestSmallerNeighbour(arr, N);
	
	return 0;
}
