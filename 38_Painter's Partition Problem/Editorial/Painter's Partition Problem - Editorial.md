### **Painter's Partition Problem - Editorial**

### **Difficulty**: Medium

### **Prerequisite**: Abstract Binary Search
---
### **Hint:**

There is a sorted search space of potential answers in which the actual answer lies

### **Short Explanation**:

If at a particular time Tth minute, you get the number of painters needed to complete the painting within that time is greater than p, then for all the values less than T, you will be getting the number of painters needed to complete greater than p definitely. Similarly, if at a particular time Tth minute, you get the number of painters needed to complete the painting within that time is less than p, then it satisfies and the search can be restricted within the values less than the Tth minute.

### **Detailed Explanation**:

We can easily check the number of painters required for a particular time. A boolean check function is implemented where the time, array A, number of painters available as the parameter.

We simply traverse the whole array and see the number of painters required so that the task gets completed within the time passed.

### Example

```python
[1, 8, 11, 3] and painters = 10

The lower bound would be the max element of the array and the upper bound is the sum of the elements initially. (lower bound because below that, a board will always remain left not painted and the solution becomes impossible, upper bound because when only one painter is available then the time is the sum of the lengths).

So at a particular time say suppose 17,

We can see the painters required are 2 i.e [1, 8] and [11, 3] which is feasible so now check for values lesser than 17.

The final answer comes out to be 11 i.e, [1,8], [11] and [3].


So the sequence looks like this across time,

No No No No No No No No .. .. No Yes Yes Yes .. Yes

We need to find the time of that first Yes which can be implemented using binary search since the function is monotonic in nature.

```
### **Pseudo code:**

* numberOfPainters(arr, n, Len) : To find minimum required painters to paint maximum allowed length Len for each painter
  ```python
    Begin
        total = 0
        numPainters = 1
        for i in arr
            total += i
            if (total > Len)
                total = i
                numPainters += 1
        return numPainters
    End
  ```   
* Partition Function
    ```python
    Begin
        lo = max(arr)
        hi = sum(arr)
        while (lo < hi)
            mid = lo + (hi - lo) / 2
            requiredPainters = numberOfPainters(arr, n, mid)
            if (requiredPainters <= k)
                hi = mid
            else:
                lo = mid + 1
        return lo
    End
  ```   


### **Time Complexity**:
`O(n * log(sum of the lenghts))` ~ `O(n*log(n))` per testcase.

### **Space Complexity**:

`O(1)`, No extra space required.

### **Alternate Solutions**:
None.
