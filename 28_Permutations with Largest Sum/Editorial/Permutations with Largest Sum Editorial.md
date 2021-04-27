### Permutation with Largest Sum - Editorial

### Difficulty:  Medium

### Prerequisite:  Sorting, greedy techniques.
---
### Hint

Let L be the largest array element. For what value of i ( 1 <= i <= N ), L*i has the greatest value? 

### Short Explanation

* Arranging the entire array elements in non-decreasing order will give the greatest value of the expression: Σarr[i]*i.

### Detailed Explanation

* Observation : For any array A having N integers A1, A2, A3, A4, A5, ..., An, sorting the array in non decreasing order will give the greatest value of the expression : Σarr[i]*i.
  
* Lemma :

  For integers A, B, C, and D such that A >= B and C >= D, AC + BD >= AD + BC.

* Proof:

  Since, A >= B and C >= D, hence,

  A = B + x, for some non-negative integer x, and,
  C = D + y, for some non-negative integer y.
  
  Hence,
  
  AC + BD = ( B + x )( D + y ) + BD = 2BD + By + Dx + xy

  Also,

  AD + BC = ( B + x )D + B( D + y ) = 2BD + Dx + By.

  The above clearly shows that our AC + BD > AD + BC.

* Hence it is optimal to assign the greatest integer of array A to index N, next greatest to index N-1,..., smallest integer to index 1. 

### Example
  ```python
  N = 2 and A is : [ 3, 4 ].
  
  It can be observed that:
  3*1 + 4*2 > 4*1 + 3*2

  Hence for N = 2, our lemma gives correct results.
  
 Similarly for any value of N, the lemma is correct.
  
 The above results can be achieved just by sorting the entire array in non-decreasing order.
 ```
### Time Complexity:

`O(Nlog(N))`, where `N` is the size of the array A.

Nlog(N) is required to sort the array A.

### Space Complexity:

`O(1)`, No extra space required.


### Alternate Solution:

If constraints are small, bitmasking can be employed to solve the problem.
