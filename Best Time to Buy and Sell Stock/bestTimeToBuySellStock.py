def bestTimeToBuySellStock(prices):
    maximumProfit = 0
    minPurchase = prices[0]

    for index in range(1, len(prices)):
        if prices[index] - minPurchase > maximumProfit:
            maximumProfit = prices[index] - minPurchase

        if prices[index] < minPurchase:
            minPurchase = prices[index]

    return maximumProfit


if __name__ == "__main__":

    # Static Input
    prices = [7, 1, 5, 3, 6, 4]

    print(bestTimeToBuySellStock(prices))
    