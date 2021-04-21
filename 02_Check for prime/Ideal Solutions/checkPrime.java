import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
	//This function checks wether a particular number is prime or not.
	public static boolean checkPrime(int n){
		for (int i=2;i<=Math.sqrt(n);i++){
			if (n % i == 0) return false;
		}
		return true;
	}
	//Main Function.
	public static void main(String[] args){
		int n = 10;
		if (checkPrime(n)) System.out.println("Yes");
		else{
			System.out.println("No");
		}
	}
}
