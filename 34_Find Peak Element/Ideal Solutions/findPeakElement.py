def findPeakElement(array, N):

    # 1. Set left and right values
    left = 0
    right = N-1

    # 2. For Binary Search, we have to ensure the condition of left < right
    while left < right:

        # 2.1 Calculate mid
        mid = int((left + right)/2)

        # 2.2 check mid element is greater than forward neighbour. If True, Then Recur the left side of the array.
        if array[mid] > array[mid + 1]:
            right = mid

        # 2.3 check mid element is less than forward neighbour. If False, Then Recur the right side of the array.
        else:
            left = mid + 1

    return left


if __name__ == "__main__":

    # Input
    array = [1, 2, 1, 3, 5, 6, 4]
    N = 7

    print(findPeakElement(array, N))
