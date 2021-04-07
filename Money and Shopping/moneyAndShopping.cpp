#include <bits/stdc++.h>
using namespace std;

int moneyAndShopping(int arr[][3], int N)
{
    // Function to find minimum shopping money spent using the mentioned method
    int dp[N][3];
    dp[0][0] = arr[0][0];
    dp[0][1] = arr[0][1];
    dp[0][2] = arr[0][2];
    for (int i = 1; i < N; i++) {

        dp[i][0] = arr[i][0] + min(dp[i - 1][1], dp[i - 1][2]);
        dp[i][1] = arr[i][1] + min(dp[i - 1][0], dp[i - 1][2]);
        dp[i][2] = arr[i][2] + min(dp[i - 1][0], dp[i - 1][1]);
    }
    return min({dp[N - 1][0], dp[N - 1][1], dp[N - 1][2]});
}
int main()
{
    int N = 3;  // Number of shops
    int arr[N][3] = { {1, 50, 50},
                      {50, 50, 50},
                      {1, 50, 50}
    };    // Elements of the array representing prices of items in shop
    cout << moneyAndShopping(arr, N) << endl;
    return 0;
}