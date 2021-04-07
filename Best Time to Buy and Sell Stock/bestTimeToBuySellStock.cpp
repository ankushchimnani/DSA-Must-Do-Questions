#include <bits/stdc++.h>
using namespace std;
int maxProfit(int prices[], int N) {
    // Function to calculate maximum profit buy doing one buy and sell operation
    int cost = 0;
    int maxProfit = 0;
    if (N == 0)
        return 0;
    int minPrice = prices[0];
    for (int i = 0; i < N; i++)
    {
        minPrice = min(minPrice, prices[i]);
        cost = prices[i] - minPrice;
        maxProfit = max(maxProfit, cost);
    }
    return maxProfit;
}
int main() {

    int N = 6; // Total number of days

    //Stock prices on consecutive days
    int prices[] = { 7, 1, 5, 3, 6, 4 };
    cout << maxProfit(prices, N) << endl;
    return 0;
}