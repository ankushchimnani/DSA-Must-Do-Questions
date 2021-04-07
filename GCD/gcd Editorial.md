# GCD- Editorial

### Difficulty:  Medium

### Prerequisite: Recursion, Modulo Operation

### Hint

* Greatest Common Divisor (GCD) of two or more numbers (A and B) is the largest positive number that divides all the numbers which are being taken into consideration. So we can think of finding an integer which divides both A and B.

### Short Explanation

* We can traverse from min(A,B) to 1 and check which number divides both A and B, and if it does it is the GCD but it will take O(min(A,B)) time


### Detailed Explanation

We are going to use index of elements in dequeue instead of the array elements.
1. Process the first k elements separately to initiate the dequeue

2. Iterate over the array. At each window processing :
    * Clean the dequeue :
    * Keep only the indexes of elements from the current sliding window
    * Remove indexes of all elements smaller than the current one, since they will not be the maximum ones
    * Append the current element to the dequeue
    * Output the dequeue[0] at the end of each window processing, as it is the maximum value



### Time Complexity:

`O(n)`, where `N` is the size of array

### Space Complexity:

`O(n-k+1)`, where `N` is the size of array and `k` is size of window

### Alternate Solution:

Using heap we could have solved the problem by making a max heap of size k and then inserting new elements to it as we move the window ahead and using heapify to maintain the heap and get the maximum value from root of the max heap, complexity of this approach will be O(n*log(k))