#include <bits/stdc++.h>
using namespace std;
int dp[2005][2005]; // using dp array to store values of overlapping sub-problems, also we are using top-down recursive approach

int zeroOneKnapsack(int N, int W, int value [], int weight []) {
    // helper function to calculate the maximum value of knapsack
    if(N <= 0|| W <= 0)
        return 0;
    if(dp[N][W]!=-1)
        return dp[N][W];
    if(W - weight[N-1] < 0)
        return dp[N][W] = zeroOneKnapsack(N-1, W, value, weight);
    return dp[N][W] = max( zeroOneKnapsack(N-1, W, value, weight), value[N-1] + zeroOneKnapsack(N-1, W - weight[N-1], value, weight) );
}
int main() {
    // Taking the Sample Input Values
    int N = 3;
    int value[] =  { 60, 100, 120 };
    int weight[] = { 10, 20, 30 };
    int W = 50;

    memset(dp, -1, sizeof(dp));   // setting the values of dp array to -1
    int result = zeroOneKnapsack(N, W, value, weight);

    cout << result << endl;
    return 0;
}
