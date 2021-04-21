import java.io.*;
import java.lang.*;
import java.util.*;

//This class implements the custom comparator, required for sorting the intervals array.
class comparator implements Comparator<int[]>{
	public int compare(int[] arr1,int[] arr2){
		for (int i=0;i<arr1.length;i++){
			if (arr1[i] != arr2[i]) return arr1[i] - arr2[i];
		}
		return 0;
	}
}
class Main{
	//This class returns true, if the person can attend all the meeting, else returns false.
	public static boolean meetingRooms(int[][] intervals){
		int max = -1;
		for (int i=0;i<intervals.length;i++){
			if (intervals[i][0] < max || intervals[i][1] < max) return false;
			max = intervals[i][1];
		}
		return true;
	}
	//Main Function.
	public static void main(String[] args){
		int[][] intervals = {{0,30}, {5,10}, {15,20}};
		Arrays.sort(intervals,new comparator());
		if (meetingRooms(intervals)) System.out.println("True");
		else{
			System.out.println("False");
		}

	}
}