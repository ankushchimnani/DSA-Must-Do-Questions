### Stack using two queues - Editorial

### Difficulty:  Medium

### Prerequisite:  Stacks, Queues.
---
### Hint


One queue can be used for push operations, while the other one can be used for pop operations.

### Short Explanation

* Let q1 and q2 be the required two queues. For an element X to be pushed into the stack, enqueue it to q1. Now for pop operations, if q2 is empty then, dequeue all the elements of q1 except the last and enque them to q1. The only remaining element of q1 is the top of stack.

### Detailed Explanation

* To implement a queue using two stacks the following methods can be employed.
  
* Let q1, q2 be the required queues. Let X1,X2,X3,...,Xk be the present elements of stack with X1 be the front of q1. 

  How can fetch the top of stack?

  Let an element X is to be pushed.

  Now, since X is the most recent element, ideally, it will always be enqueued at the rear of q1. Hence,
  Enqueue X to q1.
  Now if,
  All elements of q1 except the last are dequeued one by one and enqueued to q2 then, front element of q1 is X, which is the required top of the stack.

  But if X is popped, the rear of q2, i.e. Xk should be the top of stack. How can we get that? What will happen if we treat q2 as q1 and vice-versa to get the top of stack after X is popped ?
  
  If we dequeue all the elements of q2 except the last and enqueue them to q1, the last element of q2 left is Xk which is the current top of our stack. Hence q1 and q2 can be used alternatively to achieve the top element of the stack.

* Method 1: While enqueueing X to q1, dequeue all the elements of q1 except the last and enqueue them to q1, thus making the push operation costly.
  
* Method 2: While accessin the top of stack or performing pop operation, dequeue all the elements of q1 except the last and enqueue them to q1, thus making the pop operation costly.

* Pseudo code:
  
  // Method 1
 ```python 
 QUEUE Q1, Q2;

 
 F1, F2; // Fronts of Q1 and Q2 respectively
 

 F1, F2; // Fronts of Q1 and Q2 respectively

 R1, R2; // Rears of Q1 and Q2 respectively

 PUSH( X ){

   R1++;

   
   Q1[ R1 ] = X;
   
   while( F1 + 1 != R1 ){
   
     Q2[ R2++ ] = Q1[F1++];
     

   Q1[ R1 ] = X;
   
   while( F1 + 1 != R1 ){
   
     Q2[ R2++ ] = Q1[F1++];

   }
   
 }

 POP(){

 X = Q1[F1];

 F1++;

 }    
 ```
 // Method 2
 
 ```python
  
 QUEUE Q1, Q2;

 
 F1, F2; // Fronts of Q1 and Q2 respectively
 
 F1, F2; // Fronts of Q1 and Q2 respectively

 R1, R2; // Rears of Q1 and Q2 respectively

 PUSH( X ){

   R1++;

   Q1[ R1 ] = X;
   
 }

 POP(){

 while( F1 + 1 != R1 ){


     Q2[ R2++ ] = Q1[F1++];
 }

 X = Q1[F1];

 F1++;

 } 
 ```
* Example -
  
 // Only Method 2 is shown
 ```python
  q1, q2 // Two required queues

  push(2), q1 = { 2 }, q2 = { }

  push(3), q1 = { 2, 3 }, q2 = { }
  
  pop(),   q1 = { 3 }, q2 = { 2 }. Top of stack is front of q1 = 3. After top of stack is popped, q1 = { }, q2 = { 2 }.
  
  push(4), q1 = { }, q2 = { 2, 4 },  q1 to be treated as q2 and vice versa.

  push(3), q1 = { 2, 3 }, q2 = { }
  
  pop(),   q1 = { 3 }, q2 = { 2 }. Top of stack is front of q1 = 3. After top of stack is popped, q1 = { }, q2 = { 2 }.
  
  push(4), q1 = { }, q2 = { 2, 4 },  q1 to be treated as q2 and vice versa.

  pop(),   q1 = { 2 }, q2 = { 4 }. Top of stack is front of q2 = 4. After top of stack is popped, q1 = { 2 }, q2 = { }.
 ```

### Time Complexity:

`O(1)`, for push operation and, `O(N)` for pop operation and vice versa.

Element X is enqueued into q1 for push operation. For pop operation N-1 elements of q1 is dequeued and enqueued to q2. 

### Space Complexity:

`O(N)`, where N is the number of elements pushed into the stack

At most N extra elements can reside inside the queues.

### Alternate Solution:

None
