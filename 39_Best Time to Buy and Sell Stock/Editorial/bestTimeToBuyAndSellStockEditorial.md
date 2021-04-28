### Best time to buy and sell stocks - Editorial

### Difficulty:  Easy

### Prerequisite:  Dynamic programming.
---
### Hint

Try maximising the difference between prices of two days. 

### Short Explanation

* Since buying and selling of stocks needs to be done in two different days, it is enough to maximise the value of prices[j] - prices[i] for all i,j ( 1 <= i < j <= N ), where on ith day the stock is bought and on jth day it is sold.

### Detailed Explanation

* Let there be N days to buy and sell stocks with prices[N] denoting the cost of stocks for all of N days.

* One possible solution is to calculate the profit obtained for all pairs of days i, j ( 1 <= i < j <= N ) and to take out the maximum among them. This will lead to a time complexity of O(NxN) which is not desirable.
* Observation:
  1. If on ith day ( 1 <= i <= N ) a stock is bought, then for it to be sold on jth day, i < j <= N.
  2. Let a stock is bought on day i ( 1<= i <= N) with cost prices[i]. Let the cost of stock on days j and k ( i < j < k ) be prices[j] and prices[k], with the condition that prices[i] < prices[j] < prices[k], then, it is better to sell the stock bought on day i on day k than day j.

* Hence it is optimal to determine for all prices[j] ( 1 <= j <= N ) the minimum value of prices[i] for all i < j. This can be easily done by repeated updation of the minimum cost of stocks. The maximum among all the values of prices[j] - (min stock price) for all j ( 1 < j <= N ) will fetch the optimal result.

* Pseudo code:
  ```python
  N; // Number of days 

  prices[N]; // stock prices
  
  min_price; // Minimum value of stock

  max_profit;

  for (int i = 0; i < N; i++) {

        if (prices[i] < min_price)

            minprice = prices[i];

        else if (prices[i] - min_price > max_profit)

            max_profit = prices[i] - min_price;
   }
  
  print(max_profit);    
  ```
* Example -
  ```python
  N = 6, prices = [7,1,5,3,6,4]
  
  min_price, max_profit.

  Iteration 1: prices[1] = 7, min_price = 7, max_profit = 0.
  
  Iteration 2: prices[2] = 1, min_price = 1, max_profit = 0.
  
  Iteration 3: prices[3] = 5, min_price = 1, max_profit = 4.
  
  Iteration 4: prices[4] = 3, min_price = 1, max_profit = 4.
  
  Iteration 5: prices[5] = 6, min_price = 1, max_profit = 5.
  
  Iteration 6: prices[6] = 4, min_price = 1, max_profit = 5.

  Hence maximum profit obtained is 5.
  ```
### Time Complexity:

`O(N)`, where N is the number of days to buy and sell stocks.

Only a single iteration over the prices array is required.

### Space Complexity:

`O(1)`,No extra space is required.

### Alternate Solution:

None
