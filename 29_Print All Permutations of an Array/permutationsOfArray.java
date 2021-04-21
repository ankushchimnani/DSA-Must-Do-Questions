import java.io.*;
import java.lang.*;
import java.util.*;

class Main{
  //This function swaps elements at two given indexes
  public static void swap(int[] a,int i,int j){
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }
   public static void printArray(int[] arr){
    for (int i=0;i<arr.length;i++) System.out.print(arr[i] + " ");
      System.out.println();
  }
  //This function generates all possible permutations of an array.
  public static void permutationsOfArray(int[] a,int l,int h){
    if (l == h){
      printArray(a);
      return ;
    }
    for (int i=l;i<=h;i++){
         swap(a,i,l);
         permutationsOfArray(a,l+1,h);
         swap(a,i,l);
    }
  }
  //Main Function
  public static void main(String[] args){
    int n = 3;
    int[] arr = {0,1,2}; 
    permutationsOfArray(arr,0,n-1);
  }
}