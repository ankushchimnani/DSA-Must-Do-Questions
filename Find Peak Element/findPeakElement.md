# **Find Peak Element**
A peak element is an element that is strictly greater than its neighbors.
Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

__Note__ : You may imagine that nums[-1] = nums[n] = -∞.


#### **Sample Input**
	array = [1,2,3,1]
#### **__Sample Output__**
	Output: 2
	
### **__Sample Explanation__**
3 is a peak element and your function should return the index number 2.

### **__Expected Time Complexity__**
__O__(log(N)), where N is the size of the array

#### **Expected Space Complexity**
__O__(1), i.e., constant space complexity.

#### **Constraints**
	1 <= nums.length <= 1000
	-2^31 <= nums[i] <= 2^31 - 1
	nums[i] != nums[i + 1] for all valid i.
