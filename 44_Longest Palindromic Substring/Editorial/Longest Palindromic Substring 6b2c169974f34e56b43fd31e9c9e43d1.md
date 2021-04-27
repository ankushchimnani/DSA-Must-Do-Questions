### Longest Palindromic Substring

### Difficulty : Medium

### Pre-requisite : Recursion, DP, Loops
---
### Hint :

- For any string to be a palindrome , From the mid character the left side should be equal to right side.

### Short Explanation :

- For each character in the given string, consider the mid-point of the palindrome
- Expand it in both directions to find the maximum length palindrome.
- For an even length palindrome, consider every adjacent pair of characters as the mid-point.

### Detail Explanation

### Approach 1 : Brute Force

**Objective**

Given a string s, find the longest palindromic substring in s.

**For Example :** 

- For input **"babad"**, Output would be **"bab"**
- For input **"banana"**, Output would be **"anana"**

### Algorithm

1. Loop Over the string and get indexes for all the possible substring.
2. Check If each substring is a palindrome.
3. Store the longest palindrome.

### Time Complexity

1. Assume n is the length of the input string.
2. Total Substrings = nC2 = n(n-1)/2
3. Verifying each substring to check weather the string is palindrome or not will takes O(n).

**The Run Time Complexity is O(n^3)**

- Because there will be 3 loops, The Outer 2 loops will pick all substrings and the inner loop will check weather the substring is palindrome or not

### Space Complexity

No Extra Space is required

Thus , The Space complexity is `O(1)`

## Approach 2 : Dynamic Programming

1. To improve, We have to avoid the unnecessary re-computation.

**How we can avoid the unnecessary re-computation ?**

- Let's consider the case "ababa"

If we knew that "bab" is a palindrome 

Then, It is obvious that "ababa" must be a palindrome since two left and end letters are same.

### Recurrence Relation

We define L(i, j) as

![Longest%20Palindromic%20Substring%206b2c169974f34e56b43fd31e9c9e43d1/LPS.jpg](Longest%20Palindromic%20Substring%206b2c169974f34e56b43fd31e9c9e43d1/LPS.jpg)

**Thus our Recurrence Relation is :**

![Longest%20Palindromic%20Substring%206b2c169974f34e56b43fd31e9c9e43d1/Recurrence_relation.jpg](Longest%20Palindromic%20Substring%206b2c169974f34e56b43fd31e9c9e43d1/Recurrence_relation.jpg)

**The base cases are :**

![Longest%20Palindromic%20Substring%206b2c169974f34e56b43fd31e9c9e43d1/base_case.jpg](Longest%20Palindromic%20Substring%206b2c169974f34e56b43fd31e9c9e43d1/base_case.jpg)

### Time Complexity

- The run time complexity is `O(n^2)`

### Space Complexity

- The Space Complexity is `O(n^2)` To Store the table

## Approach 3 : Expand Around Centre

### Approach

1. Since a palindrome mirrors around its centre.
2. A palindrome can be expanded from its center, and there are only 2n-1 centers
3. We will going to expand the string from every center point and we will keep track of largest length Palindromic substring

### Psuedo-Code

**for i = 0 to String.length :**

**length1 = expandAroundCentre( str, i, i )**

**length2 = expandAroundCentre( str, i, i+1 )**

**Max_Length = Max( length1, length2)**

**Max_length = Max( Max_length, Prev_Length)**

### Time Complexity

1. **The Run Time Complexity is : O(n^2)** 

    For each centers , Expanding a string around its center will take O(n) time.

    Thus, Overall Time Complexity : `O(n^2)`

### Space Complexity

`O(1)`, no extra space required.

