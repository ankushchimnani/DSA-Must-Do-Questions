### Check if the given number is a power of two - Editorial

### Difficulty:  Easy

### Prerequisite:  Maths.
---
### Hint

Numbers like 1, 2, 4, 8, 16, ... are powers of 2.

### Short Explanation

* A number X is a power of 2, if X has no prime factor other than 2.

### Detailed Explanation

* If a number Z is a power of 2, it can be represented as 2^x (x>=0). Hence after dividing the number Z by 2, x number of times it should reduce to 1.

* Hence to check, it is optimal to iteratively divide Z by 2, keeping a check that whether at each step Z is divisible by 2 or not. If Z gets reduced to 1, then Z is a power of 2.

* Pseudo code:

  ```python
  while( Z%2 == 0){
	
	Z = Z/2;
   }
   
  if( Z == 1 )
	"Given number is a power of 2";
  
  else
	"Given number is not a power of 2";
	
  ```

* Example:
  ```python
  Let Z = 8.

  Iteration 1: 8%2 equals 0, hence Z = 8/2 = 4.
  
  Iteration 2: 4%2 equals 0, hence Z = 4/2 = 2.
  
  Iteration 3: 2%2 equals 0, hence Z = 2/2 = 1.
  
  Iteration 4: 1%2 equals 1, hence loop ends.
  
  Since Z is equal to 1, hence the given number is a power of 2.

  Let Z = 6.
  
  Iteration 1: 6%2 equals 0, hence Z = 6/2 = 3.
  
  Iteration 2: 3%2 equals 1, loop ends.
  
  Since Z is not equal to 1, hence the given number is not a power of 2.
  ```
### Time Complexity:

`O(log(N))`, where `N` given number.

It will take maximum of `log(N)` operations to check of power of 2.

### Space Complexity:

`O(1)`, No extra space is required.

### Alternate Solution:

   Let Z be the given number to check for.

1. Let X = log(Z).
   If 2^X = Z, then Z is power of 2, else it is not.

2. If Z is a power of 2, then it has only one set bit in its binary representation. Let X = Z - 1.
   It can be observed that binary representation of X is equal to 1's complement of Z, i.e. if binary representation of Z is 1000, then for X it is 0111.
   Hence value of Z&X or Z&(Z-1) equals 0, where & is bitwise AND operator.
   
