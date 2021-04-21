#include <bits/stdc++.h>
using namespace std;
int findPeakElement(int arr[], int low, int high, int n) {
    // Function to find the index of any peak element present in the array

    int mid = low + (high - low) / 2;

    if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
        return mid;

    // If middle element is not peak and it's left neighbour is greater than it, then the left half must have a peak element
    else if (mid > 0 && arr[mid - 1] > arr[mid])
        return findPeakElement(arr, low, (mid - 1), n);

    // If middle element is not the peak and it's right neighbour is greater than it, then the right half must have a peak element
    else
        return findPeakElement(arr, (mid + 1), high, n);
}
int main() {
    int n = 4;
    int arr[] = { 1, 2, 3, 1};
    cout << findPeakElement(arr, 0, n - 1, n) << endl; // Calling the function to print the index of peak element
    return 0;
}
