import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
	//This function finds out if the given number is a power of two or not.
	public static boolean powerOfTwo(int n){
		return (n>0) && ((n&n-1)==0);
	}
	//Main Function
	public static void main(String[] args){
		int n = 4;
		if (powerOfTwo(n)) System.out.println("Yes");
		else{
			System.out.println("No");
		} 
	}
}

