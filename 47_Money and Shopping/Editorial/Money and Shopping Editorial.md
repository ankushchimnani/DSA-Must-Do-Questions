### Money and Shopping - Editorial

### Difficulty:  Medium

### Prerequisite: Dynamic Programming
---
### Hint

* There are only 3 items per shop so think about purchasing items which is not being purchased from previous shop and then minimise the cost.

### Short Explanation

* We can have a dp matrix to store the amount of money spent till any i-th row (shop). The minimum cost of purchasing an item in ith row (shop) is the dp value of items which are not being purchased in the previous (i-th) row (or shop) added to the price of item in the current (i)th row (shop). Minimum of all all three possible purchases in the last shop is the required answer.

### Detailed Explanation

* Make a dp matrix of size N*3 to store the amount of money spent in i-th row (shop)
* The amount of money spent in any i-th row (shop) will be :
    ```python
    dp[i][0] = arr[i][0] + min(dp[i - 1][1], dp[i - 1][2]);
    dp[i][1] = arr[i][1] + min(dp[i - 1][0], dp[i - 1][2]);
    dp[i][2] = arr[i][2] + min(dp[i - 1][0], dp[i - 1][1]);

    ```
* The last row will contain the total amount of money that can be spent while following the buying startegy in the question, So the output will be minimum of the 3 values  present in the dp matrix's last row :
   ```python
   Answer  =   min({ dp[N - 1][0], dp[N - 1][1], dp[N - 1][2] })
   ```

### Time Complexity:

`O(N)`, where `N` is the number of shop

### Space Complexity:

`O(N*3)`, where `N` is the number of shop

### Alternate Solution:

NA
