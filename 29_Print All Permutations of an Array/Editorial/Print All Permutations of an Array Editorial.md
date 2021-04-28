### Print All Permutations of an Array - Editorial

### Difficulty:  Medium

### Prerequisite:  Recursion, Backtracking
---
### Hint

We are asked to calculate all the possible permutations, so we may think of using Backtracking as we need to accept the cases which satisfy the condition and reject the others, also all the integers are distinct

### Short Explanation

*  In every backtracking problem , there are two things to keep in mind :

    * Base Case : Every problem of backtracking has some base case which tells us at which point we have to stop with the recursion process. In our case, when the size of our "l" reaches "r", we stop the recursion for that combination.
    
    * Condition : After generating permutations corresponding to a particular 
    arr[i] , swap arr[l] and arr[i] back to their original position.

### Detailed Explanation

* Here the permutation function which takes the index of the first integer to consider as an argument permutation (l).

    * If the first integer to consider has index n that means that the current permutation is done.
    * Iterate over the integers from index first to index n - 1.
        1. Place i-th integer first in the permutation, i.e. swap(arr[l], arr[i]).
        2. Proceed to create all permutations which starts from i-th integer: permutation(l + 1).
        3. Now backtrack, i.e. swap(arr[l], arr[i]) back.


### Time Complexity:

`O(N*N!)`, where `N` is the size of array

### Space Complexity:

`O(N)`, Extra call stack memory required.


### Alternate Solution:

We could have used vector or list to push back and pop back element instead of swapping them, but this approach might fail in case where array contains duplicate elements.
