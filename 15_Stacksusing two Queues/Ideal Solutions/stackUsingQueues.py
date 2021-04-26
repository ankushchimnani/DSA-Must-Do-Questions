from queue import Queue


class Stack:

    def __init__(self):

        self.queue1 = Queue()
        self.queue2 = Queue()

        self.size = 0


    def push(self, element):

        self.queue2.put(element)

        while not self.queue1.empty():
            self.queue2.put(self.queue1.queue[0])
            self.queue1.get()

        self.q = self.queue1
        self.queue1 = self.queue2
        self.queue2 = self.q

        self.size += 1


    def pop(self):

        if self.queue1.empty():
            return
        self.queue1.get()
        self.size -= 1

    def top(self):
        if self.queue1.empty():
            return -1
        return self.queue1.queue[0]

    def sizeStack(self):
        return self.size






if __name__ == "__main__":

    # Intialiaze
    S = Stack()
    S.push(5)
    S.push(6)
    S.push(7)

    print(S.top())
    S.pop()
    print(S.top())

    print(S.sizeStack())


