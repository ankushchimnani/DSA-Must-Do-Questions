import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
	//This function finds out if the subset with the required sum exists or not.
	public static boolean subsetSumProblem(int array[],int sum){
        int n = array.length;
		boolean subset[][] = new boolean[sum + 1][n + 1];
		for (int i = 0; i <= n; i++) subset[0][i] = true;
		for (int i = 1; i <= sum; i++) subset[i][0] = false;
		for (int i = 1; i <= sum; i++) {
			for (int j = 1; j <= n; j++) {
				subset[i][j] = subset[i][j - 1];
				if (i >= array[j - 1])
					subset[i][j] = subset[i][j] || subset[i - array[j - 1]][j - 1];
			}
		}
		return subset[sum][n];
	}
	//Main Function
	public static void main(String args[]){
		int array[] = { 3, 34, 4, 12, 5, 2 };
		int sum = 9;
	    if (subsetSumProblem(array, sum)) System.out.println("True");
        else{
            System.out.println("False");
        }
	}
}

