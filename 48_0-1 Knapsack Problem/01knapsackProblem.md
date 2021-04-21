## **0-1 Knapsack Problem**

Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item or don’t pick it (0-1 property).



#### **Sample Input**
	value = {60,100,120}
	weight = {10,20,30}
	W = 50

#### **Sample Output**
	220

#### **Sample Explanation**
In the sample test case, without exceeding the capacity of the knapsack, we can add weights with 20 and 30. Therefore, the value will be 50. 

#### **Expected Time Complexity**
__O__(N * W). where ‘N’ is the number of weight element and ‘W’ is capacity. 


#### **Expected Space Complexity**
__O__(N * W), where ‘N’ is the number of weight element and ‘W’ is capacity. 


#### **Constraints**
	1 <= N <= 2000
	1 <= W <= 2000
	1 <= value[i],weight[i] <= 1000
