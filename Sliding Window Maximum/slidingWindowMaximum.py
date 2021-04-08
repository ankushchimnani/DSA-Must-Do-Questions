from collections import deque

# Sliding Window Problem
def slidingWindowMaximum(arr, K):
    slidingDeque = deque()
    maxWindow = []

    for index, currentValue in enumerate(arr):
        while slidingDeque and arr[slidingDeque[-1]] < currentValue:
            slidingDeque.pop()

        # Add element in the queue from the right
        slidingDeque.append(index)

        if slidingDeque[0] == index - K:
            slidingDeque.popleft()

        if index >= (K-1):
            maxWindow.append(arr[slidingDeque[0]])

    return maxWindow





if __name__ == "__main__":

    # Input
    arr = [1, 2, 3, 1, 4, 5]
    K = 3

print(slidingWindowMaximum(arr, K))
