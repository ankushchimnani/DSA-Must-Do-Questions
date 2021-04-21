#include <bits/stdc++.h>
using namespace std;
void bubbleSort(int arr[], int n)
{
    // A function to implement bubble sort
    for (int i = 0; i < n - 1; i++) {

        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1])
                swap(arr[j], arr[j + 1]);
        }
    }

    // Printing the sorted array
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    cout << endl;
}
int main() {
    int n = 5;
    int arr[] = {5, 1, 6, 3, 7};
    bubbleSort(arr, n);
    return 0;
}
