def longestIncreasingSubsequence(array):

    # If array is empty , Then no sequence exist
    if len(array)==0 : return 0

    # Creating a dp array of size N+1
    longestSubsequence = [1]*len(array)

    # For each i, we will compute first i elements
    # Calculation of first i-1 element of dp helps in the computation of DP[i] i.e longestSubsequence[i]
    for i in range(len(array)):
        current = array[i]

        for j in range(i):
            previous = array[j]

            if previous < current:
                longestSubsequence[i] = max(longestSubsequence[i], longestSubsequence[j]+1)

    return max(longestSubsequence)



if __name__ == "__main__":

    # Input
    array = [10, 22, 9, 33, 21, 50, 41, 60, 80]

    print(longestIncreasingSubsequence(array))