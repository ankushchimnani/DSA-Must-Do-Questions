

def permutationsOfArray(array, permutations , size, result):

    if len(permutations) == size:
        result.append(permutations)
        return

    for num in array:
        if num not in permutations:
            permutationsOfArray(array, permutations + [num], size, result)

    return




if __name__ == "__main__":

    #Input
    array = [0, 1, 2]
    result = []
    permutations = []

    permutationsOfArray(array, permutations, len(array), result)

    print(result)
