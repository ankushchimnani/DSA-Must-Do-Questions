### Queue Using Two Stacks - Editorial

### Difficulty:  Medium

### Prerequisite:  Queues, Stacks.
---
### Hint

One stack can be used for enqueue operations, while the other one can be used for dequeue operations.

### Short Explanation

* Let stack_enq and stack_deq be the two required stacks. For an element X is to be enqueued into the queue, X can be simply pushed to stack_enq. 
  Now, for a dequeue operation, if stack_deq is empty, all the elements can be popped from stack_enq one by one, and can be pushed into stack_deq. Hence, in this way the order of the enqueued elements is reversed and the first enqueued element can be accessed on the top of stack_deq.
  
### Detailed Explanation

* To implement a queue using two stacks the following methods can be employed.
  
* Method 1 : Keeping that oldest entered element at the top of a stack. 
  
  Let S1, S2 be the required stacks. Let the oldest entered element is always maintained at the top of stack S1. Hence, for the dequeue operation popping the top element of S1 can fetch the the dequeue the front in no time.
  
  How can we do that?

  Let an element X is to be enqueued.

  Now, since X is the most recent element, ideally, it should be kept at the bottom of S1. Hence to keep X at the bottom of S1 the following can be done:
  1. Pop all the elements of S1 one by one, and push them to S2.
  2. Push X into S1.
  3. Pop all the elements of S2 one by one, and push them to S1.
  
  Thus, the oldest element is always maintained at the top of S1.

* Method 2 : Keeping that most recent element at the top of a stack. 
  
  Let S1, S2 be the required stacks. Let the most recent element is to be kept at the top of stack S1. But how can we fetch the front element for dequeue operation? 

  Steps to be followed:

  1. If any element X is to be enqueued, push it to S1.
  2. If S2 is empty then, pop all the elements of S1 one by one and push it to S2. The top element of S2 is the front element required for dequeue operation.

  Since S2 is both filled and emptied in method 1 while S2 is only filled once in method 2, method 2 works faster than method 1.
  
  // Note- In the given question there are N queries in which enqueue operations are indicated by queries of type 1 while dequeue operations are indicated by queries of type 2. 

* Pseudo code:
  
  // Method 1
  ```python
  Stack S1, S2;
  TOP1, TOP2;
  
  enqueue( X ){
    
     while( S1 is not empty ){
     
        TOP2++;
        S2[TOP2] = S1[TOP1];
        TOP1--;
     }
     
     TOP1++;
     
     S1[TOP1] = X;

     while( S2 is not empty ){
     
        TOP1++;
        S1[TOP1] = S2[TOP2];
        TOP2--;
     }
  }
  
  dequeue(){
  
    X = S1[TOP1];
    TOP1--;
  }
  ```
 
  // Method 2
  
  ```python
  Stack S1, S2;
  TOP1, TOP2;
  
  enqueue( X ){
    
     TOP1++;
     S1[TOP1] = X;
  }
  
  dequeue(){

    if(S2 is empty ){
       while( S1 is not empty ){
        TOP2++;
        S2[TOP2] = S1[TOP1];
        TOP1--;
     }  
  }

  X = S2[TOP2];
  TOP2--;
 
  }
  ```
* Example -
  
  // Only Method 2 is shown
  ```python
  N = 5
  
  1 2 1 3 2 1 4 2
  
  Let S1 and S2 be the required stacks.

  Query 1: Query type = 1, X = 2. S1 = { 2 }, S2 = { }.
  
  Query 2: Query type = 1, X = 3. S1 = { 2, 3 }, S2 = { }.
  
  Query 3: Query type = 2. S1 = {  }, S2 = { 3, 2}. Front element = 2, hence update S2 = { 3 }.
  
  Query 4: Query type = 1, X = 4. S1 = { 4 }, S2 = { 3 }.
  
  Query 5: Query type = 2. S1 = { 4 }, S2 = { 3 }. Since S2 is not empty, front element = 3, updated S2 = { }.
  ```

### Time Complexity:

Method 1:

Push operation : `O(N)` where N is the size of stack S1.

Pop operation : `O(1)`.

All elements of S1 is popped and pushed to S2 while enqueue operation.

Method 2:

Push operation : `O(1)`

Pop operation : `O(N)`. where N is the size of stack S1.

If stack S2 is empty, all elements of S1 is to be popped and pushed to stack S2.

### Space Complexity:

`O(N)`, Two separated stacks and required for dequeue and enqueue operations.

### Alternate Solution:

None
