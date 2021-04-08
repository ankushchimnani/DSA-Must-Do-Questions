import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
//This function calculates the longest common subsequence between the two strings.
public static int longestCommonSubsequence( char[] arr1, char[] arr2){
    int m = arr1.length;
    int n = arr2.length;
	int dp[][] = new int[m+1][n+1];
	for (int i=0; i<=m; i++){
	for (int j=0; j<=n; j++){
		if (i == 0 || j == 0)
			dp[i][j] = 0;
		else if (arr1[i-1] == arr2[j-1])
			dp[i][j] = dp[i-1][j-1] + 1;
		else
			dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
	    }
	}
  return dp[m][n];
}
//Main function
public static void main(String[] args){
	String s1 = "abcde";
	String s2 = "ace";
	char[] arr1=s1.toCharArray();
	char[] arr2=s2.toCharArray();
    int ans = longestCommonSubsequence(arr1,arr2);
	System.out.println(ans);
  }
}
