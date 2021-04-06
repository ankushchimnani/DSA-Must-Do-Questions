# Given Two Strings, Check whether they are anagrams of each other
def checkAnagram(X, Y):
    # If length of String X not equal to length of String Y, then Two strings must not be a anagram
    if len(X) != len(Y):
        return False

    # Saving the char count in a Dictionary of String X
    countX = dict()
    for char in X:
        try:
            countX[char] += 1
        except:
            countX[char] = 1

    # Saving the char count in a Dictionary of String Y
    countY = dict()
    for char in Y:
        try:
            countY[char] += 1
        except:
            countY[char] = 1

    # Comparing Char count of String X and Y
    for char in countX:
        try:
            if countX[char] != countY[char]:
                return False
        except:
            return False

    return True


if __name__ == "__main__":

    # Input
    X = "abcd"
    Y = "dacb"

    print(checkAnagram(X, Y))
