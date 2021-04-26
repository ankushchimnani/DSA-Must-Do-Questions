## **Permutation with Largest Sum**
Given an array of N integers. You are allowed to rearrange the element of the array (arr[i]). The task is to find the permutation for which we get maximum value of Σ arr[i]*i, where i = 0, 1, 2,…., n – 1.

__Note__: You need to find the permutaion to maximize the mentioned sum

#### **Sample Input**
    N = 4, arr[] = { 3, 5, 6, 1 }

#### **Sample Output**
    1 3 5 6

#### **Sample Explanation**
    Rearrange arr[] as { 1, 3, 5, 6 }. 
    Sum of arr[i]*i is 1*0 + 3*1 + 5*2 + 6*3  = 31, which is maximum
    So the permutation will be 1,3,5,6 which gives maximum value

#### **Expected Time Complexity**
__O__(N*logN), where N is the length of the array
#### **Expected Space Complexity**
__O__(1), Auxiliary space.
#### **Constraints**
    1<= N <= 10^5
    1<= arr[i] <= 10^6

