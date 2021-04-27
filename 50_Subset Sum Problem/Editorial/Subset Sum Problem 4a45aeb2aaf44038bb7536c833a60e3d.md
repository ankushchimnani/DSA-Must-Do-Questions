### Subset Sum Problem

### Difficulty : Medium

### Pre-requisite : Recursion, DP
---
### Hint :

- Find out all subsets of n numbers and for every subset check if the subset sum is equal to the target number.

### Short Explanation :

- Each item has two possibilities either include it or not include it.
- If include the current item then recur for the remaining items and similarly for exclude.
- return true if we get the subset by including or excluding the current item.

### Detail Explanation :

### 1. BackTracking

**Objective :**  Given a set of positive integers, and a value sum S, find out if there exist a subset in array whose sum is equal to given sum S.

**For Example :** Given Array = [ 3 , 2, 7, 1],  Sum = 6

Output : Yes, There exists a subset i.e [3, 2, 1] 

### Subset Sum

**The subset sum problem have following steps :**

1. We include current element in subset and recurse the remaining elements with remaining sum.
2. We exclude current element from subset and recurse the remaining elements.
3. Finally, We return true if we get subset by including and excluding current item else we return false.

### Recursion Tree

- Suppose Array = [ 3, 2, 7, 1] , Sum = 6

    Let's consider each element as xi i.e         [ 3,   2,   7,   1]
                                                    x1   x2   x3  x4

- For each element xi, We have two choices :
    1. xi is included
    2. xi is not included

![Subset%20Sum%20Problem%204a45aeb2aaf44038bb7536c833a60e3d/SubsetSumBcktracking.jpg](Subset%20Sum%20Problem%204a45aeb2aaf44038bb7536c833a60e3d/SubsetSumBcktracking.jpg)

### Time Complexity

- Since, The No. Of Elements are N i.e 4
    1. No. Of Levels = 5 (including root)
    2. Height of Tree = 4
    3. Thus , Total No. Of Paths = 2^4

- Now, For N no. of elements
    1. No. Of Levels = N+1 (including root)
    2. Height Of Tree = N
    3. Thus, Total No. Of Paths = 2^N

Thus, **Time Complexity = O(2^N)**  Because we need to calculate 2^N paths

### Space Complexity 

- As Space taken by recursive calls wil be O(N) in stack
- Thus , **Space Complexity is O(N)**

### Recurrence Relation

- The following is the recurrence relation :

    ![Subset%20Sum%20Problem%204a45aeb2aaf44038bb7536c833a60e3d/recurrence.png](Subset%20Sum%20Problem%204a45aeb2aaf44038bb7536c833a60e3d/recurrence.png)

### Psuedo-Code

![Subset%20Sum%20Problem%204a45aeb2aaf44038bb7536c833a60e3d/code1.png](Subset%20Sum%20Problem%204a45aeb2aaf44038bb7536c833a60e3d/code1.png)

### 2. Dynamic Programming

1. To improve the time complexity, We need to minimize the recursive calls.
2. Since we have many repetitive calls, We will use Dynamic Programming.
3. The main Idea of Dynamic Programming is :
    - Avoid recomputing the same sub-problem by storing the answers
4. But The question is :
    - How to identify the sub-problems
    - How much space we need

**How to identify the sub-problems ?**

The sub-problems basically have two things i.e Original Array, Target Sum

For Ex: SubsetSum( N, Sum)

![Subset%20Sum%20Problem%204a45aeb2aaf44038bb7536c833a60e3d/ss1.jpg](Subset%20Sum%20Problem%204a45aeb2aaf44038bb7536c833a60e3d/ss1.jpg)

**How much space we need ?**

- **We Store the answer based on 2 parameters :**
    1. **Start Index in the array**
    2. **Value of Sum**
- The Starting index can range between 0 - n-1
- The Value of sum has (S+1) different values
- **Thus, The Total number of sub-problems are n(S+1)**

### Psuedo-Code

![Subset%20Sum%20Problem%204a45aeb2aaf44038bb7536c833a60e3d/code2.png](Subset%20Sum%20Problem%204a45aeb2aaf44038bb7536c833a60e3d/code2.png)

### Time Complexity

**As The Total number of Sub-problems is n(S+1)**

**The Running Time Complexity is : O(nS)**

- **n is the Size of the array**
- **S is the target sum**

### Space Complexity

**As The Total number of Sub-problems is n(S+1)**

**The Space Complexity is : O(nS)**

- **n is the Size of the array**
- **S is the target sum**
