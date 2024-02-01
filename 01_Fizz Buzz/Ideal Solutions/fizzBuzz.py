def fizzBuzz(N):
    for value in range(1, N + 1):

        # For multiple of 5 and 3 ----> Print "FizzBuzz"
        if value % 5 == 0 and value % 3 == 0:
            print("FizzBuzz")
            continue

        # For multiple of 5 ----> Print "Buzz"
        if value % 5 == 0:
            print("Buzz")
            continue

        # For multiple of 3 ----> Print "Fizz"
        if value % 3 == 0:
            print("Fizz")
            continue
        print(value)
 




if __name__ == "__main__":

    # Static Input
    N = 7

    fizzBuzz(N)
