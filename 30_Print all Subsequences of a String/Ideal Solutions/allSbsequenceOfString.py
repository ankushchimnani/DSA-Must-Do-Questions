def allSubsequenceOfString(input, subsequenceString=""):

    if len(input) == 0:
        print(subsequenceString, end=" ")
        return

    allSubsequenceOfString(input[:-1], subsequenceString + input[-1])
    allSubsequenceOfString(input[:-1], subsequenceString)

    return


if __name__ == "__main__":

    #Input
    input = "abc"

    allSubsequenceOfString(input)
