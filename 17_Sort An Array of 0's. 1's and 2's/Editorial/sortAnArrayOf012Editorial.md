### Sort an Array of 0s, 1s, or 2s - Editorial

### Difficulty:  Easy

### Prerequisite:  Hashing.
---

### Hint

Count the number of 0's, 1's, and 2's.

### Short Explanation

* For an array A of N elements having only 0's, 1's and 2's then, it is obvious that if we sort the array A all of the 0's will come first followed by 1's and then 2's. Hence we can count the occurrences of 0's, 1's and, 2's and update the values of array elements accordingly to sort the required array. 

### Detailed Explanation

* Let A be the array of size N, having x occurrences of 0's ( 0 <= x <= N ), y occurrences of 1's ( 0 <= y <= N ) and, z occurrences of 2's ( 0 <= z <= N ).

* Observation:
  1. x + y + z = N.
  2. In A is sorted then, first x elements of A are 0, next y elements of A are 1 and last z elements are 2.
 
* Hence we can simply count the number of occurrences of 0's, 1's and, 2's in array A, and, accordingly assign the update the values of first x indices of A to 0, next y indices to 1 and, last z indices to 2.
  
  This sorts the array A.

* Pseudo code:
  
  ```python
  A[N]; // Array of size N

  x = 0, y = 0, z = 0; // Number of occurrences of 0, 1 and 2.

  for ( i from 0 to N-1){

     if( A[i] == 0 )
     
        x++;

     else if ( A[i] == 1 )

        y++;

     else

        z++;
 
  }

  idx = 0; // Initialising the index to 0

  while( x > 0 )

      arr[idx++] = 0;

  while( y > 0 )

      arr[idx++] = 1;
 
  while( z > 0 )

      arr[idx++] = 2;

  ```
* Example -
  ```python
  N = 6, A = [0, 1, 2, 0, 1, 2];
  
  Number of 0's occurred = 2.

  Number of 1's occurred = 2.

  Number of 2's occurred = 2.

  Hence sorted array will be: [ 0, 0, 1, 1, 2, 2 ].
  ```

### Time Complexity:

`O(N)`, where N is the size of array

Entire array needs to be traversed only once to count the required occurrences of 0, 1 and, 2.

### Space Complexity:

`O(1)`, constant extra space is required.

### Alternate Solution:

None
