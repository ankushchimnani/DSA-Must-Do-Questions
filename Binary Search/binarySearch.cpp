#include<bits/stdc++.h>
using namespace std;
bool binarySearch(int arr[], int n, int key)
{
	// Function to find key in the array using Binary Search approach
	// Iterative Binary Search
	int low = 0, high = n - 1;
	while (low < high) {
		int mid = low + (high - low) / 2;
		if (arr[mid] == key)
			return 1;
		else if (arr[mid] > key)
			high = mid - 1;
		else if (arr[mid] < key)
			low = mid;
	}
	return 0;
}
int main() {
	int n = 4;
	int arr[] = {1, 3, 4, 7};
	int key = 3;

	//Sorting the array in increasing order first as Binary Search works on sorted array
	sort(arr, arr + n);

	if (binarySearch(arr, n, key))
		cout << "true" << endl;
	else
		cout << "false" << endl;
	return 0;
}