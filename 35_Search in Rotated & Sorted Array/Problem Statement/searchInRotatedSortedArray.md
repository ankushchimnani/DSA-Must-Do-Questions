## **Search in Rotated Sorted Array**

You are given an integer array nums sorted in ascending order (with distinct values), and an integer target.
Suppose that nums is rotated at some pivot unknown to you beforehand (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
If target is found in the array return its index, otherwise, return -1.





#### **Sample Input**
	nums = [4,5,6,7,0,1,2], target = 0

	

#### **Sample Output**
	4

#### **Sample Explanation**
	In the array given in the sample test case, the target element 0 is stored at index 4. 

#### **Expected Time Complexity**
__O__(log(N)), where N is the size of the array.
#### **Expected Space Complexity**
__O__(1),Auxilliary Space  

#### **Constraints**
	  1 <= nums.length <= 5000
	 -10^4 <= nums[i] <= 10^4
	 All values of nums are unique. nums is guaranteed to be rotated at some pivot.
	 -10^4 <= target <= 10^4

