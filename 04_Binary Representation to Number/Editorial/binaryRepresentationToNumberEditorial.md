### Binary Representation to Number - Editorial

### Difficulty:  Easy

### Prerequisite:  Maths, Bit manipulation.
---
### Hint

The decimal value for any bit k ( 0 <= k <= 31 ) is 2^(k). 

### Short Explanation

* For any binary string B, its decimal value is ΣB[i]*(2^i) ( 0 <= i <= 31 ) .

### Detailed Explanation

* Let there are k ( 0 <= k <= 32 ) set bits for a binary string B. 
  Let x1, x2, x3, .... xk ( 0 <= x1, x2, x3, ..., xk <= 31) be the positions such that 
  B[ x1 ] = B [ x2 ] = .... = B[ xk ] = 1. 
  Note - All of x1, x2, x3,... , xk are pairwise distinct.

* Decimal value of a given binary string B is equal to ΣB[ xi ]*2^(xi).

* Hence to find the decimal value we can simply extract all the set bits of binary string B and take the summation of their decimal values. This will require computing the powers of 2. You can precompute them which take O(1) time complexity.

* Pseudo code:
  
  ```python
  // Pre computing power of two
  
  powersOfTwo[32];
  
  powersOfTwo[0] = 1;

  for( i from 1 to 31 )
  
	powersOfTwo[i] = powersOfTwo[i-1]*2;
 
  // Decimal value of binary string B
  
  decimalValueOfB = 0;

  for( i from 0 to 31 ){
     
     if( B[i] == 1 )
        
          decimalValueOfB = decimalValueOfB + powersOfTwo[i];
    
  }
  ```
* Example -
  ```python
  Let B = 00000000000000000000000000000111.
  
  Let D be the decimal value of B initialised to 0;

  For i = 0, B[0] = 1, hence D = D + (2^0) = 1.
  
  For i = 1, B[1] = 1, hence D = D + (2^1) = 3.
  
  For i = 2, B[2] = 1, hence D = D + (2^2) = 7.
  
  For i = 3, B[3] = 0, hence value of D will not change.
  
  Similary for all i ( 4 <= i < 32 ) B[i] is 0. Hence no more change in value of D will take place.

  Hence value of D is equal to 7.
  ```
### Time Complexity:

`O(1)`, Maximum 32 iterations are required to calculate power of 2 as well as decimal value B.

### Space Complexity:

`O(1)`, No extra space is required.

### Alternate Solution:

None
