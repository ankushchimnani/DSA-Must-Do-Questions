#include<bits/stdc++.h>
using namespace std;
void binaryRepresentation(int N) {
	// Function to print the binary representation of a 32-bit integer

	// For a 32 bit integer bit positions are 0-31 bits
	for (int i = 31; i >= 0; i--) {
		if (N & (1 << i))
			cout << 1;
		else
			cout << 0;
	}
	cout << endl;
}
int main() {
	int N;
	N = 7;
	binaryRepresentation(N);
	return 0;
}
