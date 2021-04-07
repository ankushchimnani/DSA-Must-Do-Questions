#include<bits/stdc++.h>
using namespace std;

// Function that returns the best price for a rod of length n

int cutRod(int price[], int N){
    
   int dp[N+1];
   dp[0] = 0;
   int i, j;
  
   // Build the  dp table val[] in bottom up manner 
   
   for (i = 1; i<= N; i++){
       
       dp[i] = INT_MIN;
       
       for (j = 0; j < i; j++)
         dp[i] = max(dp[i], price[j] + dp[i-j-1]);
        
   }
  
   // Return the maximum price
   return dp[N];
}


int main(){
    
    int N = 8; // Size of Rod
    
	int price [] = {1, 5, 8, 9, 10, 17, 17, 20}; // Price for different pieces
	
	cout<<cutRod(price, N) <<"\n";
	
	return 0;
}
