### GCD- Editorial

### Difficulty:  Medium

### Prerequisite: Recursion, Modulo Operation
---
### Hint

* To get GCD of two numbers think about subtracting smaller one from the larger number to get the a number which divides both of them.

### Short Explanation

*  Greatest Common Divisor (GCD) of two or more numbers (A and B) is the largest positive number that divides all the numbers which are being taken into consideration. So we can think of finding an integer which divides both A and B.


### Detailed Explanation

* We can traverse from min(A,B) to 1 and check which number divides both A and B, and if it does it is the GCD but it will take O(max(A,B)) time.

* We are going to use Euclidean method to find out the GCD efficiently, The idea is, GCD of two numbers doesn’t change if smaller number is subtracted from a bigger number now to make it more efficient instead of subtraction, if we divide the smaller number, the algorithm stops when we find remainder 0.

### Time Complexity:

` O(log(max(A, B))) `, where `A` and `B` are two Numbers

### Space Complexity:

`O(1)`, Constant space is required.

### Alternate Solution:

Read about Extended Euclidean to apply
