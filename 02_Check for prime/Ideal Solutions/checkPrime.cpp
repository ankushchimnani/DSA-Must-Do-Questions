#include<bits/stdc++.h>
using namespace std;
bool checkPrime(int n) {
	// Function to check if a number is prime or not

	// Corner Case
	if (n <= 1)
		return 0;
	for (int i = 2; i * i <= n; i++) {
		if (n % i == 0)
			return false;
	}
	return true;
}
int main() {
	int N = 7;
	if (checkPrime(N))
		cout << "Yes" << endl;
	else
		cout << "No" << endl;
	return 0;
}
