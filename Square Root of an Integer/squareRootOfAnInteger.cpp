#include<bits/stdc++.h>
using namespace std;

// Returns floor square root of x using binary search		

int Sqrt(long long X){	

	if (X == 0 || X == 1)
	return X;

	int lo = 1, hi = X, ans;
	
	while (lo <= hi){
	    
		int mid = (lo + hi) / 2;

		// If x is a perfect square
		if (mid*mid == X)
			return mid;

		// if mid*mid is lesser than x then, 
		// search for a better answer from mid+1 to hi
		
		if (mid*mid < X){
		    
			lo = mid + 1;
			ans = mid;
		}
		
		// Else the answer lies in a range lo to mid-1
		else 
		hi = mid-1;		
	}
	
	return ans;
}


int main(){
  
	int X = 11;
	cout << Sqrt(X) << endl;
	return 0;
}
