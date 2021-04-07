import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
	//This function find out the square root of an integer.
	public static int squareRoot(int n){
        if (n == 0  || n == 1) return n;
		int low = 1;
		int high = n;
        int ans = 0;
		while(low <= high){
			int mid = low + (high - low)/2;
			if (mid * mid == n) return mid;
			else if (mid * mid < n) {
                ans = mid;
                low = mid + 1;
            }
			else{
				high = mid - 1;
			}
		}
		return ans;
	}
	//Main function
	public static void main(String[] args){
		int n = 11;
		int ans = squareRoot(n);
		System.out.println(ans);

	}
}