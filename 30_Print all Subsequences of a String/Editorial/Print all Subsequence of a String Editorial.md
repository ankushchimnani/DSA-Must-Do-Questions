### Print All Subsequence of a String - Editorial

### Difficulty:  Easy

### Prerequisite:  Recursion, Backtracking
---
### Hint

We either pick an element of the string or we don't pick it, and then form the subsequence

### Short Explanation

Subsequence of a string is formed by deleting some character of a given string without changing its order, so we may think in direction of deleting some characters or not including them in our solution.


### Detailed Explanation

In every backtracking problem , there are two things to keep in mind :

* Base Case : Every problem of backtracking has some base case which tells us at which point we have to stop with the recursion process. In our case, when the input string becomes empty we stop our recursion and print the output string.

* Condition : We need to consider both the possiblity of either picking an element or not picking an element.

* In one recursive call, the output string is passed in the recursive function by including the first character of the input string.

* In another recursive call, the output string is passed in the recursive function by without including the first character of the input string.


### Time Complexity:

`O(2^n)`, where `N` is the size of string

### Space Complexity:

`O(N)`, Extra space required for call stack.

### Alternate Solution:

One by one fix characters and recursively generates all subsets starting from them. After every recursive call, we remove last character so that the next permutation can be generated.
