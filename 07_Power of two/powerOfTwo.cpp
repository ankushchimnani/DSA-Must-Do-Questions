#include<bits/stdc++.h>
using namespace std;

// Function to check if N is power of 2

bool isPowerOfTwo(int N){
    
    // Repeated division by 2
    
    while( N%2 == 0)
        N/= 2;
        
    
    if(N == 1)
       return true;
       
    else
       return false;

   
}


int main(){
    
	int N = 4;
	
	if( isPowerOfTwo(N) )
	    cout<<"Yes"<<"\n";
	    
	else
	    cout<<"No"<<"\n";
	
  return 0;
  
}
