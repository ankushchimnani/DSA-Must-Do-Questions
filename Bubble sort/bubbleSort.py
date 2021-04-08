
# Swap the elements of array present in first and second location.
def swap(arr, first, second):
	arr[first], arr[second] = arr[second], arr[first]
	



# Bubble Sort Function which will sort the given input array of length N.
def bubbleSort(arr, N):

	for i in range(N-1):
		for j in range(0, N-i-1):

			# If adjacent elements are not in increasing order, Then swap the elements
			if arr[j] > arr[j+1]:
				swap(arr, j, j+1)

	

# MAIN FUNCTION
if __name__ == "__main__":

	# Inputs
	N = 5
	arr = [5, 1, 6, 3, 7]

	bubbleSort(arr, N)

	# Printing Elements of array
	print(arr)


