## **Smaller neighbour element**
Given an array A having N positive integers. Find the nearest smaller number for every element such that the smaller element is on left side.

Note - If any element doesn't have any smaller element that it to it's left, print -1 for it.

#### **Sample Input**
	input: N = 5
	A : 1 2 5 3 5

#### **Sample Output**
	A: -1 1 2 2 3

#### **Sample Explanation**

There is no element to the left of 1 hence for it there is no smaller neighbour. Hence the answer is -1.
For 2 nearest smaller neighbout to it's left is 1. 
For 5 nearest smaller neighbout to it's left is 2.
For 3 nearest smaller neighbout to it's left is 2.
For 5 nearest smaller neighbout to it's left is 3.

#### **Expected Time Complexity**
__O__(N), where N is the size of the array.

#### **Expected Space Complexity**
__O__(N), where N is the size of the array.

#### **Constraints**
	1 <= N <= 100000
