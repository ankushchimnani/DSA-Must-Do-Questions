#include <bits/stdc++.h>
using namespace std;
const int R = 3, C = 3; // Size of rows and colums of the matrix

void matrixRotation(int arr[][C]) {
	// Function to rotate the matrix by 90 degrees anti-clockwise

	// Taking Transpose
	for (int i = 0; i < R; i++)
		for (int j = i; j < C; j++)
			swap(arr[i][j], arr[j][i]);
	// Reversing the columns
	for (int i = 0; i < C; i++)
		for (int j = 0, k = C - 1; j < k; j++, k--)
			swap(arr[j][i], arr[k][i]);
}

// Driven code
int main()
{
	int arr[R][C] = { { 1, 2, 3 },
					  { 4, 5, 6 },
		              { 7, 8, 9 } };

	// Calling the function to rotate the matrix
	matrixRotation(arr);

	// Printing the rotated matrix
	for (int i = 0; i < R; i++) {
		for (int j = 0; j < C; j++)
			cout << arr[i][j] << " ";
		cout << '\n';
	}
	return 0;
}