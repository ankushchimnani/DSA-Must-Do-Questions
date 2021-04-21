import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
	//This recrsive function calculates the greatest common divisor of two numbers.
	public static int greatestCommonDivisor(int n,int m){
		if (n == 0) return m;
		return greatestCommonDivisor(m % n,n);
	}
	//Main Function
	public static void main(String[] args){
		int n = 10;
		int m = 6;
		System.out.println(greatestCommonDivisor(n,m));
	}
}