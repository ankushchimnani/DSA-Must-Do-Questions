import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    //This function returns index of two numbers whose sum is equal to K.
	public static int[] twoSum(int[] array,int K){
		int left = 0;
		int right = array.length-1;
		int[] ans = new int[2];
		while(left < right){
			int sum = array[left] + array[right];
			if (sum == K){
				ans[0] = left;
				ans[1] = right;
				break;
			}else if (sum > K) right--;
			else{
				left++;
			}
		}
		return ans;
	}
	//Main Function
	public static void main(String args[]){
		int[] array = {2,7,11,15};
		int K = 9;
		int[] ans = twoSum(array,K);
		System.out.println(ans[0] +" "+ans[1]); 
	}
}

