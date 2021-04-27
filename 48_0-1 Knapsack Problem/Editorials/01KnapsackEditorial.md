### 0-1 Kanpsack - Editorial

### Difficulty:  Medium

### Prerequisite:  Recursion, DP.
---
### Hint

An item may or may not be part of the knapsack that has the greatest value.

### Short Explanation

* Calculate the total weights and values for all subsets of items. Among all subsets whose total weight doesn't exceed W, the one having the greatest value is the required answer.

### Detailed Explanation

* Let for ith item I ( 1 <= i <= N ), Vi be its value and Wi be its weight. Let S be the subset of items that has the greatest value.

* Let F be a function such that F( i, j ) denotes a state, when there is a choice to put the ith item inside the knapsack weight j. Hence F( 1, W ) returns the greatest value the knapsack can have.
* Now two cases may arise:
  ```python
  Note - Base case: if N = 0 or W<=0 answer will be 0.

   1.  ith item is included in the knapsack. This can happen only when Wi <= j. 
       Hence the maximum value of knapsack we get after this event is: Vi + F( i+1, j-Wi ).
       
   2.  ith item is not included in the knapsack. Hence the maximum value of knapsack we get after this event is: F( i+1, j ).
       
  Hence F( i, j ) returns the maximum of the above two cases.
  ```
* For any state of knapsack ( i, j ) ( 1<= i <= N , 1<= j <= W ), recursion will do the job in fetching the optimal answer. But in worst case there is will be 2^n recursive calls which is not feasible with given constraints.

* The time complexity can be brought down by memoizing the optimal answers for each state of the knapsack, i.e if F( i, j ) has already been calculated there is no need to calculate it again.


  This technique reduces the calculation of redundant function calls which make the time complexity exponential. This approach is top-down in nature.

* Since the relation is well known the problem can be approached in bottom-up manner which further reduces the overhead of recursive calls.

### Time Complexity:

`O(N*W)`, where `N` is the number of items and `W` is maximum weight the knapsack can hold.

It takes at most NxW recursive calls to fill the 2D memoising table.

### Space Complexity:

`O(N*W)`, where `N` is the number of items and `W` is maximum weight the knapsack can hold.

A separate 2D table is required for memoising the optimal answer for each state.

### Alternate Solution:

None
