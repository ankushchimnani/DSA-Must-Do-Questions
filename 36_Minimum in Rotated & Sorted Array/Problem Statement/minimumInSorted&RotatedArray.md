## **Minimum in Rotated Sorted Array**

Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand. (i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
Find the minimum element.
The array may contain duplicates.





#### **Sample Input**
	array = [1,3,5]

	

#### **Sample Output**
	1

#### **Sample Explanation**
	As evident from the array, 1 is the minimum element in the array

#### **Expected Time Complexity**
__O__(log(N)), where N is the size of the array.

#### **Expected Space Complexity**
__O__(1),Auxilliary Space  

#### **Constraints**
	  1 <= nums.length <= 5000
	 -10^4 <= nums[i] <= 10^4
	 All values of nums are unique. nums is guaranteed to be rotated at some pivot.
	 -10^4 <= target <= 10^4

