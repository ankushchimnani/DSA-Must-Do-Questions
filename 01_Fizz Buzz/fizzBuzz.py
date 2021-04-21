# Print "Fizz" for multiple of 3 and print "Buzz" for multiple of 5
def fizzBuzz(N):
    for value in range(1, N + 1):

        # For multiple of 3 ----> Print "Fizz"
        if value % 3 == 0:
            print("Fizz")
            continue

        # For multiple of 5 ----> Print "Buzz"
        if value % 5 == 0:
            print("Buzz")
            continue

        print(value)


if __name__ == "__main__":

    # Static Input
    N = 7

    fizzBuzz(N)
