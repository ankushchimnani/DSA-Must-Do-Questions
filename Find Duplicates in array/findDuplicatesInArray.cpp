#include <bits/stdc++.h>
using namespace std;
int findDuplicateInArray(int arr[], int n) {
    // Function to find the number which is present more than once in the array
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }
    int N = n - 1;
    int value = (N * (N + 1)) / 2; // Formula to find sum of natural numbers upto N
    return abs(value - sum);
}
int main() {
    int n = 5; // Size of the array
    int arr[] = {1, 3, 3, 2, 4};
    cout << findDuplicateInArray(arr, n) << endl;
    return 0;
}