### **Painter's Partition Problem - Editorial**

### **Difficulty**: Medium

### **Prerequisite**: Abstract Binary Search

### **Problem Statement**:

Given an array A of n wooden boards where the ith board has Ai length. We need to paint all the n boards and we have p painters available for the work and each takes 1 unit time to paint 1 unit of the board.

Two painters cannot share a board to paint. So for example, if the ith board is painted by some painter, then he will complete the painting. A board cannot be painted partially by one painter, and partially by another.

Any painter will only paint continuous sections of boards, i.e if the painter paints a range [l,r], then he paints all the boards within that interval. For example -

Consider 5 boards numbered from 1 to 5, then the painter can not paint the board [2,4,5].

Calculate the minimum time to complete this job.

### **Hint:**

There is a sorted search space of potential answers in which the actual answer lies

### **Short Explanation**:

If at a particular time Tth minute, you get the number of painters needed to complete the painting within that time is greater than p, then for all the values less than T, you will be getting the number of painters needed to complete greater than p definitely. Similarly, if at a particular time Tth minute, you get the number of painters needed to complete the painting within that time is less than p, then it satisfies and the search can be restricted within the values less than the Tth minute.

### **Detailed Explanation**:

We can easily check the number of painters required for a particular time. A boolean check function is implemented where the time, array A, number of painters available as the parameter.

We simply traverse the whole array and see the number of painters required so that the task gets completed within the time passed.

So for example-
```
[1, 8, 11, 3] and painters = 10

The lower bound would be the max element of the array and the upper bound is the sum of the elements initially. (lower bound because below that, a board will always remain left not painted and the solution becomes impossible, upper bound because when only one painter is available then the time is the sum of the lengths).

So at a particular time say suppose 17,

We can see the painters required are 2 i.e [1, 8] and [11, 3] which is feasible so now check for values lesser than 17.

The final answer comes out to be 11 i.e, [1,8], [11] and [3].
```

So the sequence looks like this across time,
```
No No No No No No No No .. .. No Yes Yes Yes .. Yes
```
We need to find the time of that first Yes which can be implemented using binary search since the function is monotonic in nature.

### **Time Complexity**:
O(n * log(sum of the lenghts)) ~ O(n*log(n)) per testcase.

### **Space Complexity**:
No extra space required for processing, therefore O(1) space per testcase.

### **Alternate Solutions**:
None.