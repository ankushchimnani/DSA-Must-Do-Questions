# Sort array 0's , 1's and 2's in order

def sortArray(array):
    # Variable Declaration
    current = 0  # Current pointer which will point to current position
    leftPointer = 0  # Left Pointer which will point to the left most position
    rightPointer = len(array) - 1  # Right Pointer which will point to the right most position

    while current <= rightPointer:  # current pointer will move towards the right pointer

        # If current pointer contains the value 0, Then Move the 0 to begin, by swapping it with left pointer
        if array[current] == 0:
            array[current], array[leftPointer] = array[leftPointer], array[current]
            current = current + 1
            leftPointer = leftPointer + 1

        # If current pointer contains the value 1, Then keep it as the same position
        elif array[current] == 1:
            current += 1

        # If current pointer contains the value 2, Then Move the 2 to last by swapping with right pointer
        else:
            array[current], array[rightPointer] = array[rightPointer], array[current]
            rightPointer = rightPointer - 1

    return array


if __name__ == "__main__":
    # Static Input
    array = [0, 1, 2, 0, 1, 2]

    print(sortArray(array))
