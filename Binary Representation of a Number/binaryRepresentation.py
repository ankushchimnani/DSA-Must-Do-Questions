
# Convert the number into its Binary Representation
def binaryRepresentation(Number):
    if Number > 1:
        binaryRepresentation(Number // 2)

    print(Number % 2, end=" ")


if __name__ == "__main__":
    array = []

    # Static Input
    N = 7

    binaryRepresentation(N)
