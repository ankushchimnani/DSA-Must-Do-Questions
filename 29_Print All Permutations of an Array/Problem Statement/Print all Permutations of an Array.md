## **Print all Permutations of an Array**
Given an array of distinct integers of size N, the task is to generate and print all permutations of the given array.

#### **Sample Input**
    N = 3
    arr[] = {0, 1, 2}

#### **Sample Output**
    0 1 2
    1 0 2
    0 2 1
    2 0 1
    1 2 0
    2 1 0
#### **Sample Explanation**
    Generating all permutations of the array by checking all possible numbers at all index.

#### **Expected Time Complexity**
__O__(N*N!), where N is the size of the array
#### **Expected Space Complexity**
__O__(N), Auxiliary space

#### **Constraints**
	1 <= N <= 6
	-10 <= arr[i] <= 10
	All the integers of array are unique
