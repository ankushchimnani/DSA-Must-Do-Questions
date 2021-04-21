import java.util.*;
import java.lang.*;
import java.io.*;

class Main{

    static HashSet<String> map = new HashSet<>(); //This global variable stores all the unique solution for the N queens problem
    
    //Main function
    public static void main(String[] args){
        int n = 4;
        totalNQueens(n);
        if (map.size() == 0) System.out.println("Not Possible");
        else{
            List<String> possibleCombinations = new ArrayList<>();
            for (String i : map) possibleCombinations.add(i);
            System.out.println(possibleCombinations.get(0));
        }
    }
    //This function finds all the unique solutions to the N - Queens Problem
    public static void totalNQueens(int n) {
        if (n==0) return ;
        int[][] matrix = new int[n][n];
        HashSet<Integer> d1 = new HashSet<>();
        HashSet<Integer> d2 = new HashSet<>();
        HashSet<Integer> v = new HashSet<>();
        checkForAttack(matrix,d1,d2,v,0);
        return ;
    }
    //This function checks if the queen is under attack, from any direction.
    public static void checkForAttack(int[][] matrix,HashSet<Integer> d1,HashSet<Integer> d2,HashSet<Integer> v,int row){
        if (row==matrix.length){
            add(matrix);
            return ;
        }
        for (int j=0;j<matrix.length;j++){
            if (d1.contains(row+j) || d2.contains(j-row) || v.contains(j) || matrix[row][j]==1){
                continue;
            }
            matrix[row][j] = 1;
            d1.add(row+j);
            d2.add(j - row);
            v.add(j);
            checkForAttack(matrix,d1,d2,v,row+1);
            matrix[row][j] = 0;
            d1.remove(row+j);
            d2.remove(j - row);
            v.remove(j);
        }
        
    }

    //This function adds the solution to the set of solutions if it already does not exists.
    public static void add(int[][] matrix){
        StringBuffer temp = new StringBuffer();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                temp.append(matrix[i][j] + " ");
            }
            temp.append("\n");
        }
        if (!map.contains(temp.toString())){
            map.add(temp.toString());
        }
    }
    
}