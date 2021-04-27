### Binary representation of a number - Editorial

### Difficulty: Easy

### Prerequisite: Maths, Bit manipulation.
---
### Hint

- A binary representation of any non-negative number N consists of only 0's and 1's.

### Short Explanation

- For a given non-negative number N, determine whether the ith bit ( 0 <= i < 32 ) is set or not. Print 1 if it is set, else print 0.

### Detailed Explanation

- For any non-negative number N, the kth bit ( 0 <= k < 32 ) is set or 1, if the value of N&(2^(k)) is 2^(k) (& is bitwise AND operator).

    Hence, to have binary representation of N, we can check the values of all k bits ( 0 <= k < 32 ) one by one. If it is set, then, the kth bit in binary representation of N holds value 1. Else it holds value 0.

- Pseudo code:

    ```python
    N; // Non-negative integer whose binary representation is required.

    for( i from 31 to 0 ){

    if( N&(1<<i) > 0) // Checking for the ith bit using left shift operation
        print(1);

      else
        print(0);
    }
    ```

- Example :
    ```python
    Let N be 5.

    For i = 31 : 5&(2^(31)) = 0 , hence output : 0

    For i = 30 : 5&(2^(30)) = 0 , hence output : 0

    For i = 29 : 5&(2^(29)) = 0 , hence output : 0

    For i = 28 : 5&(2^(28)) = 0 , hence output : 0

    For i = 27 : 5&(2^(27)) = 0 , hence output : 0

    For i = 26 : 5&(2^(26)) = 0 , hence output : 0

    For i = 25 : 5&(2^(25)) = 0 , hence output : 0

    For i = 24 : 5&(2^(24)) = 0 , hence output : 0

    For i = 23 : 5&(2^(23)) = 0 , hence output : 0

    For i = 22 : 5&(2^(22)) = 0 , hence output : 0

    For i = 21 : 5&(2^(21)) = 0 , hence output : 0

    For i = 20 : 5&(2^(20)) = 0 , hence output : 0

    For i = 19 : 5&(2^(19)) = 0 , hence output : 0

    For i = 18 : 5&(2^(18)) = 0 , hence output : 0

    For i = 17 : 5&(2^(17)) = 0 , hence output : 0

    For i = 16 : 5&(2^(16)) = 0 , hence output : 0

    For i = 15 : 5&(2^(15)) = 0 , hence output : 0

    For i = 14 : 5&(2^(14)) = 0 , hence output : 0

    For i = 13 : 5&(2^(13)) = 0 , hence output : 0

    For i = 12 : 5&(2^(12)) = 0 , hence output : 0

    For i = 11 : 5&(2^(11)) = 0 , hence output : 0

    For i = 10 : 5&(2^(10)) = 0 , hence output : 0

    For i =  9 : 5&(2^(09)) = 0 , hence output : 0

    For i =  8 : 5&(2^(08)) = 0 , hence output : 0

    For i =  7 : 5&(2^(07)) = 0 , hence output : 0

    For i =  6 : 5&(2^(06)) = 0 , hence output : 0

    For i =  5 : 5&(2^(05)) = 0 , hence output : 0

    For i =  4 : 5&(2^(04)) = 0 , hence output : 0

    For i =  3 : 5&(2^(03)) = 0 , hence output : 0

    For i =  2 : 5&(2^(02)) = 1 , hence output : 1

    For i =  1 : 5&(2^(01)) = 0 , hence output : 0

    For i =  0 : 5&(2^( 0)) = 1 , hence output : 1

    Hence the binary representation of 5 is 00000000000000000000000000000101.
    ```
### Time Complexity:

`O(1)`, Maximum of 32 bits needs to be checked for.

### Space Complexity:

`O(1)`, No extra space is required.

### Alternate Solution:

Divide the number N by 2, the remainder we got during the division is the LSB. Again divide N by 2, the remainder we got is the next least significant bit, and so on till N becomes 0.
It should be noted that result for all 32 bits is not obtained in this method. Remaining ones should be handled separately.
