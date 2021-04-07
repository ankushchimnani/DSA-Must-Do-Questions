import math

def rodCuttingProblem(price, size):

    # Create a dp array of rod size, having intial values all 0's
    dp = [0] + [0 for x in range(size)]

    # For particular value of i, make all possible cuts and choose max out of it
    for i in range(1, size+1):
        maxVal = -math.inf

        # From all possible cuts ,choosing the max one and storing it into the dp
        for j in range(i):
            maxVal = max(maxVal, price[j] + dp[i-j-1])
        dp[i] = maxVal

    # Returning the last entry
    return dp[size]



if __name__ == "__main__":
    length = [1, 2, 3, 4, 5, 6, 7, 8]
    price = [1, 5, 8, 9, 10, 17, 17, 20]

    size = len(length)
    print(rodCuttingProblem(price, size))
