import math

class MinStack:

    # Intialiazing the data structure
    def __init__(self):
        self.myList = []
        self.min = math.inf

    # Pushing the element into stack
    def push(self, x: int) -> None:
        self.myList.append(x)
        if x < self.min:
            self.min = x

    # Popping the element from the stack
    def pop(self)->None:
        self.myList.pop()

        if self.myList:
            self.min = min(self.myList)
        else:
            self.min = math.inf

    # Getting the top element from the stack
    def top(self) -> int:
        return self.myList[-1]

    # Getting the minimum value from the stack
    def getMin(self) -> int:
        return self.min


if __name__ == "__main__":

    # Creating Object
    element = MinStack()

    # Successive Stack operations
    element.push(2)
    element.push(6)
    element.push(1)
    element.push(8)
    element.pop()

    print(element.getMin())
