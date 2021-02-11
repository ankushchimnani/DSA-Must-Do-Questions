## **Frequency in Sorted Array**
Given a sorted array of N integers, you will be given Q queries and in each query you will be given an integer and you need to output the frequency of that integer in the given array. 

__Note__: Avoid using extra space like using Hashing or Map, It is expected to implement all functions which you use like Binary Search etc.

#### **Sample Input**
    N = 10 , Q = 3
    arr[] = { 1,3,3,4,5,6,7,7,8,9 }
    Query 1 : 3
    Query 2 : 7
    Query 3 : 11

#### **Sample Output**
    Output Query 1 : 2
    Output Query 2 : 2
    Output Query 3 : 0

#### **Sample Explanation**
    In Query 1 : Count of 3 is 2
    In Query 2 : Count of 7 is 2
    In Query 3 : Count of 11 is 0

#### **Expected Time Complexity**
__O__(log(N)) for each Query, N: Size of the input array
#### **Expected Space Complexity**
__O__(1), for each Query

#### **Constraints**
    1<= N <= 10^6
    1<= Q <= 10^5
    1<= arr[i] <= 10^9

