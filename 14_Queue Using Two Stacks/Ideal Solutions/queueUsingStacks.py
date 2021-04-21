# Queue using Stacks

class Queue:

    # Intialization
    def __init__(self):
        self.stack1 = []
        self.stack2 = []

    # Enqueue in queue : Move All Elements of Stack 1 to Stack 2
    def enqueue(self, element):

        while len(self.stack1) != 0:
            self.stack2.append(self.stack1[-1])
            self.stack1.pop()

        self.stack1.append(element)

        while len(self.stack2) != 0:
            self.stack1.append(self.stack2[-1])
            self.stack2.pop()

    # Dequeue item from queue
    def dequeue(self):

        if len(self.stack1) == 0:
            print("Queue is empty")

        element = self.stack1[-1]
        self.stack1.pop()
        return element


if __name__ == "__main__":
    # Intialiaze
    q = Queue()

    q.enqueue(7)
    q.enqueue(8)
    q.enqueue(9)
    q.enqueue(10)

    print(q.dequeue())
    print(q.dequeue())
