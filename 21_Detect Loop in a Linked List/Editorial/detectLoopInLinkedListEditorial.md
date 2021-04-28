### **Detect Loop in a Linked List - Editorial**
### **Difficulty: Medium**
### **Prerequisite: Maths, Linked List**
---
### **Hint**:
Use two pointer approach.

### Short Explanation:

Use two pointers to iterate the linked list, a slow pointer and a fast one. If they meet other than the start point then a cycle exists.

### **Detailed Explanation**:
In the function you'll have to complete, you'll be provided a pointer to the head node of a Linked List. Initialize two variables, slow and fast, both pointing at the head. Iterate through the list till either of the slow or the fast pointer points at null. Within the loop change the value of slow to the value of the slow's next and the value of the fast one to the value of the fast's next's next. If during the loop both the slow and the fast pointer points at the same point, return false. Else after the loop return true.

This method is called the [Floyd's Cycle Finding Algorithm]

### *Pseudo Code*
```python
function detectLoopInLinkedList(Node head)
    Node slow = head
    Node fast = head
    while(fast != null && fast.next != null)
	slow = slow.next
	fast = fast.next.next
	if (slow == fast) return true
    return false
```
### Time Complexity:

`O(n)` for each operation, where n is the length of the linked list.

### Space Complexity:

`O(1)`, no extra space is required.

## Alternate Solution:
You can maintain a set of all the node's data iterated, If there's any repetition then return true. The space complexity of this solution is `O(n)`, as this solution uses a set.
