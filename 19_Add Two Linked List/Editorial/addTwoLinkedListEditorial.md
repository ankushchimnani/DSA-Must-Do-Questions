### **Add Two Linked List - Editorial**
### **Difficulty**: Medium
### **Prerequisite: Linked List**
---
### **Hint:**
If the sum of two numbers is greater than 10, then carry = sum / 10, while the sum becomes sum = sum % 10.

### **Short Explanation**
In this question, we are given two numbers in the form of a linked list, and we have to add the two numbers, such that the sum of the two numbers is stored in a new linked list. The idea is to traverse the two linked list from start of the linked lists, and keep on traversing, till one of them has an element left to be traversed. The sum of individual nodes is found, and if the sum is greater than 10, then the sum is carried forward to the next node. Finally, we check if there is any carry left at the end of the array


### **Detailed Explanation**:
In computer science, a linked list is a linear collection of data elements whose order is not given by their physical placement in memory. Instead, each element points to the next. It is a data structure consisting of a collection of nodes which together represent a sequence.
The structure of the linked list can be understood from the following figure 
[this](https://en.wikipedia.org/wiki/Linked_list)

Given two linked list representing two numbers, we have to sum the numbers and print the resultant linked list in which will store the sum of the numbers. A straight forward approach is to traverse both the linked list till the both of them are exhausted, and store the sum formed by individual nodes. Care should be taken that if the value of the inidividual nodes exceeds 10, then the carry should be forwarded to the next node. 

### **Pseudo Code**
```python
	function addTwoLinkedList(Node head1, Node head2) //head1 and head2 represent the two linked lists.
	Node ans = null //This node stores the resultant linked lists.
	Node temp = ans
	carry = 0;
	while(head1 != null || head2 != null)
		val = 0;
		if (head1 != null)
			val = head2.data
			head2 = head2.next
		else if (head2 == null){
			val = head1.data
			head1 = head1.next
		else
			val = head1.data + head2.data
			head1 = head1.next
			head2 = head2.next
		val = val + carry
		carry = val / 10
		val = val % 10
		if (temp == null)
			ans = new Node(val)
			temp = ans
		else
			temp.next = new Node(val)
			temp = temp.next
	if (carry != 0)
		temp.next = new Node(carry)
	return ans

```
### Example 
```python

Given two linked lists A - 2->4->3 and B - 5->6->4, representing the numbers 342 and 465. 
On adding these two, the new linked list generated, has a sum of 708, represented by the linked list 7->0->8.

```

### **Time Complexity**:
Time Complexity = `O(N + M)`, where N and M are the lengths of the two linked list
### **Space Complexity**:
Space Complexity = `O(K)`, where K is the number of digits in the sum

### **Alternate Solution**:
None.
