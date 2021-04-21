
# Given an Array, Find duplicates number in an array
def findDuplicatesInArray(array, N):

    # 1. Declared a set
    result = set()

    # 2. Run the loop from 0 to N
    for index in range(0, N):

        # 2.1 Get the value present inside the index value position
        value = abs(array[index])

        # 2.2 If the value present inside the index value position is <0, that means the value has duplicates
        if array[value-1] < 0:
            result.add(value)           # put the duplicate elements in the set
            array[value-1] = array[value-1] * -1

        # 2.2 If the value present inside the index value position is >0, then make it negative for tracking
        else:
            array[value-1] = array[value-1] * -1

    print(result)



if __name__ == "__main__":

    array = []

    # 1. Dynamic Input
    # N = int(input("Enter the size of array : "))
    # for i in range(0, N):
    #     ele = int(input())
    #     array.append(ele)

    # 2. Static Input :
    array = [1, 2, 3, 6, 3, 6, 1]
    N = 7

    findDuplicatesInArray(array, N)
