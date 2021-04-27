### Nth Fibonacci - Editorial

### Difficulty : Low

### Pre-requisite : Recursion, DP
---
### Hint :

- The Fibonacci equation is : `F{n} = F{n-1} + F{n-2}`

### Short Explanation :

- Solve the problem recursively by using following Equation.
- `Fn` of Fibonacci numbers:
    - `F{n} = F{n-1} + F{n-2}`
    - with base values `F(0) = 0` and `F(1) = 1`

### Detail Explanation

### 1. Brute Force Approach

### Recursive Equation

![Nth%20Fibonacci%20-%20Editorial%206b42f65168a44ba3a8f845ded117ae09/fibonacci_eqn.png](Nth%20Fibonacci%20-%20Editorial%206b42f65168a44ba3a8f845ded117ae09/fibonacci_eqn.png)

### Recursion Tree

Let's analyze the recursion tree :

For **fib(6)** :

![Nth%20Fibonacci%20-%20Editorial%206b42f65168a44ba3a8f845ded117ae09/fibonacci.png](Nth%20Fibonacci%20-%20Editorial%206b42f65168a44ba3a8f845ded117ae09/fibonacci.png)

- here, we are Solving the problem recursively by breaking the problem into similar sub-problems.
- But The Problem , With the above is the Repetitive Recursive calls which will increase the time complexity.

### Complexity Analysis For Brute Force

![Nth%20Fibonacci%20-%20Editorial%206b42f65168a44ba3a8f845ded117ae09/fib_complexity.png](Nth%20Fibonacci%20-%20Editorial%206b42f65168a44ba3a8f845ded117ae09/fib_complexity.png)

### 2. Dynamic Programming Approach

- Since there are overlapping problems exist in the above tree.
- We can use some extra space to reduce the time complexity.

![Nth%20Fibonacci%20-%20Editorial%206b42f65168a44ba3a8f845ded117ae09/fibonacci2.png](Nth%20Fibonacci%20-%20Editorial%206b42f65168a44ba3a8f845ded117ae09/fibonacci2.png)

- we will use the n size array to store the sub-problems result.

### Pseudo Code

![Nth%20Fibonacci%20-%20Editorial%206b42f65168a44ba3a8f845ded117ae09/fib_code.png](Nth%20Fibonacci%20-%20Editorial%206b42f65168a44ba3a8f845ded117ae09/fib_code.png)


### Time Complexity

- After using extra space, to store the sub-problems results We saved a lot of repetitive calls.
- The Time Complexity = O(n)

### Space Complexity

- The Space Complexity = O(n)  because we are using some extra space.
