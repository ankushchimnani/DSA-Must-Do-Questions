#include <bits/stdc++.h>
using namespace std;

int minRotatedSortedArray(int arr[], int low, int high)
{
    // Function to find minimum in rotated sorted array
    while (low < high)
    {
        int mid = low + (high - low) / 2;
        if (arr[mid] == arr[high])
            high--;
        else if (arr[mid] > arr[high])
            low = mid + 1;
        else
            high = mid;
    }
    return arr[high]; // Minimum Element in the array
}
int main()
{
    int n = 7;  // Size of the array
    int arr[] = {4,5,6,7,0,1,2};    // Elements of the array
    cout << minRotatedSortedArray(arr, 0, n - 1) << endl;
    return 0;
}