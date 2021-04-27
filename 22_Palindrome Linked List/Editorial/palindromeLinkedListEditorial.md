### **Palindrome Linked List - Editorial**
### **Difficulty: Medium**
### **Prerequisite: Linked List**
---
### **Hint**:
A palindrome linked list is a structure, such that the traversal from first element to the last elements, is similar to traversal from last element to first element.

### **Short Explanation**:
In this question, we are given a Linked List, and we have to find if the given linked list is a plaindrome or not. A stack data structure can be used in this case, such that the linked list is traversed from first to last, and all the nodes are stored on the stack. After that, the entire linked list is traversed again, and at each point the current node, is compared with node at the top of the stack, and if the two don't match, we can be sure that the linked list is not a palindrome. If all the nodes match, then the linked list is said to be palindromic.

### **Detailed Explanation**:
In this question, we are given a linked list, and we have to find out if the given linked list is palindromic in nature. A palindromic linked list returns the same result, whether traversed from the first element to the last element, or traversed from the last element to the first element.
A stack data structure stores data in the form of LIFO, such that the element that goes into the stack first, comes out last. In this question, a stack can be used, such that, the entire linked list is traversed, and all the nodes are pushed onto the stack. After that, the linked list is traversed again, and the current node is compared with the top of the stack, if the two match we pop out the node from the stack, and move on to the next node. If the two nodes do not match, then we can be sure that the linked list is not palindromic in nature. If all the nodes are matched, then the linked list is said to be palindromic.


### *Pseudo Code*
```python
function palindromicLinkedList(Node head)
	Stack = []
	Node current = head
	while (head != null)
		stack.push(current)
		current = current.next
	current = head
		while(current != null)
			if (current != stack.top) return false
			current = current.next
			stack.pop()
	return true
```		
### *Example*
```python
Given the linked list `1 -> 2 -> 3 -> 2 -> 1 -> NULL`, intitially, linked list will be traversed, and all the values will be pushed into the stack.

After that, all the nodes will be traversed again, and compared with the top of the stack. If there is a match, then the top of the stack is popped out, and we move on to the next, else we return false, as the linked list cannot be palindromic.
```

### Time Complexity:
`O(N)` for each operation, where N is the length of the linked list.

### Space Complexity:

`O(N)`, Maximum N nodes of linkedlist can be inserted into the stack.


## Alternate Solution:
A two pointer approach can be thought of, if the structure of the node is tweaked a little.
