### Nearest smaller element - Editorial

### Difficulty:  Medium

### Prerequisite:  Stacks.
---
### Hint

For an array A of length N, if A[k] > A[j] and A[k] > A[i] ( 1 <= i < j < k <= N ) , then A[j] is a better answer for A[k] than A[i] . 

### Short Explanation

* Let for any array A of length N, A[x1],A[x2],A[x3]....A[xk] are smaller then A[x] ( 1<= x1,x2,x3,...xk < x <= N). The A[ max ( x1, x2, x3,...., xk ) ] is the answer for A[x].

### Detailed Explanation

* Let A be an array of size N. For any element of array A[i] ( 1 <= i <= N ) A[j] is the nearest smaller element if:
  1. j<i 
  2. j is maximum possible
  3. A[i]>A[j].

* Hence to find the nearest smaller element for all A[i] ( 1 <= i <= N ) you can check iteratively the nearest index j (1 <= j < i ) such that A[i]>A[j]. But this will lead to time complexity of O(N*N) which will not satisfy as per the given constraints.
  
* Observation:

   1. If A[i] < A[j] ( 1 <= j < i <= N ), then A[j] can never the nearest smaller element for A[i].
   2. A[i] is a better answer for A[k] ( i < k ) than A[j].

* Hence to calculate the nearest smaller element for any A[i] ( 1 <= i <= N ) we maintain a stack S and pop out all A[j] > A[i] ( 1 <= j < i <= N ). After poping out all possible A[j]'s two situation may arise:
  
   1. If stack is empty, the answer for A[i] is -1.
   2. Else, the top element of stack is the nearest smaller element of A[i].

  Note - Dont forget pushing A[i] into the stack.   

* Pseudo code:
  
  ```python
  A[N]; // Array of size N
  
  Stack S;
  
  TOP;
  
  NearestSmallerNeighbour[N];

  for( i from 0 to N-1 ){
    
     while( S is not empty && S[TOP] > A[i] ){
     
	  pop the top element;
          TOP--;
    }
    
     if( S is not empty )
     
          NearestSmallerNeighbour[i] = S[TOP];
          
     else
     
          NearestSmallerNeighbour[i] = -1;
   
     TOP++;

     S[TOP] = A[i];

  ```        

* Example -
  ```python
  Let A = [ 1, 4, 3, 5, 2 ].

  
  Stack S // Initially empty.
  
  For i = 0, A[0] = 1, S is empty, hence nearest smaller neighbour of A[0] is -1. Now, push A[0] to S, hence S will be [ 1 ].
  
  For i = 1, A[1] = 4, S = [ 1 ], TOP is at 1. Since S[TOP] < A[1] no popping of elements is required. Hence nearest smaller neighbour of A[0] is 1. Now, push A[1] to S, hence S will be [ 1, 4 ].
  
  For i = 2, A[2] = 3, S = [ 1,4 ], TOP is at 4. Since S[TOP] > A[2], pop the TOP of stack. Hence new top of stack is at 1 which is smaller than 3. Hence nearest smaller neighbour of A[2] is 1. Now, push A[2] to S, hence S will be [ 1, 3 ].
  
  For i = 3, A[3] = 5, S = [ 1, 3 ], TOP is at 3. Since S[TOP] < A[3] no popping of elements is required. Hence nearest smaller neighbour of A[3] is 3. Now, push A[3] to S, hence S will be [ 1, 3, 5 ].
  
  For i = 4, A[4] = 2, S = [ 1, 3, 5 ], TOP = 5. Observe:
  
  S[TOP] = 5 > A[4], hence pop the top of stack. S = [ 1, 3 ], S[TOP] = 3.
  
  S[TOP] = 3 > A[4], hence pop the top of stack. S = [ 1 ], S[TOP] = 1.
  
  Stack S // Initially empty.
  
  For i = 0, A[0] = 1, S is empty, hence nearest smaller neighbour of A[0] is -1. Now, push A[0] to S, hence S will be [ 1 ].
  
  For i = 1, A[1] = 4, S = [ 1 ], TOP is at 1. Since S[TOP] < A[1] no popping of elements is required. Hence nearest smaller neighbour of A[0] is 1. Now, push A[1] to S, hence S will be [ 1, 4 ].
  
  For i = 2, A[2] = 3, S = [ 1,4 ], TOP is at 4. Since S[TOP] > A[2], pop the TOP of stack. Hence new top of stack is at 1 which is smaller than 3. Hence nearest smaller neighbour of A[2] is 1. Now, push A[2] to S, hence S will be [ 1, 3 ].
  
  For i = 3, A[3] = 5, S = [ 1, 3 ], TOP is at 3. Since S[TOP] < A[3] no popping of elements is required. Hence nearest smaller neighbour of A[3] is 3. Now, push A[3] to S, hence S will be [ 1, 3, 5 ].
  
  For i = 4, A[4] = 2, S = [ 1, 3, 5 ], TOP = 5. Observe:
  
  S[TOP] = 5 > A[4], hence pop the top of stack. S = [ 1, 3 ], S[TOP] = 3.
  
  S[TOP] = 3 > A[4], hence pop the top of stack. S = [ 1 ], S[TOP] = 1.
  
  S[TOP] < A[4], hence nearest smaller element of A[4] is 1.

  Hence nearest neighbour elements: [ -1, 1, 1, 3, 1 ].
  ```
### Time Complexity:

`O(N)`.

Each element of array A gets pushed and popped from the stack at most once.

### Space Complexity:

`O(N)`, At most N elements can be there inside the stack.

### Alternate Solution:

None
