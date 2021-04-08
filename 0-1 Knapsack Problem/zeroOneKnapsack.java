import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    //This function returns the maximum value that we can, without exceeding the capacity of the KnapSack
	public static int zeroOneKnapSack(int W, int weight[], int value[], int n){
		if (n == 0 || W == 0) return 0;
		if (weight[n - 1] > W) return zeroOneKnapSack(W, weight, value, n - 1);
		else{
            return Math.max(value[n - 1]+ zeroOneKnapSack(W - weight[n - 1], weight,value, n - 1),zeroOneKnapSack(W, weight, value, n - 1));
        }
	}
	//Main Function
	public static void main(String args[]){
		int value[] = new int[] { 60, 100, 120 };
		int weight[] = new int[] { 10, 20, 30 };
		int W = 50;
		int n = value.length;
		System.out.println(zeroOneKnapSack(W, weight, value, n));
	}
}