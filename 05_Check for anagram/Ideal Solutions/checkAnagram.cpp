#include<bits/stdc++.h>
using namespace std;
bool checkAnagram(string x, string y, int n, int m) {
	// Function to check if two strings are anagram or not

	// Using two arrays of contant size to count the frequency of each character present in the string.
	int freq1[27], freq2[27];
	memset(freq1, 0, sizeof(freq1)); // Setting initial values in the freq1 array to be 0
	memset(freq2, 0, sizeof(freq2)); // Setting initial values in the freq2 array to be 0
	for (int i = 0; i < n; i++)
	{
		int c = (int)x[i] - 96;
		freq1[c]++;
	}
	for (int i = 0; i < m; i++)
	{
		int c = (int)y[i] - 96;
		freq2[c]++;
	}

	// Checking if the frequency of each character is same or not
	for (int i = 1; i <= 26; i++)
		if (freq1[i] != freq2[i])
			return false;
	return true;
}
int main() {
	int N = 4, M = 4; // Length of the strings
	string X = "abcd";
	string Y = "dacb";
	if (checkAnagram(X, Y, N, M))
		cout << "Yes" << endl;
	else
		cout << "No" << endl;
	return 0;
}
