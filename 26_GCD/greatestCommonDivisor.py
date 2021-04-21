# Compute GCD of A and B
def greatestCommonDivisor(N, M):
    if M == 0 :
        return N
    return greatestCommonDivisor(M, N%M)
    pass


if __name__ == "__main__":

    # Input
    array = [1, 2, 1, 3, 5, 6, 4]
    N = 10
    M = 6

    print(greatestCommonDivisor(N, M))
