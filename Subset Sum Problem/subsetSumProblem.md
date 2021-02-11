## **Subset Sum Problem**

Given a set of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.



#### **Sample Input**
	set = {3, 34, 4, 12, 5, 2}, sum = 8

#### **Sample Output**
	True

#### **Sample Explanation**
The subset (3,5) gives the required sum 8.

#### **Expected Time Complexity**
__O__(sum * n), where sum is the ‘target sum’ and ‘n’ is the size of array.


#### **Expected Space Complexity**
__O__(sum * n)

#### **Constraints**
	1 <= N <= 100
	1 <= A[i] <= 100
	1 <= sum <= 10^5
