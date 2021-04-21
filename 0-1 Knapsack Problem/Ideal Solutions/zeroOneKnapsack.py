def zeroOneKnapsack(weight, value, W, noOfItems, knapsackDP):
    if noOfItems == 0 or W == 0:
        return 0

    # If this Value is already computed , then don't compute it anr return the already calculated value
    if knapsackDP[noOfItems][W] != -1:
        return knapsackDP[noOfItems][W]

    # If current Item wait is less than W, Then we have two choices
    # 1. Include it
    # 2. Exclude it
    # Take max of both of it
    if weight[noOfItems - 1] <= W:
        knapsackDP[noOfItems][W] = max(
            value[noOfItems - 1] + zeroOneKnapsack(weight, value, W - weight[noOfItems - 1], noOfItems - 1, knapsackDP),
            zeroOneKnapsack(weight, value, W, noOfItems - 1, knapsackDP))

    # If current Item wait is  greater than W, Then we have only one choice
    # Skip it and move forward
    else:
        knapsackDP[noOfItems][W] = zeroOneKnapsack(weight, value, W, noOfItems - 1, knapsackDP)

    return knapsackDP[noOfItems][W]


if __name__ == "__main__":

    # Input
    value = [60, 100, 120]
    weight = [10, 20, 30]
    W = 50
    noOfItems = len(value)

    # Initialize 2D DP array
    knapsackDP = [[-1 for i in range(W + 1)] for j in range(noOfItems + 1)]

    print(zeroOneKnapsack(weight, value, W, noOfItems, knapsackDP))
