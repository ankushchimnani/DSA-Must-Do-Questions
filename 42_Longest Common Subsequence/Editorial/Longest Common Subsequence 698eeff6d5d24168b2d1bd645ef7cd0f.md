### Longest Common Subsequence

### Difficulty : Medium

### Pre-requisite : Recursion, DP
---
### Hint :

- Start matching each sequence, character by character. If char matches , then increase the count otherwise take max.

### Short Explanation :

- Let **X** be a sequence of length **m** and **Y** a sequence of length **n.**
- Check for every subsequence of **X** whether it is a subsequence of **Y** and return the longest common subsequence found.
- LCS(X[1…m], Y[1…n]) = LCS(X[1…m-1], Y[1…n-1]) + X[m] if X[m] = Y[n]

### Detail Explanation

### 1. Brute Force

no. of combination with 1 element are nC1

no. of combination with 2 element are nC2

no. of combination with 3 element are nC3

we know that, nC0 + nC1 + nC2 +.......nCn = 2^n

String of length n = 2^n - 1 different possible sequence

Time complexity of brute-force = O(n*2^n)

- It takes O(n) time to check if a sequence is common to both strings or not

### 2. Dynamic Programming

**Dynamic Programming Solution**

To apply Dynamic Programming, Two conditions must be satisfied :

1. Optimal Substructure
2. Overlapping Sub Problems

1. **Optimal Substructure**

    LCS has Optimal Substructure property that means Big Problem can be solved by using the solution of sub-problems.

    Let us consider two input string A[0...m-1] and B[0...n-1] .

    A is of length m and B is of length n

    LCS( A[0...m-1], B[0...n-1]

    **Recursive Condition :**

    1. If last character of A and B matches ,Then

        LCS(A[0..m-1], B[0...n-1]) = 1+L(A[0..m-2], B[0..n-2])

    2. If last character not match, 

        LCS(A[0..m-1], B[0..n-1]) = MAX( LCS(A[0..m-2], B[0..n-1]), LCS(A[0...m-1], B[0...n-2]))

    For Example :
    ```python
    1. String A is MNBHYTRY and B is HGHOIYTEDPY

        As Last Character match, 

        Thus, LCS("MNBHYTRY", "HGHOIYTEDPY") = 1 + LCS("MNBHYTR", "HGHOIYTEDP") 

    2. String A is DFGTR and B is JUYIOTM
    
    As Last character won't match

    LCS("DFGTR", "JUYIOTM") = MAX( LCS("DFGT**R**", "JUYIOTM"), LCS("DFGTR", "JUYIOT**M**")                                       
    ```
    **2. Overlapping Sub Problems**
    
    Since On execution of above recurision, There will be 2^n calls, Thus complexity become O(2^n) i.e worst case when nothing matches. 
    ```python
    For ex : ABC and MNO 
    
    LCS is 0

    Consider a string :    BTUP and BULT

    LCS(BTUP,   BULT)

    LCS(BTU, BULT)              LCS(BTUP, BUL)

    LCS(BT,BULT)   **LCS(BTU, BUL)**     **LCS(BTU,BUL)**         LCS(BTUP, BU)

    In the above Tree, We can see the overlapping recusrsion calls, It would be many.

    - Overlapping Sub-problems can be avoided by Memoization.
    ```

### Time Complexity

- Time complexity is O(MN) because table size is M X N.

Total calculation made is MN

### Space Complexity

- Space Complexity is O(MN) because of table size M X N required.
