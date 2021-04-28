### **Reverse a Linked List - Editorial**
### **Difficulty: Medium**
### **Prerequisite: Linked List**
---
### **Hint**:
A linked list has to be reversed, such that, the next for a particular node, becomes the node preceding the very same node after reversal.

### **Short Explanation**:
In this question, we have to reverse the linked list such that, after reversal, the next node for a particular node becomes the preceding node for the very same node, after reversal. We can make three pointers, one which stores the reference of the next node, that needs to be traversed, one which stores the reference of the previous node which has already been traversed, and one, which refers to the current node, and making appropriate modifications to each of them.  

### **Detailed Explanation**:
In the question, we are given a linked list, and we have to reverse the linked list, such that for example,a given linked list `1 -> 2 -> 3 -> 4 -> NULL`, after reversal becomes `4 -> 3 -> 2 -> 1 -> NULL`.
To do this we need three pointers, one which points to the current node being traversed, another pointer points to the next node that is being traversed. This is important, as the new next for the current node, will be held by the third pointer which stores a reference to the previous node that was visited.

### *Pseudo Code*
```python
	function reverseLinkedList(Node head)
		Node current = head
		Node after = NULL
		Node before = NULL
		while(curr != null)
			after = current.next
			current.next = before
			before = current
			current = after
		head = before
		return head
```

### Example
```python
Given the linked list `1 -> 2 -> 3`, intitially, the current node will have node with value = 1.

	Node current = (Node with value 1)
	Node after = (Node with value 2) 
	Node before = NULL

	After one has been traversed, the value of different nodes become
	Node current = (Node with value 2) 
	Node after = (Node with value 3)
	Node before = (Node with value 1)

	After this has been traversed, the values of different nodes become
	Node current = (Node with value 3)
	Node after = NULL
	Node before = (Node with value 2)

Finally, the value of head is updated to before, after the value of current becomes null.
```

### Time Complexity:

`O(n)` for each operation, where n is the length of the linked list.

### Space Complexity:

`O(1)` for each operation, as no extra space is required.


## Alternate Solution:
None.
