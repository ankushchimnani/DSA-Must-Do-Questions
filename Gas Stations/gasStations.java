import java.io.*;
import java.lang.*;
import java.util.*;


class Main{
	//This function calculates the possible starting point, or else returns -1.
	public static int gasStations(int[] gas,int[] cost){
		int current_gas = 0;
		int total_gas = 0;
		int start = 0;
		for (int i=0;i<gas.length;i++){
			total_gas += (gas[i] - cost[i]);
			current_gas += (gas[i] - cost[i]);
			if (current_gas < 0){ //This indicates that we were unable to reach this point, so we update the start.
				start = i + 1;
				current_gas = 0;
			}  
		}
		return total_gas >= 0 ? start : -1; //If the total gas required is less than the total gas available at all the stations, then it will not be possible to complete a full circle.
	}

	//Main Function
	public static void main(String[] args){
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		int ans = gasStations(gas,cost);
		System.out.println(ans);

	}
}