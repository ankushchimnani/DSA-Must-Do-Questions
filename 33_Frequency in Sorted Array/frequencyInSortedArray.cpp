#include<bits/stdc++.h>
using namespace std;
int frequencyInSortedArray(int n, int arr[], int k) {
	//Function to find the frequency of given element
	int cnt = upper_bound(arr, arr + n, k) - lower_bound(arr, arr + n, k);
	return cnt;
}
int main() {
	int n = 10, q = 3; // Size of array and Number of Queries respectively
	int arr[] = { 1, 3, 3, 4, 5, 6, 7, 7, 8, 9 };
	int query[] = {3, 7, 11};	// Storing query elements in an array for simplicity
	for (int i = 0; i < q; i++) {
		cout << frequencyInSortedArray(n, arr, query[i]) << endl;
	}
	return 0;
}