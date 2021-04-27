## **Min Stack in O(1)**
Design a stack that supports push, pop, top, and retrieving the minimum element in constant  O(1) time.

__Note__ : You need to implement these functions on the stack :
push(x) — Push element x into the stack.
pop() — Removes the element from top of the stack.
top() — Get the top element.
getMin() — Retrieve the minimum element in the stack in O(1) time

#### **Sample Input**
	push(3)
    push(5)
    push(1)
    getMin()
    pop()
    getMin()
#### **Sample Output**
	Output:     
	    1
        3
#### **Sample Explanation**
    Stack  = [3,5,1]
    getMin() -> 1
    After pop
    Stack = [3,5]
    getMin() -> 3
#### **Expected Time Complexity**
__O__(1), for each operation
#### **Expected Space Complexity**
__O__(1), Constant extra space

#### **Constraints**
	1 <= N <= 100000
