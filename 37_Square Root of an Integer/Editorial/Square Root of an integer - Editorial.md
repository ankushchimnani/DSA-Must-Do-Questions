### **Square Root of an integer - Editorial**
### **Difficulty**: Easy
### **Prerequisite: Binary Search**:
---
### **Hint:**
Binary search can be used to find the square root of an integer.

### **Short Explaination**
We will find a middle element by taking start as 1 and end as N. We will check the value of the square of the middle element. If the value is less than N, we will make start as middle element+1, else if the value is greater we will make end element as middle element-1.

### **Detailed Explanation**:

#### Approach 1 : Brute Force
 
 * Iterate through every number till the result becomes greater or equal to N. The result here is the square of the number in hand.
* Case 1: N is perfect square
         a)    Return the number whose result equals to n.
         b)   Ex N=100 , Result = 10 * 10. Return 10

* Case 2: N is not a perfect square
        a) In this case, we got the result greater than N, so return Number-1
        Ex N=110, Result = 11 * 11 which is > 10. So return 10 i.e. (11-1)
        b) The time complexity will be O(sqrt(N))

Limitation: Iterating through each element till we got the result.
 
 #### Approach 2 : Binary Search
 
 ##### Idea 
* In binary search, we have to find a target element. Here we have to look for the element  whose square will equal to our target. So this problem can be thought of as a searching problem.
* We deploy binary search when we don’t want to iterate over every element. Here also we want the same.
* Binary search is done in a sorted array. Here we are also using our algo for 1 to N.


### Algorithm 
* Given a non negative integer N. Return its square root. 
* Set start to 1 and End to N.
* The looping condition will be the same as the binary search algorithm.

* Calculate mid position = (start+end)/2

    a) Case 1: Mid element * Mid element  = N
    We got our no, which is mid element. It is basically the case when N is a perfect square.

    b) Case 2: Mid element * Mid element  > N
    Update end to mid-1 

    Case 3: Mid element * Mid element  < N
    Update starts to mid+1. Also, save this mid element in a variable say Root. It is the case where N is not a perfect square.
    
* If N is a perfect square then our answer is mid otherwise Root.
* Handle the base cases for N=1 and N=0.

### Example
```python
1: N=100 (A perfect square)

Step 1: start = 1, end = 100, mid = (1+100)/2 = 50
50 *50 = 2500 > 100 
Since mid * mid > N, update end =  50-1

Step 2: start = 1, end =49, mid = 25
25 * 25 = 625 >100

Step 3: start = 1, end =24, mid = 12
12 * 12 = 144 >100

Step 4: start =1, end = 11 , mid =6
6 * 6 = 36 < 100
Since mid * mid < N, update start= 6+1

Step 5: start = 7, end = 11 ,mid =9
9*9 =81 <100

Step 6: start = 10, end =11 , mid =10
As 10 * 10 = 100 return mid i.e. 10

2: N=110 (Not A perfect square)

Step 1: start = 1, end = 110, mid = (1+110)/2 = 55
55 *55  > 110 
Since mid * mid > N, update end =  55-1

Step 2: start = 1, end =54, mid = 27
27 * 27  >110

Step 3: start = 1, end =26, mid = 13
13 * 13  >110

Step 4: start =1, end = 12 , mid =6
6 * 6 = 36 < 110
Since mid * mid < N, update start= 6+1 and Root to 6

Step 5: start = 7, end = 12 ,mid =9
9*9 =81 <110, update start= 9+1 and Root to 9

Step 6: start = 10, end =12 , mid =11
11 * 11 = 121 >110

Step 7: start = 10, end =10 , mid =10
10 * 10 = 100  < 110 , update start= 10+1 and Root to 10

Step 8: start = 11, end =10 , Loop end as start> end
Return Root i.e. 10 . It is floor(sqrt(110))
```

### **Time Complexity**:
#### Recurrence : T(n) = T(n/2) + c
* In every step of binary search,
    * We used to recur either left half or right half .
    * This will result in worst Case Time Complexity : `O(logn)`

### **Space Complexity**:
* No extra memory is needed
* Space : `O(1)`

### **Alternate Solution**:
Linear Search will result in TLE for some cases.
