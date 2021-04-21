import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    //This is the partition function of quick sort
    static int partition(int[] arr, int low, int high){
        int p_index=low;
        int pivot = arr[high];
        for(int i=low; i<high; i++){
            if(arr[i] <= pivot){
                // swap arr[p_index] and arr[i]
                int temp = arr[i];
                arr[i] = arr[p_index];
                arr[p_index] = temp;

                p_index++;
            }
        }
        //swap pivot with element at p_index
        arr[high] = arr[p_index];
        arr[p_index] = pivot;
        return p_index;
    }
    //This recursive function implements the quick sort algorithm with the help of partition function.
    static void quicksort(int[] arr, int low, int high){
        if(low<high){
            int p_index = partition(arr, low, high);

            quicksort(arr, low, p_index-1);
            quicksort(arr, p_index+1, high);
        }
    }
    //This is the main function
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {2,6,3,0,4,1};
        quicksort(arr,0, n-1);
        for(int each:arr) System.out.print(each+" ");
        System.out.println();
    }
}
