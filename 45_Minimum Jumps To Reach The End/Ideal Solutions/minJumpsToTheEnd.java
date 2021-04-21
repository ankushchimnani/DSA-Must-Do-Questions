import java.util.*;
import java.io.*;
import java.lang.*;


class Main{
	//This function returns the minimum number of jumps to reach the end of the array.
	public static int minJumpsToEnd(int[] array){
		int[] dp = new int[array.length]; 
		Arrays.fill(dp,Integer.MAX_VALUE);
		dp[0] = 0;
		for (int i=0;i<array.length;i++){
			if (dp[i] == Integer.MAX_VALUE) continue;
			if (array[i] == 0) continue;
			for (int j=1;j<=array[i];j++){
				int temp = i+j;
				if (temp < array.length){
					dp[temp] = Math.min(dp[temp],dp[i] + 1);
				}
			}
		}
		return dp[dp.length-1];
	}
	//Main Function
	public static void main(String[] args){
		int[] array = {2,3,1,1,4};
		int ans = minJumpsToEnd(array);
		System.out.println(ans);

	}
}