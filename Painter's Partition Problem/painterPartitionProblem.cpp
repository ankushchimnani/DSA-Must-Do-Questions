#include<bits/stdc++.h>
using namespace std;

// Function to find maximum number of painters to paint the board in most_time

int findPainters(int board[], int most_time, int n) {
    
    int s = 0, painters = 1; 
    
    // check for maximum number of painters required
    for (int i = 0; i < n; i++) {
        
        s += board[i]; 
  
        if (s > most_time) {
            
            s = board[i]; 
            painters++; 
        } 
    } 
  
    return painters; 
} 

// Function to partition the board among painters

int partition(int board[], int k, int n) {
    
    // Maximum and minimum time 
    int s = 0, m = 0;
    
    for(int i = 0; i < n; i++){
        
        m = max(m, board[i]);
        s += board[i];
    }
    
    int low = m, high = s;
    
  // Set the maximum time
    while (low < high){
        
        int mid = low + (high - low) / 2; 
        
        int painters = findPainters(board, mid, n); 
  
        if (painters <= k) high = mid; 
        
        else low = mid + 1; 
    } 
    
    return low; 
} 

int main(){
    
    int k = 2;
    
    int n = 4; // size of board
     
    int A[] = { 10, 10, 10, 10 }; // board confiuration
    
    cout<<partition(A, k, n)<<"\n";
    
}
