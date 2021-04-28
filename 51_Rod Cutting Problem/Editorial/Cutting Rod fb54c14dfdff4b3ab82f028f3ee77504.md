### Cutting Rod

### Difficulty : Medium

### Pre-requisite : Recursion, DP
---
### Hint :

- Find out all possible ways you can make a cut by considering each unit length.

### Short Explanation :

- Given array price[], where rod of length i has a value price[i-1].
- One by One Partition the given rod of length n into two parts i and n-i.
- Recur the rod length n-i and find maximum of all values.

### Detail Explanation :

### 1. Brute Force

- Given a rod of some size and we have to cut it into parts and sell in such a way that you get maximum revenue out of it.
- Given Piece Size 1 to n and price P(i)
  ```python
  For Example :

    Piece of size(x)       Price P(x)

            1                   1

            2                   5

            3                   8
   ```
![Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/Rods_cut.jpg](Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/Rods_cut.jpg)

- **Calculating Max Revenue**
    1. 3 rods of size 1 (by having 3 cuts) : 3 x p(1) = 3x1 = 3
    2. 1 rod of size 1 and 1 rod of size 2 = 1 x p(1)  +  1 * p(2) = 1 + 5 = 6
    3. 1 rod of size 3(no cut) = 8

    **Max Revenue possible is 8 by having 0 cut.**

### Recursion Tree

![Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/Rod_Recursion.jpg](Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/Rod_Recursion.jpg)

### Questions

**Q1. How many ways are there to cut up a rod of length n ?**

Ans : 2^n-1 , because there are n-1 places where we can choose to make cuts, and at each place, we either make a cut or we do not make a cut.

### Approach

1. Let ri be the maximum amount of money you can get with rod size i.
2. The problem can be viewed recursively as follows :
    - First, Cut a piece off the left end of the rod, and sell it.
    - Then, Find the optimal way to cut the remaining rod.
3. As we don't know how large piece we should cut off. Therefore we will try all possible cases.
    - First, We try to cut a piece of length 1, And combine it with the optimal way to cut a rod of length n-1.
    - Then, We try to cut a piece of length 2, And combine it with the optimal way to cut a rod of length n-2.
4. We will try all possible length, and pick the best one.

    ![Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/rod_eqn.png](Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/rod_eqn.png)

### Recursive Equation

![Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/loopEqn.png](Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/loopEqn.png)

### Time Complexity Of Brute Force

- How many ways a cut can be made ?
    ```python
    - For Rod of size N,
        1. 1 cut  ———> (n-1)C(1) ways
        2. 2 cuts ———> (n-2)C(2) ways
        3. k cuts ———> (n-k)C(k) ways
    - Total Sum = 1 cut ways + 2 cut ways +——+ k cut ways +—-+ (n-1) cut ways
    ```
- **The sum would be calculated as :**

    ![Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/time_rod.png](Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/time_rod.png)

- The Time Complexity is O(2^n-1) i.e Exponential Time.

### Space Complexity Of Brute Force

- The Space Complexity is O(1).

### 2. Dynamic Programming

- In above Approach, The computation time is very poor because a lot of sub-problems.
- In the recursion tree, we can observe that we are doing a lot of work because we are computing the same things again and again.

    ![Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/RecursionTree_rod.png](Cutting%20Rod%20fb54c14dfdff4b3ab82f028f3ee77504/RecursionTree_rod.png)

- In the above Tree, you can observe that
    1. For n=4, we computed for n=2 , two times i.e Overlapping Sub-problems.

- **The problem satisfy two condition :**
    1. Optimal Substructure 
        - Since, overlapping sub-problem with optimal value of each sub-problem contributing to next one.
    2. Overlapping Sub Problems

### Algorithm

1. for i  in  (1, n):
    - for j in (0, i):
        - max_val = max( max_val , price[j] + DP[i-j-1])
    - DP[i] = max_val

### Time Complexity

1. According to above algorithm, 
    - Time Complexity = O(n^2)

### Space Complexity

1. Space Complexity is O(n)
    - Because we declared a DP[] array for storing the sub-problems solution.
