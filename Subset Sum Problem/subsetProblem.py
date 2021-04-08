def subsetProblem(array, n, targetSum, subsetSum):

    #Base Case
    if targetSum == 0: return True
    if n == 0 : return False

    # Return True, If Value already present in subsetSum array
    if subsetSum[n][targetSum] != -1:
        return subsetSum[n][targetSum]

    # If last Element is greater then Target SUm, Then we skip the recursive call and move to next
    if array[n-1] > targetSum:
        subsetSum[n][targetSum] = subsetProblem(array, n-1, targetSum, subsetSum)
        return subsetSum[n][targetSum]

    # We have two choices. Wither we can include or exclude it.
    exclude = subsetProblem(array, n-1, targetSum, subsetSum)
    include = subsetProblem(array, n-1, targetSum-array[n-1], subsetSum)

    # Store the values in DP array
    subsetSum[n][targetSum] = exclude or include

    return subsetSum[n][targetSum]


if __name__ == "__main__":

    # Static Input
    X = 11
    array = [3, 34, 4, 12, 5, 2]
    n = len(array)
    targetSum = 16

    # Creating 2D DP array
    subsetSum = [[-1 for i in range(targetSum+1)] for j in range(n+1)]

    print(subsetProblem(array, n, targetSum, subsetSum))
