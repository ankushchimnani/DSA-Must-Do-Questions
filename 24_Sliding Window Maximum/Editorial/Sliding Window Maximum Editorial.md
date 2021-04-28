### Sliding Window Maximum - Editorial

### Difficulty:  Hard

### Prerequisite: Dequeue, Heap, Sliding Window
---
### Hint

* We can use heap to add element into the heap and in a maximum heap the largest element is always at heap[0], but to add a element in heap of size "k" will take log(k) time, to do it in O(n) time, can we use a window to process "k" elements, something like Dequeue.

### Short Explanation

* A dequeue (double-ended queue), the structure which pops from or pushes to either side with the same O(1) performance, we will process the first "k" elements and store them in the dequeue and then we will move ahead by moving the sliding window ahead and keeping the maximum for every window of size "k".

### Detailed Explanation

We are going to use index of elements in dequeue instead of the array elements.
1. Process the first k elements separately to initiate the dequeue

2. Iterate over the array. At each window processing :
    * Clean the dequeue :
    * Keep only the indexes of elements from the current sliding window
    * Remove indexes of all elements smaller than the current one, since they will not be the maximum ones
    * Append the current element to the dequeue
    * Output the dequeue[0] at the end of each window processing, as it is the maximum value

### **Pseudo code:**

* Sliding Window Maximum using Dequeue
  ```python
    Begin
        q = Dequeue()   
        ans = []
        // First K elements
        for( i = 0 to k-1)
        {
            while(!q.empty() and  arr[i] >= arr[q.back()])
            {
                q.pop_back()
            }    
            q.push_back(i)
        }
        ans.append(arr[q.front()])

        // For rest elements
        for(i = k to n-1)
        {
                while(!q.empty() and q.front() <= i-k)
                    q.pop_front()
                
                while(!q.empty() and arr[i] >= arr[q.back()])
                    q.pop_back()    
                q.push_back(i)
                ans.append(arr[q.front()])
        }   
        return ans
    End
  ```  

### Time Complexity:

`O(n)`, where `n` is the size of array

### Space Complexity:

`O(k)`, where `k` is size of window


### Alternate Solution:

Using heap we could have solved the problem by making a max heap of size k and then inserting new elements to it as we move the window ahead and using heapify to maintain the heap and get the maximum value from root of the max heap, complexity of this approach will be O(n*log(k))
