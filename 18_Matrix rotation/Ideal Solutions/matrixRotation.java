import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
    //This function rotates the elements in the array in cl
    public static void matrixRotation(int[][] matrix){
        int n = matrix.length;
        for (int i=0;i<n/2;i++){
            for (int j=i;j<n-i-1;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n-i-1];
                matrix[j][n-i-1] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[n-j-1][i];
                matrix[n-j-1][i] = temp;
            }
        }
    }
    //This function prints the matrix.
    public static void printMatrix(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++) System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
    //Main function.
    public static void main(String[] args){
        int n = 3;
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        matrixRotation(matrix);
        printMatrix(matrix);

    }
}
