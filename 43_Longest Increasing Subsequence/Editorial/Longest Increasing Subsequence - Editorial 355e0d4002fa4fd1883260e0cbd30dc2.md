### Longest Increasing Subsequence - Editorial

### Difficulty : Medium

### Pre-requisite : Recursion, DP
---
### Hint :

- Find all Increasing subsequence and then return the maximum length of longest increasing subsequence.

### Short Explanation :

- Let **X** be a sequence of length **m.**
- Include the current item in LIS if it is greater than the previous element in LIS and recur for the remaining items.
- Exclude the current item from LIS and recur the remaining one.
- Equation : **L(i) = 1 + max( L(j) ) where 0 < j < i and arr[j] < arr[i]**

### Detail Explanation

**Objective**

Given an unsorted array of Integers, find the length of longest increasing subsequence.

**Example :** 

Input : [ 10, 9, 2, 5, 3, 7, 101, 18]

Output : 4

Explanation : The longest increasing subsequence is [2, 3, 7, 101]. Therefore the length is 4.

### Approach 1 : Backtracking

1. Given Array, At every step we have to choices either to include first element of array or not.
2. If Include then compare the array element with Prev Value. (Initially Prev Value = -1) 
    1. If array element > Prev :
        - Include the array element into , LIS array
3. If not include, Then Pass the array to next recursive loop without having the first array element and also not include the element into LIS array.

    ![Longest%20Increasing%20Subsequence%20-%20Editorial%20355e0d4002fa4fd1883260e0cbd30dc2/includeExclude.jpg](Longest%20Increasing%20Subsequence%20-%20Editorial%20355e0d4002fa4fd1883260e0cbd30dc2/includeExclude.jpg)

### Recursion Tree

- Let's consider a array : array = {1, 2, 5, 3, 4}
- We have two choices at every step :
    - Include
    - Not Include

    ![Longest%20Increasing%20Subsequence%20-%20Editorial%20355e0d4002fa4fd1883260e0cbd30dc2/LongestSubTree.jpg](Longest%20Increasing%20Subsequence%20-%20Editorial%20355e0d4002fa4fd1883260e0cbd30dc2/LongestSubTree.jpg)

### Time Complexity

- The recurrence relation Is : **T(n) ≤ 2T(n − 1) + O(1)**
- Thus, **T(n) is O(2^n)**

### Space Complexity

- Space Complexity is **O(n)**

### Approach 2 : Dynamic Programming

- In this method, we believe that the longest increasing subsequence possible upto the ith index in a given array is independent of the element coming later on in the array.
- If upto ith index , we know the length of longest Increasing Subsequence then we can find out the length of LIS possible by including the (i+1)th element.
- We will use DP[] array. DP[i] is the length of longest increasing subsequence possible (upto ith index, including ith element).
- We will include the (i+1)th element depending upon the situation if its greater then the (i-1)th element.

    ![Longest%20Increasing%20Subsequence%20-%20Editorial%20355e0d4002fa4fd1883260e0cbd30dc2/LISEqn.png](Longest%20Increasing%20Subsequence%20-%20Editorial%20355e0d4002fa4fd1883260e0cbd30dc2/LISEqn.png)

### Time and Space Complexity

- Time Complexity : **O(n^2)**
- Where n is the size of the array

### Space Complexity

- Space Complexity : **O(n)**
    - Because DP array of size n is used.
    - Where n is the size of the array.
