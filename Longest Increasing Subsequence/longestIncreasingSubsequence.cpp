#include<bits/stdc++.h>
using namespace std;
int longestIncreasingSubsequence(int n, int arr[]) {
	// Function to find the Longest Increasing Subsequence of the given sequence
	int dp[n + 1];

	// Every Element is LIS on it's own so setting value of dp to be 1
	for (int i = 0; i <= n; i++)
		dp[i] = 1;

	for (int i = 0; i < n; i++) {
		for (int j = i; j < n; j++) {
			if (arr[j] > arr[i])
				dp[j] = max(dp[i] + 1, dp[j]);
		}
	}
	int result = 0;
	for (int  i = 0; i < n; i++) {
		result = max(result, dp[i]);
	}
	return result;
}
int main() {
	int n = 9;
	int arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80};
	cout << longestIncreasingSubsequence(n, arr) << endl;
	return 0;
}