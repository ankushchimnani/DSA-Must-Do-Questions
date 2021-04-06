# Function that checks whether input string is palindrome or not
def checkPalindrome(inputString):
    midLength = int(len(inputString) / 2)  # Finds Mid Length Of String
    totalLength = int(len(inputString))  # Total Length of String

    # Compares Beginning Characters with the last characters, Till middle Length
    for index in range(0, midLength):
        if inputString[index] != inputString[totalLength - index - 1]:
            return False

    return True  # If All characters Matches , Return True


if __name__ == "__main__":

    # Static Input :
    inputString = "madam"

    if checkPalindrome(inputString):
        print("Yes")
    else:
        print("No")
