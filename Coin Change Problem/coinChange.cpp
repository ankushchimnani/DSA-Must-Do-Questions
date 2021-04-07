#include<bits/stdc++.h>
using namespace std;
int coinChange(int n, int amount, int coins[]) {
	// Function to calculate minimum number of coins required to form the amount

	vector<int> dp(amount + 1, INT_MAX); // dp vector to store minimum coins needed to make each smaller or sub amount less than the target amount

	dp[0] = 0;	// If amount is 0 , no coin is needed

	for (int i = 1; i <= amount; i++) {
		for (int j = 0; j < n; j++) {
			if (coins[j] <= i)	{

				int subAnswer = dp[i - coins[j]];

				if (subAnswer != INT_MAX && subAnswer + 1 < dp[i])
					dp[i] = subAnswer + 1;
			}
		}
	}
	if (dp[amount] != INT_MAX)
		return dp[amount];
	return -1;
}
int main() {
	int N = 3;	// Number of coins
	int amount = 11; // Total amount of money
	int coins[] = {1, 2, 5};
	int ans = coinChange(N, amount, coins);
	cout << ans << endl;
}