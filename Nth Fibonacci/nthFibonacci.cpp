#include<bits/stdc++.h>
using namespace std;

// Function to calculate Nth fibonacci
 
int fibonacci(int N){
  
    int F1 = 1, F2 = 1, Fn;
    
    for(int i = 3; i <= N; i++){
      
       Fn = F1 + F2;
       F1 = F2;
       F2 = Fn;
    }
    
    if( N == 1 )
       return F1;
    if( N == 2)
       return F2;
       
    return Fn;
}
 
 
int main(){
  
    int N = 5;
     
    cout << fibonacci(N);
  
    return 0;
}
