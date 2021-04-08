import java.util.*;
import java.lang.*;
import java.io.*;


class Main{
    //This function finds out the longest Increasing subsequence in an array.
    public static int longestIncreasingSubsequence(int[] arr,int n){
        int[] dp = new int[n + 1];
        Arrays.fill(dp,1);
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if (arr[j] > arr[i]) dp[j] = Math.max(dp[i] + 1, dp[j]);
            }
        }
        int max = 0;
        for (int i=0;i<n;i++){
            max = Math.max(dp[i],max);
        }
        return max;
    }
    //Main Function
    public static void main(String[] args){
        int n = 9;
        int[] arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
        int ans = longestIncreasingSubsequence(arr,n);
        System.out.println(ans);
    }
}
