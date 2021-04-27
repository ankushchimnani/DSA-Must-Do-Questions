### Find Peak Element - Editorial

### Difficulty : Low

### Pre-requisite : Binary Search
---
### Hint :

- Use Binary Search to find the peak.

### Short Explanation :

- Using Binary Search, Check whether the middle element is the peak element or not.
- If middle is not peak and If right side or left side element is greater then there exist peak on that side .

### Detail Explanation

### Approach 1 : Linear Search

### Algorithm :

1. Check first , whether the first element of the array is greater then the next element or the last element is greater than its previous element . If true, then return the number.
2. If not then traverse the array for second to second last element and check for each element whether it is greater then its neighbours or not.
    - Consider an array nums of size n.
    - Condition nums[i] > nums[i-1] and nums[i] > nums[i+1]

### Complexity Analysis for Linear Search

### 1. Time Complexity :

Time complexity is O(n) Because One traversal is needed.

### 2. Space Complexity :

Space Complexity is O(n)

### Approach 2 : Binary Search

### Algorithm

1. Two varaibles are initialized , low = 0 and high = size-1
2.  Iteration will keep on running , While low≤high
3. Calculate mid , check whether it is the peak element or not, If yes then return.
4. If the left side of the middle element is greater then find the peak on the left side.
5. otherwise try to find on the right side.

### Time Complexity :

Time complexity is **O(Logn)** Because of binary search.

### Space Complexity :

O(1), no extra space required.
