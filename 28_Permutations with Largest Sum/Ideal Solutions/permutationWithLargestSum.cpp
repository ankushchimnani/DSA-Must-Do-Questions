#include<bits/stdc++.h>
using namespace std;

// Function to calculate maximum sum for a permutation of array

void permutationWithLargestSum(int arr[], int N){
   
   sort(arr, arr + N); // sort the array
  
   for (int i = 0; i < N; i++)
	   cout<<arr[i]<<" ";

}

int main(){
    
    int N = 4;
    
    int arr[] = { 3, 5, 6, 1 };

    permutationWithLargestSum(arr, N);

    return 0;
    
}
