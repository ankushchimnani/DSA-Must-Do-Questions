### **Search in rotated and sorted array - Editorial**
### **Difficulty**: Medium
### **Prerequisite: Binary Search**:
---
### **Hint:**
Binary search can be used to find the element in rotated sorted array. 

### **Short Explaination**
In this question we would essentially apply a modified version of binary search where the condition that decides the search direction would be different than in a standard binary search.

### **Detailed Explanation**:
 The entire array is not sorted from left to right, the subarray on the left of the pivot and on the right of the pivot will still be sorted. We can use this fact and apply binary search to find the element in the array in O(log(n)) time complexity.
 
 In this rotated sorted array we would first need to find out the point/index which divides the array into two parts such that we have two sorted arrays and then decide which part does target belongs to.
* arr = [ 5 6 7 8 1 2 3 4]
* For e.g. in the array if we are searching for target = 6 then first part of the array is where we need to search by using Binary Search.


### Algorithm 
* Divide the array and perform binary search to find the pivot point.
* After applying binary search, pivot can be found.
* After finding out the pivot, Now divide the array in two sub-arrays.
* As individual sub-arrays are sorted. Thus, the element can be searched using Binary Search.

### **Time Complexity**:
`O(logN)`, where N is the size of array.

### **Space Complexity**:

`O(1)`, no extra space required.

### **Alternate Solution**:
Linear Search will result in TLE for some cases.
