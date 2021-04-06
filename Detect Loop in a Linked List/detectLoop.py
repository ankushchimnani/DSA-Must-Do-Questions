# Node Class containing the value and next pointer
class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


# List class containing set of functions to insert, print and detect loop
class List:
    # Intialize the head object
    def __init__(self):
        self.head = None

    # This will insert the node at he beginning
    def insert(self, value):
        node = Node(value)
        node.next = self.head
        self.head = node

    # This function will print the complete list
    def print(self):
        temporaryNode = self.head

        while temporaryNode:
            print(temporaryNode.value)
            temporaryNode = temporaryNode.next

    # This function will detect the loop in the list
    def detectLoop(self):
        slowPointer, fastPointer = self.head, self.head
        while slowPointer and fastPointer and fastPointer.next:
            slowPointer = slowPointer.next
            fastPointer = fastPointer.next.next
            if slowPointer == fastPointer: return True

        return False


if __name__ == "__main__":
    list = List()

    list.insert(3)
    list.insert(2)
    list.insert(0)
    list.insert(-4)

    # Inserting Cycle in the linked list
    list.head.next.next.next.next = list.head

    # list.print()           # Runs Infinite Times, Because List contains Loop

    if list.detectLoop():
        print("List Contains Cycle")
    else:
        print("Not Contains Cycle")
