### **Bubble Sort - Editorial**
### **Difficulty**: Low
### **Prerequisite: Sorting, Arrays**
---

### **Hint** :
Sorting is any process of arranging items systematically, and has two common, yet distinct meanings: ordering: arranging items in a sequence ordered by some criterion; categorizing: grouping items with similar properties

### **Short Explaination**
In this question,we are given an array of Integers, and we have to print them in sorted form. To sort the integers, the question explicitly demands the use of bubbble sort algorithm. Bubble sort is a popular sorting algorithm such that, in each iteration, all the adjacent values are swapped, if they are not sorted. Eventually, the entire array is sorted, and printed as output.

### **Detailed Explanation**:
In this question, we are given an array of N integers, and we are required to sort them in increasing order of values. The question specifies the use of selection sort for the purpose of sorting. Bubble sort, is a sorting algorithm, and swaps the adjacent elements if they are not sorted, eventually sorting the entire array.In effect, the bubble sort, puts the maximum value at the end of the array, after each iteration.

For example, if the given array is `array = [5,1,6,3,7]`, after different steps the value of the array changes in the following form
	
	Step 1 - > [1 5 3 6 7]
	Step 2 - > [1 3 5 6 7], which is the sorted array

A slight optimization to the bubble sort algorithm can be, that if the count of swaps in a particular iteration is zero, then we can concur, that we have obtained the sorted array, and break out of the loop, and return the sorted array. 

### **Pseudo Code**
```python
	int size //size of the array
	int[] arr //input Array
	for (int i=0;i<size - 1;i++)
	    for (int j=0;j<size - i - 1;j++)
		if (a[j] > a[j + 1]) swap(a[j],a[j+1])
	print arr 
```
### **Time Complexity**:
The time complexity will be `O(N^2)` as there are two nested loops.

### **Space Complexity**:
The swapping takes place in place, therefore the space complexity will be `O(1)`.

### **Alternate Solution**:
None.
