import java.util.*;
import java.lang.*;
import java.io.*;



class Main{
	//This function checks if the given string is a palindrome or not.
	public static boolean checkPalindrome(String a){
		int left = 0;
		int right = a.length()-1;
		while(left <= right){
			if (a.charAt(left) != a.charAt(right)) return false;
			left++;
			right--;
		}
		return true;
	}
	//Main Function
	public static void main(String[] args){
		int n = 9;
		String a = "malayalam";
		if (checkPalindrome(a)) System.out.println("Yes");
		else{
			System.out.println("No");
		}
	}
}