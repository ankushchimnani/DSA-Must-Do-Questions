# Frequency in sorted array
def binarySearch(array, low, high, element):
    if high < low: return -1

    middle = int(low + (high - low) / 2)

    if array[middle] == element: return middle

    if array[middle] > element:
        return binarySearch(array, low, middle - 1, element)

    return binarySearch(array, middle + 1, high, element)


def frequencyInSortedArray(array, N, Q):
    index = binarySearch(array, 0, N - 1, Q)

    if index == -1: return 0

    frequencyCount = 1
    left = index - 1

    # Counting on left side
    while left >= 0 and array[left] == Q:
        frequencyCount += 1
        left -= 1

    # Counting on right side
    right = index + 1
    while right < N and array[right] == Q:
        frequencyCount += 1
        right += 1

    return frequencyCount


if __name__ == "__main__":
    array = []

    # Static Input :
    array = [1, 3, 3, 4, 5, 6, 7, 7, 8, 9]
    N = 10

    Q = 3
    print(frequencyInSortedArray(array, N, Q))
    Q = 7
    print(frequencyInSortedArray(array, N, Q))
    Q = 1
    print(frequencyInSortedArray(array, N, Q))
