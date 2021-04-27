### Coin Change Problem - Editorial

### Difficulty : Medium

### Prerequisite : Recursion, DP
---
### Hint :

- Perform Recursion to check if the total can be reached by choosing the coin or not for each coin of given dominations . If choosing the current coin results in the solution, then update the number of ways.

### Short Explanation :

- Consider any optimal solution to making change for n cents using coins of denominations d1, d2, . . . , dk.
- Consider breaking that solution into two different pieces along any coin boundary. Suppose that the “left-half” of the solution amounts to b cents and the “right-half” of the solution amounts to n − b cents, as shown below.

![Coin%20Change%20Problem%20-%20Editorial%20d9a49c0a05574afb85e805610d9f68e8/breaking_CoinChange.png](Coin%20Change%20Problem%20-%20Editorial%20d9a49c0a05574afb85e805610d9f68e8/breaking_CoinChange.png)

### Detail Explanation :

### Approach  1 : Brute Force

### Intuition

- Given an amount S ,Ci is the coin-denominations and xi is the number of coins with denominations ci.
    - For Example : Lets suppose amount S = 4

        C = [4, 6, 5, 1] and 

        Xi is infinite Because each denomination have infinite number of coins.

    ### Recurrence Relation :

    ![Coin%20Change%20Problem%20-%20Editorial%20d9a49c0a05574afb85e805610d9f68e8/coinChange_recrrence.png](Coin%20Change%20Problem%20-%20Editorial%20d9a49c0a05574afb85e805610d9f68e8/coinChange_recrrence.png)

    ### Approach 1 : Brute Force

- Generate All subsets of Coin Frequencies from our coin set C that adds up to the sum S.
- Return the subset with minimum coins.
    ```python
    **For Ex : C = [ 1,2,3 ]  and S = 4**

    All subsets with sum 4 are = {1,1,1,1}, {1,1,2}, {2,2}, {1,3}.

    Subsets with minimum coins = {2,2}, {1,3}

    Size of minimum subset = 2

    Minimum number of coins to get S = 4 is 2.
    ```
    ### Time Complexity

    In the worst case every coin denomination **Ci** could have at most **S/Ci** values. Therefore the number of possible combinations is : 

    S/C1 * S/C2 * S/C3 ...................* S/Cn  =  S^n / C1*C2*C3..............*Cn

    Time Complexity = `O(S^n)`

    In worst case the maximum depth of recursion is n.

    ### Space Complexity 
    
    `O(n)`, extra space for call stack.

      

### Approach 2 : Dynamic Programming

To apply Dynamic Programming, Two conditions must be satisfied :

1. Optimal Substructure
2. Overlapping Sub Problems

1. **Optimal Substructure:** 

Coin change problem can be divided into 2 sub problems.

1. **Selecting a coin:** Make the amount (Sum - coin we added) with the same set of coins.
2. **Ignoring a coin:** Make the same sum with the original set of coins, minus the coin we ignored.

  

2.  **Overlapping Sub problems:**

    We have infinite supply of coins Ci so there will be overlapping sub problems.

    It can be handled by memorization.

### Psuedocode

![Coin%20Change%20Problem%20-%20Editorial%20d9a49c0a05574afb85e805610d9f68e8/Psuedo_Code_Coin.png](Coin%20Change%20Problem%20-%20Editorial%20d9a49c0a05574afb85e805610d9f68e8/Psuedo_Code_Coin.png)

### Time Complexity
`O(S*n)`

Where S is the given sum and n is the number of coins given.

### Space Complexity

`O(S)`

As we need storage till amount S to store the sum.
