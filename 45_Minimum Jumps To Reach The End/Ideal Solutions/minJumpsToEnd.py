
# Min Jumps Steps to reach end
def minJumpsToEnd(jumps):

    # Initialize Variable
    countSteps = 0
    maxDistance = 0
    currentDistance = 0

    for index in range(len(jumps)):

        # Since we need to minimize the steps, therefore
        # 1. First move to the current Distance index value
        # 2. From there, we will try to reach end
        if index > currentDistance:

            # Max Distance should be keep track
            currentDistance = maxDistance

            # Keeping track of Steps Count
            countSteps += 1

        # Keeping track what is the max distance we can reach from all the past current position
        maxDistance = max(maxDistance, index+jumps[index])

    return countSteps


if __name__ == "__main__":

    # input
    jumps = [2, 3, 1, 1, 4]

    print(minJumpsToEnd(jumps))