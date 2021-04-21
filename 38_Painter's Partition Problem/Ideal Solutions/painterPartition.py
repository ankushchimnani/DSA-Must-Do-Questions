import sys

# Calculate Sum between two index
def calculateSum(arr, intial, final):
    totalSum = 0

    for value in range(intial, final + 1):
        totalSum += arr[value]

    return totalSum


# Painter Problem DP approach
def painterPartition(arr, noOfPainters):
    noOfBoards = len(A)

    dpArray = [[0 for i in range(noOfBoards + 1)]
               for j in range(noOfPainters + 1)]

    # Base Case
    for i in range(1, noOfBoards + 1):
        dpArray[1][i] = calculateSum(arr, 0, i - 1)

    # Base Case
    for i in range(1, noOfPainters + 1):
        dpArray[i][1] = arr[0]

    # For Other Cells
    for row in range(2, noOfPainters + 1):
        for column in range(2, noOfBoards + 1):

            optimum = sys.maxsize

            for g in range(row, column + 1):
                optimum = min(optimum, max(dpArray[row - 1][g],
                                           calculateSum(arr, noOfPainters, column - 1)))

            dpArray[row][column] = optimum

    return dpArray[noOfPainters][noOfBoards]


if __name__ == "__main__":
    # Static Input
    k = 2
    A = [10, 10, 10, 10]

    print(painterPartition(A, k))
