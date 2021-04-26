
# Convert binary to number
def binaryToNumber(nums):

    number = 0
    base = 1
    size = len(nums)

    for i in range(size-1, -1, -1):
        if nums[i] == '1':
            number += base
        base = base*2

    return number


if __name__ == "__main__":

    # Static Input
    nums = "00000000000000000000000000111"

    print(binaryToNumber(nums))
