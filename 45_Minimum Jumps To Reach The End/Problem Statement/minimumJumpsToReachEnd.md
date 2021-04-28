## **Minimum Jumps to reach the End**

Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Your goal is to reach the last index in the minimum number of jumps.
You can assume that you can always reach the last index.



#### **Sample Input**
	array = [2,3,1,1,4]

#### **Sample Output**
	2

#### **Sample Explanation**
The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.


##### **Note:** Remember you can jump less than the mentioned value at any index of array.


#### **Expected Time Complexity**
__O__(N*N), where N is the length of the array


#### **Expected Space Complexity**
__O__(N), Space Complexity. 

#### **Constraints**
	1 <= nums.length <= 3 * 10^4
	0 <= nums[i] <= 10^5
