
class Node:
	def __init__(self, value=0, next=None):
		self.value = value
		self.next = next

class AddTwoList:
	def addTwoList(self, listNode1, listNode2):

		tempNode = Node()
		current = tempNode
		carry = 0

		while(listNode1 != None or listNode2 != None):

			if listNode1 != None:
				valueOfList_1 = listNode1.value
			else :
				valueOfList_1 = 0

			if listNode2 !=None:
				valueOfList_2 = listNode2.value
			else:
				valueOfList_2 = 0


			sum1 = valueOfList_1 + valueOfList_2 + carry
			carry = sum1//10

			current.next = Node(sum1%10)
			current = current.next

			if listNode1 != None:
				listNode1 = listNode1.next

			if listNode2 != None:
				listNode2 = listNode2.next

		











# MAIN FUNCTION
if __name__ == "__main__":

	# Inputs
	N = 5
	arr = [5, 1, 6, 3, 7]

	bubbleSort(arr, N)
	print("hello")

	# Printing Elements of array
	print(arr)

