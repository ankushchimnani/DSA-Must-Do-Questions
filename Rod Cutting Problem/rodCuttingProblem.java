import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
    //This function returns the maximum price that can be obtained on cutting the problems.
    public static int rodCuttingProblem(int price[],int n){
        int value[] = new int[n+1];
        value[0] = 0;
  
        // Build the table val[] in bottom up manner and return
        // the last entry from the table
        for (int i = 1; i<=n; i++){
            int max_val = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++)max_val = Math.max(max_val, price[j] + value[i-j-1]);
            value[i] = max_val;
        }
  
        return value[n];
    }
    //Main Function
    public static void main(String args[]){
        int[] lengths = {1, 2, 3, 4, 6, 7, 8};
        int prices[] = {1, 5, 8, 9, 10, 17, 17, 20};
        int n = 4;
        System.out.println(rodCuttingProblem(prices, n));
    }
}