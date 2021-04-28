### Detect if a number is prime - Editorial

### Difficulty: Easy

### Prerequisite: Maths.
---
### Hint

A prime number N, is only divisible by 1 and itself. 2, 3, 5, 7, 11, 13, ... are first few prime numbers.

### Short Explanation

- Calculate the total number of factors F, for any given number N. If F equals to 2, then N is prime.

### Detailed Explanation

- If a number N is prime, then N is divisible by, only 1 and N.
- Observation :
    1. If N is divisible by X then, N is divisible by N/X also.
    2. If N is represented as a product of two numbers A and B, then 1 <= A,B <= sqrt(N).
- Hence it is optimal to check for all X ( 1 <= X <= sqrt(N) ), whether N%X is equal to 0 or not. If for any X ( 1 <= X <= sqrt(N) ) N%X = 0, then N%(N/X) is also zero. Hence    for a single X we get two factors of N, except for the case where both X and N/X are same.

    If only for X = 1, N%X equals 0, for all X ( 1 <= X <= sqrt(N) ), then N is prime.

  Note - You can check for all X ( 1 <= X <= N ), whether N%X equals 0 or not and conclude whether N is prime or not. But it takes O(N) time complexity which is not desirable.

- Pseudo code:

    ```python
    F = 0; // Number of factors.

    for( X from 1 to sqrt(N) ){

    if( N%X == 0){

          if( X*X != N)
              F = F + 2;
          else
              F = F + 1;

    }
    }

    if( F == 2 )
    "Given number prime";

    else
    "Given number is not prime";
    ```

- Example:
    ```python
    Let N = 5.

    Hence sqrt(N) = 2 ( lower bound ).

    Initialise F = 0.

    Check for 1 : 5%1 equals 0, hence 5%(5/1) is also 0. Hence F = F + 2 => F = 2.

    Check 2 : 5%2 not equals 0.

    Since F = 2, hence N = 5 is a prime.

    Let N = 6.

    Hence sqrt(N) = 2

    Initialise F = 0.

    Check for 1 : 6%1 equals 0, hence 6%(6/1) also equals 0. Hence F = F + 2 => F = 2

    Check for 2 : 6%2 equals0 0, hence 6%(6/2) is also 0. Hence F = F + 2 => F = 4.

    Since F = 4, hence N = 6, is not prime.
    ```
### Time Complexity:

`O(sqrt(N))`, where `N` given number.

It will take maximum of `sqrt(N)` iteration to check whether N is prime or not.

### Space Complexity:

`O(1)`.

No extra space is required.

### Alternate Solution:

If N is prime, then for X ( 1 < X < N - 1 ), ( X^(N-1) - 1 )%N = 0.
