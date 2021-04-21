
# Finding minimum element in a rotated array
def findMin(array):
    left, right = 0, len(array) - 1

    while left < right - 1:
        middle = (left + right) // 2

        # Middle located within the left rotated part
        if array[middle] < array[left]:
            right = middle

        # Middle located within the right rotated part
        elif array[middle] > array[right]:
            left = middle

        # Middle is located between the left and right, its a correct increasing order.
        else:
            right = middle

    return array[left] if array[left] < array[right] else array[right]



if __name__ == "__main__":
    array = [4, 5, 6, 7,  1, 2]
    print(findMin(array))