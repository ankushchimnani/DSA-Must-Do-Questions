import java.util.*;
import java.lang.*;
import java.io.*;


class Main{
	//This function finds the minimum number from the given three numbers.
	public static int findMin(int a,int b,int c){
		int ans = Math.min(a,b);
		ans = Math.min(ans,c);
		return ans;
	}
	//This function finds the minimum amount spent on shopping.
	public static int moneyAndShopping(int[][] arr,int n){
		int[][] dp = new int[n][3];
		dp[0][0] = arr[0][0];
		dp[0][1] = arr[0][1];
		dp[0][2] = arr[0][2];

		for (int i=1;i<n;i++){
			dp[i][0] = arr[i][0] + Math.min(dp[i-1][1],dp[i-1][2]);
			dp[i][1] = arr[i][1] + Math.min(dp[i-1][0],dp[i-1][2]);
			dp[i][2] = arr[i][2] + Math.min(dp[i-1][0],dp[i-1][1]);
		}
		return findMin(dp[n-1][0],dp[n-1][1],dp[n-1][2]);
	}
	//Main Function
	public static void main(String[] args){
		int n = 3;
		int[][] arr = {{1,50,50},{50,50,50},{1,50,50}};
		int ans = moneyAndShopping(arr,n);
        System.out.println(ans);
	}
}