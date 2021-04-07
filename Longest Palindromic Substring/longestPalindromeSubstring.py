def expandAroundCenter(left, right, lengthOfString, str):
    while left >= 0 and right < lengthOfString and str[left] == str[right]:
        left -= 1
        right += 1
    return str[left + 1 : right]


def longestPalindromeSubstring(str):
    result = ""
    lengthOfString = len(str)

    for index in range(lengthOfString):
        result = max(expandAroundCenter(index, index, lengthOfString, str), expandAroundCenter(index, index+1, lengthOfString, str), result, key=len)

    return result


if __name__ == "__main__":

    # Input
    str = "xyzasisayzx"

    print(longestPalindromeSubstring(str))
