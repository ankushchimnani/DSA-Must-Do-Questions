## **Queue Using Two Stacks**

Implement a Queue using 2 stacks s1 and s2 .
A Query Q is of 2 Types
(i) 1 x (a query of this type means  pushing 'x' into the queue)
(ii) 2  (a query of this type means to pop element from queue and print the poped element)


#### **Sample Input**
	5
	1 2 1 3 2 1 4 2

	

#### **Sample Output**
	2 3

#### **Sample Explanation**
	In the first testcase
	1 2 the queue will be {2}
	1 3 the queue will be {2 3}
	2   poped element will be 2 the queue will be {3}
	1 4 the queue will be {3 4}
	2   poped element will be 3.

#### **Expected Time Complexity**
__O__(1) for push() and __O__(N) for pop() or __O__(N) for push() and __O__(1) for pop()  

#### **Expected Space Complexity**
__O__(N), auxilliary space required for to store data in stacks. 

#### **Constraints**
	 1 <= Q <= 100
	 1 <= x <= 100


