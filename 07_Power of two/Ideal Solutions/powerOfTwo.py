
# Checking whether the number is power of 2 or not
def powerOfTwo(Number):
    if Number == 0:
        return False

    while Number != 1:
        if Number % 2 != 0:
            return "No"
        Number = Number // 2

    return "Yes"


if __name__ == "__main__":

    # Static Input
    N = 4

    print(powerOfTwo(N))
