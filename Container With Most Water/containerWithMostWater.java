import java.io.*;
import java.util.*;
import java.lang.*;


class Main{
	//This function out the value of the container with most water.
	public static int containerWithMostWater(int[] container){
		int left = 0;
		int right = container.length-1;
		int max_area = 0;
		while(left < right){
			max_area = Math.max(max_area, Math.min(container[left],container[right])*(right - left));
			if (container[left] < container[right]) left++;
			else{
				right--;
			}
		}
		return max_area;
	}
	//Main function
	public static void main(String[] args){
		int[] container = {1,8,6,2,5,4,8,3,7};
		int max_area = containerWithMostWater(container);
        System.out.println(max_area);
	}
}