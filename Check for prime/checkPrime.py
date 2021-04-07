import math


# Cheking Whether the number is prime or not
def checkPrime(Number):
    for i in range(2, int(math.sqrt(Number)) + 1):
        if Number % i == 0:
            return "No"
    return "Yes"


if __name__ == "__main__":
    array = []

    # Static Input
    Number = 7

    print(checkPrime(Number))
