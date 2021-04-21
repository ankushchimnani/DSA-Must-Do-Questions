## **Best Time to Buy and Sell Stock**

You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



#### **Sample Input**
	prices = [7,1,5,3,6,4]
	

#### **Sample Output**
	5

#### **Sample Explanation**
Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5. Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

#### **Expected Time Complexity**
__O__(N),where N is the number of days. 

#### **Expected Space Complexity**
__O__(1), constant space complexity.  

#### **Constraints**
	1 <= prices.length <= 10^5
	0 <= prices[i] <= 10^4

