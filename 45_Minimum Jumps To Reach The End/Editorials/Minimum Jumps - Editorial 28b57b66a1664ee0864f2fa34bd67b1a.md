### Minimum Jumps - Editorial

### Difficulty : Medium

### Pre-requisite : Recursion, DP
---
### Hint :

- Keep track of all possible jumps at each steps.

### Short Explanation :

- Calculate the no. of ways you can make the jump at each steps till end. After Calculating it, return the no. of ways jumps possible for last step.

### Detail Explanation

### Approach 1 : Brute Force

Here, we have the recursive solution for this problem.

Suppose We have the Given array as A = [ 2 3 1 1 4]

**Step 1 :** Start from the first Index, it has the value 2 [**2** 3 1 1 4] i.e we can make 2 jumps from this index that is either to index(1) or index(2).

**Step 2.1:** If we make jump to index(1) then we have choice to make 3 jumps from index(1) to either index(2) or index(3) or index(4)  [ 2 **3** 1 1 4].

**Step 2.2:**  If we make jump to index(2)  then we have choice to make 1 jumps from index(2) to index(3)  [ 2 3 **1** 1 4].

The recursion tree would be viewed like this :

![Minimum%20Jumps%20-%20Editorial%2028b57b66a1664ee0864f2fa34bd67b1a/Org_Chart_(1).jpg](Minimum%20Jumps%20-%20Editorial%2028b57b66a1664ee0864f2fa34bd67b1a/Org_Chart_(1).jpg)

### Recursive Condition

- **minJumps(start, end) = MIN(minJumps(k, end) For all k that are reachable from start)**

### Time Complexity

- At any level, The maximum Branches of a node will be the maximum value present in an array.

    For Example : In array [ 2 3 1 1 2], the maximum value is present at index(1) i.e 3

    Therefore, It can make three jumps.

    Thus , The maximum branches possible is 3

![Minimum%20Jumps%20-%20Editorial%2028b57b66a1664ee0864f2fa34bd67b1a/timeComplexity.jpg](Minimum%20Jumps%20-%20Editorial%2028b57b66a1664ee0864f2fa34bd67b1a/timeComplexity.jpg)

- The longest height of the tree would be N. N : Size of Array
- Total Recursive Calls in worst Case : N^K
    - Where N is the size of the array.
    - K is the Max branches possible.
- Time Complexity : `O(n^k)`

### Space Complexity
`O(n)`, extra space required for stack.

### Approach 2 : Dynamic Programming

- To improve the complexity, We will use Bottom up dynamic programming.
- For Bottom-Up implementation, We will create an array that stores the optimal number of moves to reach the end of the array.
- Let' create an array **OPT[i]  : Denotes the minimum number of jumps needed to go from the start index untill the i-th index in the array.**

    ![Minimum%20Jumps%20-%20Editorial%2028b57b66a1664ee0864f2fa34bd67b1a/OptimizeArray.jpg](Minimum%20Jumps%20-%20Editorial%2028b57b66a1664ee0864f2fa34bd67b1a/OptimizeArray.jpg)

- **Recurrence Relation :**

    **If i ≤ j + arr[j] :**

    **OPT[i] = min(OPT[i], OPT[j] + 1)       // Stores Optimum jumps at each index**

- **Code Logic :**
    - for i is (1 to n):
        - for j is (0 to i):
            1. **If i ≤ j + arr[j] :**

                **OPT[i] = min(OPT[i], OPT[j] + 1)**

### Time Complexity

- Since For each index, we are checking N possibilities i.e running loop n times.
- **Time Complexity will be `O(N^2)`**

### Space Complexity

- We have used OPT[ ] array, to store optimum jumps at each index.
- **Space Complexity will be `O(N)`**
