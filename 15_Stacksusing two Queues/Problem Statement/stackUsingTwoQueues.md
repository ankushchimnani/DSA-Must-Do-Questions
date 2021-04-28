## **Stack Using Two Queues**

Implement a Stack using two queues q1 and q2 such that the stack supports two operations push() and pop()


#### **Sample Input**
	push(2)
	push(3)
	pop()
	push(4)
	pop()

	

#### **Sample Output**
	3 4

#### **Sample Explanation**
	push(2) the stack will be {2}
	push(3) the stack will be {2 3}
	pop()   poped element will be 3 the stack will be {2}
	push(4) the stack will be {2 4}
	pop()   poped element will be 4  

#### **Expected Time Complexity**
__O__(1) for push() and __O__(N) for pop() (or vice-versa).
#### **Expected Space Complexity**
__O__(N), auxilliary Space required for storing data in queues. 

#### **Constraints**
	 1 <= Number of operations on the stack <= 100
	 1 <= Values in the stack <= 100


