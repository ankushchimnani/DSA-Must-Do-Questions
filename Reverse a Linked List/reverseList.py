# Reversing Linked List

class Node:
    def __init__(self, item):
        self.data = item
        self.next = None

class LinkedList:

    def __init__(self):
        self.head = None


    def reverseList(self):
        previousNode = None
        currentNode = self.head

        while currentNode is not None:
            forwardNode = currentNode.next
            currentNode.next = previousNode
            previousNode = currentNode
            currentNode = forwardNode

        self.head = previousNode


    def insertNode(self, dataItem):
        newNode = Node(dataItem)
        newNode.next = self.head
        self.head = newNode

    def printLinkedList(self):
        temp = self.head
        while(temp != None):
            print(temp.data)
            temp = temp.next


if __name__ == "__main__":

    #Intialize
    sampleLinkedList = LinkedList()

    #Insert Values
    sampleLinkedList.insertNode(5)
    sampleLinkedList.insertNode(10)
    sampleLinkedList.insertNode(15)

    sampleLinkedList.printLinkedList()
    sampleLinkedList.reverseList()
    print("\nAfter Reverse")
    sampleLinkedList.printLinkedList()

