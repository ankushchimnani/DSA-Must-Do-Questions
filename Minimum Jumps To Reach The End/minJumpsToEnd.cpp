#include <bits/stdc++.h>
using namespace std;
int minJumpsToEnd(int arr[], int n) {
    // Function to calculate Min jumps to reach end
    int jumps[n + 1];

    if (n == 0 || arr[0] == 0)  // Corner Case
        return INT_MAX;

    jumps[0] = 0;
    for (int i = 1; i < n; i++) {
        jumps[i] = INT_MAX;
        for (int j = 0; j < i; j++) {
            if (i <= j + arr[j] && jumps[j] != INT_MAX) {
                jumps[i] = min(jumps[i], jumps[j] + 1);
                break;
            }
        }
    }
    return jumps[n - 1];
}
int main() {
    int n = 5; // Size of Array
    int arr[] = {2, 3, 1, 1, 4};
    cout << minJumpsToEnd(arr, n)<<endl;
    return 0;
}