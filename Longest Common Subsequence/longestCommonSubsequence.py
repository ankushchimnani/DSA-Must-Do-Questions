
# Finding Longest Subsequence between two sequences
def longestCommonSubsequence(sequenceFirst, sequenceSecond):

    # Declare 2D DP array of size first string and second string
    longestSubsequence = [[0 for i in range(len(sequenceSecond) + 1)] for j in range(len(sequenceFirst) + 1)]

    # Appending Space at beginning , So that loop will begin from 1st index
    sequenceFirst = " " + sequenceFirst
    sequenceSecond = " " + sequenceSecond

    # loop through both sequence
    for row in range(1, len(sequenceFirst)):
        for column in range(1, len(sequenceSecond)):

            # If Char matches then, add 1 to total combinations
            if sequenceFirst[row] == sequenceSecond[column]:
                longestSubsequence[row][column] = 1 + longestSubsequence[row-1][column-1]

            # If not matches then, take max of both remaining subsequence
            else:
                longestSubsequence[row][column] = max(longestSubsequence[row-1][column], longestSubsequence[row][column-1])

    return longestSubsequence[-1][-1]


if __name__ == "__main__":

    # Static Input
    text1 = "abcde"
    text2 = "ace"

    print(longestCommonSubsequence(text1, text2))
