
import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
	//This function implements the required function.
	public static int bestTimeToBuySellStock(int[] prices){
		if (prices.length <= 1){
			return 0;
		}
		int min = prices[0];
		int max_diff = 0;
		for (int i=1;i<prices.length;i++){
			if (prices[i] < min){
				min = prices[i];
			}
			int temp = prices[i] - min;
			if (temp > max_diff){
				max_diff = temp;
			}
		}
		return max_diff;
	}
	//Main Function
	public static void main(String[] args){
		int[] prices = {7,1,5,3,6,4};
		int ans = bestTimeToBuySellStock(prices);
		System.out.println(ans);

	}
}