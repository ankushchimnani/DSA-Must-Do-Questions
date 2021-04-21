#include<bits/stdc++.h>
using namespace std;
void fizzBuzz(int n) {
	// Function to implement Fizz Buzz
	for (int i = 1; i <= n; i++) {
		if (i % 3 == 0 && i % 5 != 0)
			cout << "Fizz" << " ";
		if (i % 5 == 0 && i % 3 != 0)
			cout << "Buzz" << " ";
		if (i % 5 == 0 && i % 3 == 0)
			cout << "FizzBuzz" << " ";
		if (i % 5 != 0 && i % 3 != 0)
			cout << i << " ";
	}
}
int main() {
	int n = 10;
	fizzBuzz(n);
	return 0;
}
