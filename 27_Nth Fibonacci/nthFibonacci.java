import java.io.*;
import java.lang.*;
import java.util.*;

class Main{
  //This function returns the Nth fibonacci number.
  public static int nthFibonacci(int n){
    if (n == 0) return 0;
    if (n == 1) return 1;
    return nthFibonacci(n-1) + nthFibonacci(n-2);
  }
  //Main Function
  public static void main(String[] args){
    int n = 4;
    System.out.println(nthFibonacci(n));
  }
}