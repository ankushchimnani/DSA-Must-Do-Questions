
# This function places all the element which are lesser then pivot to the left side of the array and greater elment to right side of array.
def partition(array, low, high):
    left = low-1                  # Smaller Element Index
    pivot = array[high]           # Pivot Element

    # Putting Smaller element to left side of the array
    for movingPtr in range(low, high):
        if array[movingPtr] <= pivot:
            left = left + 1
            array[left], array[movingPtr] = array[movingPtr], array[left]

    # Putting Pivot element to its position
    array[left+1], array[high] = array[high], array[left+1]
    return left+1



def quickSort(array, low, high):
    if len(array) == 1:
        return array

    if low < high:
        # Putting Pivot at the right place
        pivot = partition(array, low, high)

        # Separately Sort left part and right part of the array
        quickSort(array, low, pivot-1);
        quickSort(array, pivot+1, high);



if __name__ == "__main__":

    # Static Input
    array = [2, 6, 3, 0, 4, 1]
    N = len(array)

    quickSort(array, 0, N-1)
    print(array)