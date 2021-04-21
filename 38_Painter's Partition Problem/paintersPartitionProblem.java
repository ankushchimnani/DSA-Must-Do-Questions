import java.io.*;
import java.lang.*;
import java.util.*;

class Main{
  //This function checks if it is possible to paint all the boards in a given amount of time. 
  public static boolean checkIfPossible(long[] a,int k,long val){
    int count = 1;
    long sum = 0;
    for (int i=0;i<a.length;i++){
      sum += a[i];
      if (sum>val){
        sum = a[i];
        count++;
      }
    }
    return count <= k ? true : false;
  }
  //This function finds the minimum time to paint all the boards.
  public static long paintersPartitionProblem(long[] arr,long low,long high,int k){
    long ans = 0;
    while(low <= high){
      long mid = low + (high - low)/2;
      if (checkIfPossible(arr,k,mid)){
        ans = mid;
        high = mid - 1;
      }else{
        low = mid + 1;
      }
    }
    return ans;
  }
  //Main Function
  public static void main(String[] args){
      long arr[] = {10,10,10,10};
      long low = 0;
      long high = 0;
      for (int i=0;i<arr.length;i++){
        low = Math.max(low,arr[i]);
        high += arr[i];
      }
      int k = 2;
      long ans = paintersPartitionProblem(arr,low,high,k);
      System.out.println(ans);
  }
}