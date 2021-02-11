## **Coin Change Problem**

You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
You may assume that you have an infinite number of each kind of coin.



#### **Sample Input**
	coins = [1,2,5], amount = 11

#### **Sample Output**
	3

#### **Sample Explanation**
In the sample test case, the amount 11 can be made by adding two coins of 5 and one coin of denomination 1. Therefore, the ouptut is 3.  

#### **Expected Time Complexity**
__O__(S∗n), where S is the amount, n is denomination count.

#### **Expected Space Complexity**
__O__(S), where S is the amount.

#### **Constraints**
	1 <= coins.length <= 12
	1 <= coins[i] <= 2^31 - 1
	0 <= amount <= 10^4
