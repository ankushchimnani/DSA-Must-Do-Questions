### Gas stations - Editorial

### Difficulty:  Medium

### Prerequisite:  Greedy.
---
### Hint

Try each station X, ( 1 <= X <= N ) as the starting station.

### Short Explanation

* Let X and Y ( 1 <= X,Y <= N ) be the current and previous stations respectively. In travelling from Y to X, let L is the amount of gas left in the tank. Now for going from X to the next station, L + gas[X] - cost[X] > 0.
  Hence for each station S ( 1 <= S <= N ) as the starting station, we may check whether it is possible to travel a complete circuit based upon the above condition. If for any station it is possible, it serves as the required answer. 
  If for any of stations as a starting point, a complete circuit can't be completed, the answer is -1.
  
### Detailed Explanation

* Let N be the number os stations with cost[] and gas[] be the required cost and gas arrays respectively.

* One simple way to approach the problem is to consider all the stations as starting point one by one and try completing the circuit. If it is possible to complete a circuit for   a station i ( 1 <= i <= N ) then, i will be the required answer. This takes a time complexity of  O(N*N) which is not desirable.

* Observation:
  
  1. It is impossible to travel the entire circuit if Σgas[i] < Σcost[i] ( 1 <= i <= N ).
  2. It is impossible to start at the ith station, if gas[i] < cost[i] ( 1 <= i <= N ).

* Approach:
  
  At first,
  
  Iterate over all stations and calculate the value of Σgas[i] - Σcost[i] for all i ( 1 <= i <= N ). If the value is non negative the answer is always -1. Else, there always exists an answer.
 
  How to calculate the starting station?
  
  Let L be the leftover gas in the tank initially equal to 0. Also, let S be the starting station intially equal to 1.
  
  Iterate over all stations i from 1 to N one by one.

  1. If, L + gas[i] - cost[i] < 0, change S to i+1 and, reset the value of L to 0.
  2. Else, assign L to L + gas[i]-cost[i]. 

  After the iteration over all stations is over, if L >= 0, the value of S is the required answer.

* Why this works?

  If L >= 0 it surely possible to reach station 1 from S. But is it always possible to reach S from 1?

  Let us assume that a station k ( 1 < k < S ) is unreachable from S.
  
  Also, as per our observation:
  
  For an entire circuit to get completed from S: Σgas[i] - Σcost[i] >= 0 for all i, ( 1 <= i <= N ). Let this value be G.
  
  Let,
  
  A = Σgas[i] - Σcost[i], for all i, ( 1 <= i <= k ) --> Total amount to gas from station 1 to station k+1.
  
  B = Σgas[i] - Σcost[i], for all i, ( k < i < S ) --> Total amount to gas from station k+1 to station S.
  
  C = Σgas[i] - Σcost[i], for all i, ( S <= i <= N ) --> Total amount to gas from station S to station 1.
  
  Observe that since S is our starting station and as per our assumption we can't reach k from S, hence, B <= 0 - (1).
  
  Again,
  
  A + B + C = G >= 0 (2).

  Adding 1 and 2 we get, A + C >= 0.
  
  But since, k is unreachable from S, A+C < 0.
  
  Hence our assumption is wrong.

  Hence our solution is optimal.
  
  
* Pseudo code:
  ```python
  gas[N]; // Amount of gas at all of N stations
  
  cost[N]; // Cost to reach station i+1 from station i.

  L = 0; // Left over gas
  
  S = 1; // Start station
  
  T = 0; // Total amount of gas
  
  for( i = 1 to N ){
    
     T = T + gas[i] - cost[i];

     if( L + gas[i] - cost[i] > 0 ){
     
        L =  L + gas[i] - cost[i];
     }

     else{
     
        L = i + 1;
        L = 0;
     }
  }
  
  if( T < 0 )
  
    print -1;
    
  else
  
    print S;
       
  ```
* Example -
  ```python
  gas = [1,2,3,4,5]
  
  cost = [3,4,5,1,2]
  
  Let L = 0, T = 0, S = 1.

  Iteration 1: L + gas[1] - cost[1] = -2 => S = 2, L = 0. T = -2

  Iteration 2: L + gas[2] - cost[2] = -2 => S = 3, L = 0. T = -4

  Iteration 3: L + gas[3] - cost[3] = -2 => S = 4, L = 0. T = -6

  Iteration 4: L + gas[4] - cost[4] = 3 => S = 4, L = 3. T = 3

  Iteration 5: L + gas[5] - cost[5] = 6 => S = 4, L = 6. T = 0

  Since, T is non-negative, hence S = 4, is our starting station.
  ```
### Time Complexity:

`O(N)`. where N is the size of the array.

The entire array is iterated only once.

### Space Complexity:

`O(1)`, No extra space is required.

### Alternate Solution:

None
