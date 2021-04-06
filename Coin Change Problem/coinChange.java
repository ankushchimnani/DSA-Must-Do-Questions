import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
	//This function finds the minimum number of coins required to make an amount else returns -1.
	public static int coinChange(int[] coins,int amount){
		Arrays.sort(coins);
		int[] dp = new int[amount+1];
		Arrays.fill(dp,amount+1);
		dp[0] = 0;
		for (int i=1;i<=amount;i++){
			for (int j=0;j<coins.length;j++){
				if (coins[j] <= i){
					dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
				}else{
					break;
				}
			}
		}
		return dp[amount] == amount + 1 ? -1 : dp[amount];
	}
	//Main Function.
	public static void main(String[] args){
		int[] coins = {1,2,5};
		int amount = 11;
		int ans = coinChange(coins,amount);
		System.out.println(ans);
	}
}