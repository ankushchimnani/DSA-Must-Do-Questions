#include<bits/stdc++.h>
using namespace std;
bool checkPalindrome(string x, int n) {
	// Function to check if the string is palindrome or not
	int i = 0, j = n - 1;
	while (i < j)
	{
		if (x[i] != x[j])
			return false;
		i++;
		j--;
	}
	return true;
}
int main() {
	int N = 9;	// Length of the string
	string X = "malayalam";
	if (checkPalindrome(X, N))
		cout << "Yes" << endl;
	else
		cout << "No" << endl;
	return 0;
}
