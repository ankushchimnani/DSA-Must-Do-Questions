	import java.io.*;
	import java.lang.*;
	import java.util.*;


	class Main{
		//This function converts string to array.
		public static int[] stringToArray(String a){
			int[] arr = new int[a.length()];
			for (int i=0;i<a.length();i++){
				arr[i] = Integer.parseInt(Character.toString(a.charAt(i)));
			}
			return arr;
		}
		//This function returns the decimal value from the binary string converted into an array of 1's and 0's.
		public static int binaryToNumber(int[] arr){
			int value = 0;
			int j = 0;
			for (int i=arr.length-1;i>=0;i--){
				if (arr[i] == 1){
					value += (int)Math.pow(2,j);
				}
				j++;
			}
			return value;
		}
		//Main function
		public static void main(String[] args){
			String a = "00000000000000000000000000000111";
			int[] arr = stringToArray(a);
			int value = binaryToNumber(arr);
			System.out.println(value);
		}
	}
