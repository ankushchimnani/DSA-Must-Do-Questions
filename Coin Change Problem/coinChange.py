# Calculate minimum number of coins to get the required amount
def coinChange(coins, amount):
    MAX = float('inf')
    minCoinCount = [0] + [MAX] * (amount + 1)

    for currentAmount in range(0, amount + 1):
        for coin in coins:
            if coin <= currentAmount:
                minCoinCount[currentAmount] = min(minCoinCount[currentAmount], 1 + minCoinCount[currentAmount - coin])

    if minCoinCount[amount] == MAX:
        return -1

    return minCoinCount[amount]


if __name__ == "__main__":
    array = []

    # Inputs
    coins = [1, 2, 5]
    amount = 11

    print(coinChange(coins, amount))
