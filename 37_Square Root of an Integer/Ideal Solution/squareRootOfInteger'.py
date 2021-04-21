# Finding the square root of integer using Binary search
def squareRootOfInteger(X):
    low = 1  # Setting lower limit as 1
    high = X  # Setting higher limit as X

    while low <= high:

        # Calculating mid
        mid = (low + high) // 2

        # If Square of mid lie Before the Number X, Then Our required square should be present in the forward direction
        if mid * mid <= X:
            low = mid + 1
        # If Square of mid lie after the Number X, Then Our required square should be present in the backward direction
        else:
            high = mid - 1

    return low - 1


if __name__ == "__main__":
    # Static Input
    X = 11

    print(squareRootOfInteger(X))
