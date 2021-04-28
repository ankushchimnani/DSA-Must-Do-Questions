### **Minimum in sorted & rotated array - Editorial**
### **Difficulty**: Medium
### **Prerequisite: Binary Search**:
---
### **Hint:**
Binary search can be used to find the first point at which the sorting condition is dissolved. 
### **Short Explaination**
In this question we would essentially apply a modified version of binary search where the condition that decides the search direction would be different than in a standard binary search.
### **Detailed Explanation**:
We want to find the smallest element in a rotated sorted array. What if the array is not rotated? How do we check that?
If the array is not rotated and the array is in ascending order, then last element > first element.This means there is a point in the array at which you would notice a change. This is the point which would help us in this question. We call this the Inflection Point.In this modified version of binary search algorithm, we are looking for this point. The following condition holds true, with regards the inflection point.
* All the elements to the left of inflection point > first element of the array.
* All the elements to the right of inflection point < first element of the array.
* 
### Algorithm 
* Find the mid element of the array.
* If mid element > first element of array this means that we need to look for the inflection point on the right of * mid.
* If mid element < first element of array this that we need to look for the inflection point on the left of mid.
* We stop our search when we find the inflection point, when either of the two conditions is satisfied:
	* nums[mid] > nums[mid + 1] Hence, mid+1 is the smallest.
	* nums[mid - 1] > nums[mid] Hence, mid is the smallest.
	
### **Time Complexity**:
`O(logN)`, where N is the size of array.

### **Space Complexity**:

`O(1)`,no extra space required.


### **Alternate Solution**:
Linear Search will result in TLE for some cases.
