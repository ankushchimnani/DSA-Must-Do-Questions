## Min Stack in O(1)
**Design a stack that supports push, pop, top, and retrieving the minimum element in constant  O(1) time.**
You need to implement these functions on the stack :
push(x) — Push element x into the stack.
pop() — Removes the element on top of the stack.
top() — Get the top element.
getMin() — Retrieve the minimum element in the stack in O(1) time

##### Input
    push(3)
    push(5)
    push(1)
    getMin()
    pop()
    getMin()
#### Output
    1
    3
##### Explanation
    Stack  = [3,5,1]
    getMin() -> 1
    After pop
    Stack = [3,5]
    getMin() -> 3

##### Expected Time Complexity : O(1)
##### Expected Space Complexity : O(n)

##### Constraints
    1<= N <= 10^5