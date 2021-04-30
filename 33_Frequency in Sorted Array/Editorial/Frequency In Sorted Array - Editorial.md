### **Frequency In Sorted Array - Editorial**
### **Difficulty**: Low
### **Prerequisite: Binary Search**
---
### **Hint** :
Finding the position of the first and the last occurence of an element can be helpful in identifying the frequency of a particular element. 
### **Short Explaination**
In this question,we are given a sorted array, and a number K, and we have to find the frequency of the element K, in the given array. Since, the array is sorted, we can use binary search to find out the first occurence of the element, and the last occurence of that element. So, the frequency of that element, can be found out by the formula
`frequency = upperbound - lowerbound + 1`.
### **Detailed Explanation**:
In this question, we are given an array A of size N, in sorted order, and another number K. We have to find the number of times, K is present in the given array, i.e., the frequency of the number. The naive approach to solve this would be to run through the array twice, inside a nested loop, and find out the number of times, K is occurring. The worst case time complexity of this approach is `O(N^2)`. 
Another approach, that uses the fact that the array is sorted. So, we can find out the first occurence of the number in the array, and then also find out the last index at which the number is present. All the indexes at which the element K, resides in the array, will be present among  the first and last index, given the fact that the array is sorted. The first index at which the value K, is present is referred as __lowerbound__, and the last index at which the element K is presnt is referred as __upperbound__. Finally, the frequency of the element K, can be found out from the formula,
			`Frequency of K = upperbound of K - lowerbound of K + 1`
For example, if the array given is, `array = [1,2,3,4,4,4,7]` and the value of `k = 4`. Then, the frequency can be calculated as,
`lowerbound = 3` and `upperbound = 5`. Therefore, the frequency of the given element is K = 4 is `5 - 3 + 1 = 3`, based on the formula given above. 
To find out the upperbound and lowerbound of the array, binary search is to be used.

### **Pseudo Code**
```python
	function lowerbound(int[] array, int k) //This function finds out the lowerbound of K
		low = 0, high = array.length - 1
		ans = -1 //if the value of lowerbound is -1, indicating that the element is not present.
		while (low <= high)
			mid = low + (high - low)/2
			if (array[mid] == k)
				ans = mid
				high = mid - 1
			else if (array[mid] > k)
				high = mid - 1
			else 
				low = mid + 1
		return ans
	function upperbound(int[] array, int k) //This function finds out the upperbound of K
		low = 0, high = array.length - 1
		ans = -1 //if the value of lowerbound is -1, indicating that the element is not present.
		while (low <= high)
			mid = low + (high - low)/2
			if (array[mid] == k)
				ans = mid
				low = mid + 1
			else if (array[mid] > k)
				high = mid - 1
			else 
				low = mid + 1
		return ans
	function frequencyInSortedArray(int[] array, int k) //
		lowerbound = lowerbound(array,k)
		upperbound = upperbound(array,k)
		if (lowerbound == -1) //indicating that the element is not present
			return 0
		int ans = upperbound - lowerbound + 1
		return ans
```
### Example
```python

Given, `array = [1,2,3,4,4,4,7]` and the value of `k = 4`. Then, the frequency can be calculated as,
`lowerbound = 3` and `upperbound = 5`. 
Therefore, the frequency of the given element is K = 4 is `5 - 3 + 1 = 3`, based on the formula given above. 

```

### **Time Complexity**:
The time complexity will be `O(log(N))`, where N is the size of the array.

### **Space Complexity**:

`O(1)`, no extra space required.

### **Alternate Solution**:
A brute force solution has been discussed in the detailed explanation.
