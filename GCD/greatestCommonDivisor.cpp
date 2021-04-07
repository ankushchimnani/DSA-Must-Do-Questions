#include <bits/stdc++.h>
using namespace std;
int greatestCommonDivisor(int a, int b) {
	// Recursive function to find GCD of a and b
	if (b == 0)
		return a;
	return greatestCommonDivisor(b, a % b);
}
int main() {
	int a = 10, b = 6;
	cout << greatestCommonDivisor(a, b) << endl;
	return 0;
}