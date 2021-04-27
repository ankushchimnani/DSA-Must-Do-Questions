### Maximum sum subarray - Editorial

### Difficulty:  Medium

### Prerequisite:  Dynamic programming.
---
### Hint

Try looking for all non-negative contiguous segments of the array.

### Short Explanation

* For all contiguous segments of an array A of size N, keep track of maximum sum contiguous segment. If the sum of current segment is greater than the maximum sum, update the maximum sum with sum of current segment.

### Detailed Explanation

* Let A be the array of size N having containing integers.

* One way to solve this problem is to generate all subarrays and calculate their sum. Maximum sum among all obtained, is the required answer. 
 

  This leads to a time complexity of `O( N*N*N )` which is not desirable.


* Observation:

  Let for any array element A[i] ( 1 < i <= N ), CURR be sum of current subarray that includes A[i-1]. Let MAX be the maximum sum of all subarray possible till A[i-1].

  1. If CURR < 0 and A[i] > 0, then CURR + A[i] is reducing the value of A[i]. Hence it is better for CURR to be reset 0 at (i-1)th index.
  2. Else, assign CURR to CURR + A[i].
  3. If CURR > MAX, update the value of MAX with CURR.
  
  Hence iterating over the entire array and repeatedly updating the MAX value will fetch our required answer.

* Note - The above appraoch is known as Kadane's algorithm.

* Algorithm:
  ```python
  Let MAX be the maximum sum of all subarray possible till A[i-1].

  1. CURR = CURR + A[i].
  2. IF ( CURR > MAX ) then, CURR + MAX
  3. ELSE IF ( CURR < 0 ) then, CURR = 0.
  4. Return MAX.

  ```
* Example -
  ```python
  Let N = 8, A = [2, -3, 4, -1, -2, 1, 5, -3]
  
  CURR = 0, MAX = 0.
  
  Iteration 1: A[1] = 2, CURR = 2, MAX = 2.

  Iteration 2: A[2] = -3, CURR = -1, MAX = 2. Resent CURR to 0.

  Iteration 3: A[3] = 4, CURR = 4, MAX = 4.

  Iteration 4: A[4] = -1, CURR = 3, MAX = 4.

  Iteration 5: A[5] = -2, CURR = 1, MAX = 4.

  Iteration 6: A[6] = 1, CURR = 2, MAX = 4.

  Iteration 7: A[7] = 5, CURR = 7, MAX = 7.

  Iteration 8: A[8] = -3, CURR = 4, MAX = 7.

  Hence the sum of maximum subarray is 7.
  ```
### Time Complexity:

`O(N)`, where N is the size of array.

Maximum 32 iterations are required to calculate power of 2 as well as decimal value B.

### Space Complexity:

`O(1)`, no extra space is required.

### Alternate Solution:

None
