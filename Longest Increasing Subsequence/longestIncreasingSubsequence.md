## **Longest Increasing Subsequence**

The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements of the subsequence are sorted in increasing order.


#### **Sample Input**
	array = [10,22,9,33,21,50,41,60,80]

#### **Sample Output**
	6

#### **Sample Explanation**
The longest increasing subsequence for the array given in the sample test case is {10, 22, 33, 50, 60, 80}. Therefore, the answer is 6.


#### **Expected Time Complexity**
__O__(N^2), where N is the number of elements in the array.


#### **Expected Space Complexity**
__O__(N). Auxillary Space. 

#### **Constraints**
	1 <= nums.length <= 2500
	-10^4 <= nums[i] <= 10^4
__O__(N^2) solution can be further optimised to __O__(Nlog(N)). The task is to implement it as well. 
