# Binary Search
def binarySearch(arr, N, target):
    low = 0
    high = N - 1
    middle = 0

    while low <= high:
        middle = (high + low) // 2

        # If Target is greater, Then consider right half
        if arr[middle] < target:
            low = middle + 1

        # If Target is smaller, Then consider left half
        elif arr[middle] > target:
            high = middle - 1

        # If found then return position
        else:
            return middle

    return -1


if __name__ == "__main__":
    array = []

    # Static Input
    N = 4
    K = 3
    arr = [1, 3, 4, 7]

    print(binarySearch(arr, N, K))