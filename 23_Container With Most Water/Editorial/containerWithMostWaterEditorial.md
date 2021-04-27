### Container with most water - Editorial

### Difficulty:  Medium

### Prerequisite:  Two pointers.
---
### Hint

Check for every pair of array elements to find out the maximum water that can be held. 

### Short Explanation

* For an array A of size N, the maximum water that can be held between array elements A[i] and A[j] = (j – i)* min(A[i],A[j]). Hence calculating the optimal pair of i,j 
  ( 1 <= i < j <= N ) and calculating the amount of water contained between them will fetch required answer.

### Detailed Explanation

* Let A be the array of size N, with A[1], A[2],...,A[N] be the height of boundaries.

* Observation:

  1. The water contained between two vertical lines A[i] and A[j] ( 1 <= i < j <= N ) will always be limited by the height of the shorter line.
  2. The farther is the distance between A[i] and A[j] is, more the water that can be contained.
  3. The maximum water that can be obtained between A[i] and A[j] is (j - i)*min(i,j).
  

* One simple way is to use two nested loops and calculate the amount of water that can be held between each pair of array element and to take the maximum among them. This leads   to a time complexity of O(N*N) which is not desirable.

* But what can be the optimal boundaries i and j ( 1 <= i < j <= N ) such that that amount of water obtained between them is maximum among all pairs?
  
  For this we employ the two pointer's appraoch.

* Two pointer's approach:
  
  1. Take two pinters first and last and assign them to indices 1 and N respectively. Check the amount of water that can be contained between A[first] and A[last].
  2. If the A[first] < A[last], then increase the first pointer by one else decrease the last pointer by one.
  3. Repeat this until the first pointer is less than the last pointer .
  
  Maximum water calculated for all possible pairs of first and last is our required answer.
  
  Why this works?

  Let A[first] < A[last]. Let us move first index one step ahead.
  
  Hence area between A[first + 1] and A[last] equals = (last - first - 1)*min( A[first+1], A[last] ) --> Case 1.
  
  Now, if we move last one step back, we get the area between first and last as: (last - first - 1)*min( A[first], A[last-1] ) --> Case 2.
  
  Also, let A[last - 1] > A[last], A[first + 1 ] > A[last] and, A[last-1] = A[first+1].
  
  Hence amount of water for case 1 equals : (last-first-1)*A[last].
  
  Also for case 2 it will be : (last-first-1)*(A[first]).
  
  Since A[last] > A[first]: Area for case 1 is more as compared to area of case 2.

* Pseudo code:
  
  ```python
  MAX_WATER; // Maximum amount of water that can be obtained

  First = 1, Last = N;
  
  while( First < Last ){
  
     MAX_WATER = MAX( ( Last - First )*( MIN(A[Last],A[First]) ) );
  
     if( A[First] < A[Last] )
     
         First++;
         
     else
     
        Last--;
  }
  ```
* Example -
  ```python
  Let N = 9, array A =  [1,8,6,2,5,4,8,3,7].
  
  First = 1, Last = 9.
  
  MAX_AREA = 0 // Initially no area.
  
  Iteration 1: Area between A[1] and A[9] = 8, A[1]<A[9], hence move first one step ahead. First = 2, Last = 9, MAX_AREA = 9.
  
  Iteration 2: Area between A[2] and A[9] = 49, A[2]>A[9], hence move last one step back. First = 2, Last = 8, MAX_AREA = 49. 
  
  Iteration 3: Area between A[2] and A[8] = 18, A[2]>A[8], hence move last one step back. First = 2, Last = 7, MAX_AREA = 49.
  
  Iteration 4: Area between A[2] and A[7] = 40, A[2]==A[7], hence move last one step back. First = 2, Last = 6, MAX_AREA = 49. 
  
  Iteration 5: Area between A[2] and A[6] = 16, A[2]>A[6], hence move last one step back. First = 2, Last = 5, MAX_AREA = 49.
  
  Iteration 6: Area between A[2] and A[5] = 15, A[2]>A[5], hence move last one step back. First = 2, Last = 4, MAX_AREA = 49.
  
  Iteration 7: Area between A[2] and A[4] = 4, A[2]>A[4], hence move last one step back. First = 2, Last = 3, MAX_AREA = 49.
  
  Iteration 8: Area between A[2] and A[3] = 6, A[2]>A[1], hence move last one step back. First = 2, Last = 2, MAX_AREA = 49.
 
  Hence the maximum water for all iterations is 49.
  ```
### Time Complexity:

`O(N)`, where N is the size of the array.

Maximum of N iterations are possible for the two pointers approach.

### Space Complexity:

`O(1)`, No extra space is required.


### Alternate Solution:

None
