# Node Class containing the value and next pointer
class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


def helper(listNode1, listNode2, carry):
    if listNode1 == None and listNode2 == None and carry == 0:
        return

    Val1 = listNode1.value if listNode1 else 0
    Val2 = listNode2.value if listNode2 else 0

    total = carry + Val1 + Val2
    node = Node(total % 10)
    carry = total // 10

    list1Next = listNode1.next if listNode1 else None
    list2Next = listNode2.next if listNode2 else None

    node.next = helper(list1Next, list2Next, carry)

    return node


def printNode(temp):
    while temp:
        print(temp.value, end=" ")
        temp = temp.next


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


if __name__ == "__main__":
    list1 = List()

    list1.insert(2)
    list1.insert(4)
    list1.insert(3)

    list2 = List()

    list2.insert(5)
    list2.insert(6)
    list2.insert(4)

    node = helper(list1.head, list2.head, 0)
    printNode(node)
