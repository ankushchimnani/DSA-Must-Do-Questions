# Prints nearest neighbour smallest element present on the left side of the array
def nearestSmallestNeighbour(array):
    # Created Empty Stack
    nearestArray = []
    n = len(array)
    result = []

    for i in range(n):

        # Nearest Neighbour is achieved by using Stack.
        # Insert each element in the stack
        # But keep on popping the element which will greater then the current element
        while len(nearestArray) > 0 and nearestArray[-1] >= array[i]:
            nearestArray.pop()

        # If At any point , the stack is empty that means no smallest neighbour element exist for the current element
        if len(nearestArray) == 0:
            result.append(-1)

        # Otherwise the top element of the stack is the nearest smallest element.
        else:
            result.append(nearestArray[-1])

        # Insert Every element
        nearestArray.append(array[i])

    return result


if __name__ == "__main__":

    # Static input
    array = [1, 2, 5, 3, 5]
    print(nearestSmallestNeighbour(array))
