### Quick Sort - Editorial

### Difficulty:  Medium

### Prerequisite: Recursion, Divide and Conquer
---
### Hint

* Quick sort is based on the divide-and-conquer method based on the idea of choosing one element as a pivot element and partitioning the array around it such that: Left side of pivot contains all the elements that are less than the pivot element Right side contains all elements greater than the pivot.

### Short Explanation

* Quick sort reduces the space complexity and removes the use of auxiliary array

* One of the most important process of Quick Sort is partition
    * The goal of partition is to select a pivot and put it at it's correct location in a sorted array, and put all elements smaller than pivot on the left of it and larger on the right of it.
    * This is done in Linear time.


### Detailed Explanation

* Implementation:
    * We start from the left most element and maintain a track of index of smaller or equal elements as i. While iterating, if we find a smaller element, we swap current element with arr[i]. Otherwise we ignore current element. 
    * We found the proper position of the pivot and divided the array into two halves (greater than pivot and smaller than pivot), we do this step recursively.

* Partition Example

```python
arr[] = {1, 8, 3, 9, 4, 5, 7}
Indexes:  0   1   2   3   4   5   6 

low = 0, high =  6, pivot = arr[h] = 7
Initialize index of smaller element, i = -1

Traverse elements from j = low to high-1
j = 0 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
i = 0 
arr[] = {1, 8, 3, 9, 4, 5, 7} 
// No change as i and j are same

j = 1 : Since arr[j] > pivot, do nothing
// No change in i and arr[]

j = 2 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
i = 1
arr[] = {1, 3, 8, 9, 4, 5, 7} // We swap 8 and 3 

j = 3 : Since arr[j] > pivot, do nothing
// No change in i and arr[]

j = 4 : Since arr[j] <= pivot, do i++ and swap(arr[i], arr[j])
i = 2
arr[] = {1, 3, 4, 9, 8, 5, 7} // 8 and 4 Swapped

j = 5 : Since arr[j] <= pivot, do i++ and swap arr[i] with arr[j] 
i = 3 
arr[] = {1, 3, 4, 5, 8, 9, 7} // 9 and 5 Swapped 

We come out of loop because j is now equal to high-1.
Finally we place pivot at correct position by swapping

arr[i+1] and arr[high]
arr[] = {1, 3, 4, 5, 7, 9, 8} // 8 and 7 Swapped 

Now 7 is at its correct place. 
All elements smaller than 7 are on the left of it and all elements greater than 7 are on the right of it.
```

### Time Complexity:

` Average Case: O(N*LogN) `, N is the size of Array
` Worst Case: O(N*N)` 

### Space Complexity:

`O(N)`, where N is the size of array

### Alternate Solution:
NA
