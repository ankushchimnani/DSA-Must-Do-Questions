# Finds Nth Fibonacci Number
def nthFibonacci(Number):
    first, second = 0, 1

    # Base Case
    if Number < 0:
        print("Wrong Input")
    elif Number == 0:
        return first
    elif Number == 1:
        return second


    # Finding Nth Fibonacci using recurring addition
    else:
        for i in range(2, Number + 1):
            third = first + second
            first = second
            second = third

        return second


if __name__ == "__main__":
    array = []

    # Static Input
    N = 9

    print(nthFibonacci(N))
