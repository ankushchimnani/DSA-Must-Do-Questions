### Binary Search

### Difficulty : Easy

### Pre-requisite : arrays
---
### Hint :

- In a sorted array, compares the target element with the middle element of the array.

### Short Explanation :

- Search a sorted array by repeatedly dividing the search interval in half.
- Move to lower half if search key is less than the middle element otherwise to other half.

### Detail Explanation

### 1. Brute Force

- Searching an element in an array .
- Basic approach is Linear Search.
- The time complexity will be O(N)

### 2. Binary Search

- Given an array of n elements A0, A1, A2.....An-1 such that A0 ≤ A1 ≤ A2.....≤An-1 and target key k.
- Set left to 0 and R to n-1.
- Calculate mid position = (left+right)/2
- Compare target key with the middle element.
- If it matches with middle element, then return the mid index.
- If x is greater than the middle element, then x must be present in the right half, therefore recur in right half.
- Else recur in left half.

For ex :  arr = [ 4,  11,  15,  25,  75,  208, 500] , key = 208

**Step I :**   [ **4**,  11,  15,  **25**,  75,  208, **500**]

             **left=0          mid=3         right=6**

                      mid = (0+6)/2 = 3

                    

**Step 2 :** Since key = 208 is greater then 25, Therefore 208 may be present in right side of array.

 [ ****4,  11,  15,  25,  **75**,  208, **500**]

                           **left=4     right=6**

                      mid = (4 +6)/2 = 5

**Step 3 :** At mid = 5, Value 208 is present that is equal to our key = 208.

       Thus, Index will return.

### Time Complexity

**Recurrence :** T(n) = T(n/2) + c

In every step of binary search, 

- we use to recur either left half or right half .
- This will result in worst Case Time Complexity : O(logn)

### Space Complexity

`O(1)` , no extra space required.
