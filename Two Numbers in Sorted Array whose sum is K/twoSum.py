
# 2 sum problem to find target number , from the sum of 2 numbers of given array
def twoSum(array, targetNumber):

    for index, val in enumerate(array):

        # Value of other number
        difference = targetNumber - val
        if difference in array:
            secondNumberIndex = array.index(difference)
            result = list((index, secondNumberIndex))

    return result


if __name__ == "__main__":

    # Static Input
    array = [2,7,11,15]
    K = 9

    print(twoSum(array, K))
