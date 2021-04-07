#include <bits/stdc++.h>
using namespace std;

const int M = 1010;

int longestCommonSubsequence(string X, string Y, int m, int n, int dp[][M]) {
    // Function to calculate the longest common subsequence of two strings
    // Base case
    if (m == 0 || n == 0)
        return 0;

    // Already Computed state
    if (dp[m - 1][n - 1] != -1)
        return dp[m - 1][n - 1];

    if (X[m - 1] == Y[n - 1]) {
        return dp[m - 1][n - 1] = 1 + longestCommonSubsequence(X, Y, m - 1, n - 1, dp);
    }
    else {
        return dp[m - 1][n - 1] = max(longestCommonSubsequence(X, Y, m, n - 1, dp), longestCommonSubsequence(X, Y, m - 1, n, dp));
    }
}

// Driver Code
int main() {

    string X = "abcde";
    string Y = "ace";
    int m = X.length(), n = Y.length();

    int dp[max(m, n)][M];

    // assign -1 to all positions
    memset(dp, -1, sizeof(dp));

    cout << longestCommonSubsequence(X, Y, m, n, dp) << endl;

    return 0;
}