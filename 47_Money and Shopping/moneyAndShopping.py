
# Money and Shopping Problem
def moneyAndShopping(arr, N):
    dp = [[0] * N for _ in range(3)]
    dp[0][0] = arr[0][0]
    dp[0][1] = arr[0][1]
    dp[0][2] = arr[0][2]


    for i in range(0 ,N):
        dp[i][0] = arr[i][0] + min(dp[i - 1][1], dp[i - 1][2])
        dp[i][1] = arr[i][1] + min(dp[i - 1][0], dp[i - 1][2])
        dp[i][2] = arr[i][2] + min(dp[i - 1][0], dp[i - 1][1])

    return min(dp[N - 1][0], dp[N - 1][1], dp[N - 1][2])



if __name__ == "__main__":
    # input
    N = 3
    arr = [[1, 50, 50],
          [50, 50, 50],
          [1, 50, 50]]

    print(moneyAndShopping(arr, N))
