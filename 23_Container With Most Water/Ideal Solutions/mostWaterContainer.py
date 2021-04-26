
# Calculating the conatainer area with most water
def mostWaterContainer(container):

    # Setting left pointer, right pointer and area
    leftMostSide = 0
    rightMostSide = len(container) - 1
    maxArea = 0

    while leftMostSide < rightMostSide:

        # Keep Track of max area
        maxArea = max(maxArea, min(container[leftMostSide], container[rightMostSide]) * (rightMostSide - leftMostSide))

        # Either side which will be smaller , index will be updated
        if container[leftMostSide] < container[rightMostSide]:
            leftMostSide += 1
        else:
            rightMostSide = rightMostSide - 1

    return maxArea


if __name__ == "__main__":
    array = []

    # Inputs
    container = [1, 8, 6, 2, 5, 4, 8, 3, 7]

    print(mostWaterContainer(container))
