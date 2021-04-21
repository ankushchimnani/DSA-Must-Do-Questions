import java.util.*;
import java.lang.*;
import java.io.*;



class Main{
	//This function checks if the two arrays are equal or not.
	public static boolean equalArrays(char[] arr1, char[] arr2){
		if (arr1.length != arr2.length) return false;
		for (int i=0;i<arr1.length;i++){
			if (arr1[i] != arr2[i]) return false;
		}
		return true;
	}
	//This function checks if the two strings are anagrams of each other.
	public static boolean checkAnagram(String a,String b){
		char[] arr1 = a.toCharArray();
		char[] arr2 = b.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return equalArrays(arr1,arr2);
	}
	//Main Function
	public static void main(String[] args){
		int n = 4;
		String a = "abcd";
		int m = 4;
		String b = "adcb";
		if (checkAnagram(a,b)) System.out.println("Yes");
		else{
			System.out.println("No");
		}
	}
}
