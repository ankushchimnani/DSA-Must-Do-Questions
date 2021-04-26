
# Convert the number into its Binary Representation
def binaryRepresentation(Number):

    for i in range(31, -1, -1):
        if Number & (1 << i):
            print("1", end="")
        else:
            print("0", end="")


if __name__ == "__main__":

    # Static Input
    N = 7

    binaryRepresentation(N)
