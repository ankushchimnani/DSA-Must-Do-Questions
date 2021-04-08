# Permuatation With Largest Sum
def permutationWithLargestSum(arr, N):
    # Sort The Array
    arr.sort()

    # Output The Result
    for i in arr:
        print(i, end=",")


if __name__ == "__main__":
    # Intializing the list
    N = 4
    arr = [3, 5, 6, 1]

    permutationWithLargestSum(arr, N)
