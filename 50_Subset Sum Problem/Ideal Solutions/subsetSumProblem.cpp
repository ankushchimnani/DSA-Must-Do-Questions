#include <bits/stdc++.h>
using namespace std;

int dp[2000][2000];

// Function to check if any subset with given sum exists or not

int subsetSum(int arr[], int N, int sum){
	
	// If sum is 0, there always exists an empty subset
	if (sum == 0)
		return 1;
		
	// If array is empty only a single subset with sum zero is possible
	if (N <= 0)
		return 0;

	// If a subset with given sum already exists
	
	if (dp[N - 1][sum] != -1)
		return dp[N - 1][sum];

	// If arr[N-1] > sum, it can never be a part of the subset
	
	if (arr[N - 1] > sum)
		return dp[N - 1][sum] = subsetSum(arr, N - 1, sum);
	
	//Else arr[N - 1] may be or may not be the part of subset with given sum	
	else{
		
		return dp[N - 1][sum] = subsetSum(arr, N - 1, sum) ||
					subsetSum(arr, N - 1, sum - arr[N - 1]);
	}
}

int main(){
    
    // initialising the dp table with value -1.
	memset(dp, -1, sizeof(dp));
	
	int N = 6;
	
	int arr[] = {3, 34, 4, 12, 5, 2};
	
	int sum = 8;

	if (subsetSum(arr, N, sum)){
	    
		cout << "True" << endl;
	}
	else
		cout << "False" << endl;
		
    return 0;
}
