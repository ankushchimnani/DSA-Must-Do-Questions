### Min stack - Editorial

### Difficulty:  Hard

### Prerequisite: Stacks.
---
### Hint

If A < B then 2A - B < A. 

### Short Explanation

* Let S be the stack having K elements with M be the minimum of all K elements. Consider push and pop in stack :
 
  Let X be the (K+1)th element to be inserted into the stack, then:

  1. If X >= M, push X into the stack. M remains unchanged.
  2. Else, push 2X - M into the stack. Since X < M, change the value of M to X.

  Let T be the top element of the stack to be removed, then:
  1. If T >= M, M remains unchanged.
  2. If T < M, then after removing T, value of M changes to 2M-T.

  Hence we can perform push and pop operations accordingly and keep a track of minimum element at each step. 

### Detailed Explanation

* Let S be the stack having elements x1, x2, x3, ..., xk with xk being the top element. Also, let M be the minimum among all K elements.
  
* Lemma:
  
  If A < B then, 2A - B < A.

* Proof :
  
  Since,
  A < B then, A - B < 0.
  Hence,
  A - B + A < A
  2A - B < A. 
  
  Now, if element X is to be inserted into the stack S then, two situations may arise:
  1. X >= M.
     Observation:
     Pushing X inside stack doesn't change the value of M.
  2. X < M.
     Observation:
     Pushing X inside stack changes the value of M to X.
  
  Also, if T is the top element of stack S, then while poping out T, two situation may arise:
  1. T > M.
     Observation:
     Poping out T from stack, will not affect the value of M.
  2. T = M.
     Observation:
     If T is popped out, value of M becomes >= T.

  Hence if T = M and T is popped, how can we check whether value of M changes or not?

  Let if X < M, instead of X, we push 2X - M into the stack and change the current value of M to X. Hence 2X - M is the new top of stack S. Now, if pop operation is performed then 2X - M will be popped. But during the pop operation it can be observed that value of M > Top of the stack. Since it is a bit unusual, it can serve as a signal that value of M may change.
  Now since top of stack was: 2X - M, hence,
  if we subtract 2X with ( 2X - M ),  we can retrieve the previous value of M.
  
  Hence if we maintain the current value of min element for each push and pop operations we can answer each getMin() in O(1) time without any extra space.
  
* Pseudo code:
  
  // Code for Stack operations
  ```python
  Stack S;
  X; // Element to be pushed
  
  M; // Minimum of stack.
  
  TOP; // Top of stack

  PUSH(X):

  if( S is empty ){
    
    push(X);
    M = X;
  }

  else{

     TOP++;

     if(X >= M ){
     S[TOP] = X;
     }

     else{
       S[TOP] = 2X - M;
       M = X;
     }
       
  }

  POP():
  
  if( S[TOP] >= M )
     TOP--;
  
  else{
     M = 2M - S[TOP];
     TOP--;
   }
   ```
* Example -
  ```python
  Stack S;

  push(3), S = { 3 }, M = 3.
  
  push(5), 5 > 3, hence push 5, S = { 3, 5 }, M = 3.
  
  push(1), 1 < 5, hence push 2*1 - 3, S = { 3, 5, -1 }, M = 1.
  
  getMin(), M = 1.
  
  pop(), top of stack = -1 and M = 1, 1 > -1 => something unusual, hence pop -1, S = { 3, 5 }, M = 2*1 - (-1) => M = 3.
  
  getMin(), M = 3.
 
  ```
  

### Time Complexity:

`O(1)`, for each operation

### Space Complexity:

`O(1)`, No extra space is required.

### Alternate Solution:

None
