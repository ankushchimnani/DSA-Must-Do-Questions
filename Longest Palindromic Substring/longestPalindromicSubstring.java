import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
    //This function finds the length of the longest palindromic substring.
    public static String longestPalindromicSubstring(String str){
        int len = str.length();
        boolean grid[][] = new boolean[len][len]; 
        int max_length = 1;
        for (int i=0;i<len;i++){
            grid[i][i] = true; //All substrings having a lengths of 1 are palindromes.
        }
        int start = 0;
        //This loop is to find the substrings of length 2 which are palindromes.
        for (int i = 0;i<len-1;i++){
            if (str.charAt(i) == str.charAt(i+1)){
                grid[i][i+1] = true;
                start = i;
                max_length = 2;
            }
        }
        //This loop finds the rest of the palindromic substrings, and we select the longest out of all of them.
        for (int i=3;i<=len;i++){
            for (int j=0;j<len-i+1;j++){
                int k = j + i - 1;
                if (grid[j+1][k-1] && str.charAt(j) == str.charAt(k)){
                    grid[j][k] = true;
                    if (i > max_length){
                        max_length = i;
                        start = j;
                    }
                }
            }
        }
        StringBuffer ans = new StringBuffer();
        for (int i=start;i<start + max_length;i++){
            ans.append(str.charAt(i));
        }
        return ans.toString();
    }
    //Main Function
    public static void main(String[] args){
        String str = "xyzasisayzx";
        String ans = longestPalindromicSubstring(str);
        System.out.println(ans);
    }
}