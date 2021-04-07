#include<bits/stdc++.h>
using namespace std;
int maximumSumSubarray(int n, int arr[]) {
	// Function to calculate the maximum sum of a subarray
	int currentMax = 0, globalMax = INT_MIN;
	for (int i = 0; i < n; i++) {
		currentMax += arr[i];
		if (currentMax > globalMax)
			globalMax = currentMax;
		if (currentMax < 0)
			currentMax = 0;
	}
	return  globalMax;
}
int main() {
	int n = 8;	// Size of the array
	int arr[] = {2, -3, 4, -1, -2, 1, 5, -3};
	cout << maximumSumSubarray(n, arr) << endl;
	return 0;
};
