## **Painter's Partition Problem**
We have to paint n boards of length {A1, A2…An}. There are k painters available and each takes 1 unit time to paint 1 unit of board. The problem is to find the minimum time to get this job done under the constraints that any painter will only paint continuous sections of boards


#### **Sample Input**
    k = 2, A = {10, 10, 10, 10} 

#### **Sample Output**
    20

#### **Sample Explanation**
    Here we can divide the boards into 2 equal sized partitions, so each painter  gets 20 units of board and the total time taken is 20. 

#### **Expected Time Complexity**
__O__(N*log(sum)), where N is the length of the array, sum is the sum of array elements.
#### **Expected Space Complexity**
__O__(1), constant space solution

#### **Constraints**
    1<= N <= 10^5
    1<= arr[i] <= 10^5

