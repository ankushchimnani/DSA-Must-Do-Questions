# Node Class
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


# Checking whether the linked list is palindrome or not
class Palindrome:

    def __init__(self):
        self.head = None

    #Inserting the element in the linked list
    def push(self, data):
        node = Node(data)
        node.next = self.head
        self.head = node

    # Reversing the linked list
    def getReversed(self, head):
        if not head:
            return head

        current, previous = head, None
        while current:
            nextNode = current.next
            current.next = previous
            previous = current
            current = nextNode

        return previous

    #Return the length of the linked list
    def getLength(self, head):
        if not head:
            return 0

        return self.getLength(head.next) + 1

    # Checking whether the list is palindrome or not
    def palindromeList(self):

        if not self.head or not self.head.next:
            return True

        prev, slow, fast = None, self.head, self.head

        # Getting the middle of linked list at slow pointer
        while fast and fast.next:
            prev = slow
            slow = slow.next
            fast = fast.next.next

        # Calculating the length of linked list
        lengthOfList = self.getLength(self.head)

        prev.next = None

        # If linked list is odd, then moving the slow ptr one step forward
        if lengthOfList % 2 == 1:
            slow = slow.next

        temp1, temp2 = self.head, slow

        # Getting the reverse of other half of linked list in rev
        rev = self.getReversed(temp2)

        # Comparing the the elements of two list and checking for palindrome.
        while temp1 and rev:
            if temp1.data != rev.data:
                return False
            temp1, rev = temp1.next, rev.next

        # If palindrome then returns True
        return True


if __name__ == "__main__":

    #Intializing the list
    list = Palindrome()

    # Pushing three elements in the linked list
    list.push(1)
    list.push(2)
    list.push(1)

    print(list.palindromeList())
