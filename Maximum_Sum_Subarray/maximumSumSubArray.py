from sys import maxsize

# Finding maximum sum sub-array
def maximumSumSubArray(array, size):

    # Variable Declaration
    maxSum = 0                  # Accumulating All the current values
    maxSum_till_now = -maxsize  # Hold Maximum sum possible till now
    startIndex = 0              # Keep track of Start index of sub-array that will give largest sum
    endIndex = 0                # Keep track of End index of sub-array that will give largest sum
    updatedStart = 0            # Hold updated Start Value

    # Loop through the array
    for index in range(0, size):
        # Keep track of sum of all values till now
        maxSum += array[index]

        # update Maximum sub-array sum possible till now, If new sum comes then it will updated
        if maxSum_till_now < maxSum:
            maxSum_till_now = maxSum  # Updated Max sub-array sum
            startIndex = updatedStart  # Update Start Index
            endIndex = index  # Update End Index

        # Make sure that max sum should not go < 0
        if maxSum < 0:
            maxSum = 0
            updatedStart = index + 1

    return maxSum_till_now


if __name__ == "__main__":
    # Input
    array = [2, -3, 4, -1, -2, 1, 5, -3]
    size = len(array)

    print(maximumSumSubArray(array, size))
