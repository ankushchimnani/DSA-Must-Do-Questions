### **Detect Palindrome- Editorial**
### **Difficulty**: Low
### **Prerequisite: Implementation,Strings,Two Pointer**
---

### **Hint:**
A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam, racecar.  

### **Short Explaination**
In this question, we have to find if a given string is a palindrome, that is if the strings are the same, read forwards or backwards. To do this we can generate the strings, with the order reversed. If the two strings are same, then we can say that the string is a palindrome, otherwise not. 

### **Detailed Explanation**:
A palindrome is a word,phrase, or other sequence of characters which reads the same backward as forward, such as madam, racecar. In this question, we have to check if the string is palindrome or not. A string can be said to be a palindrome, if it is the same if the order of its characters is reversed. Therefore, a string with order of characters reversed must be generated, and checked for equality with the original string. If the two strings are equal, then the string is said to be a palindrome, else not.
Another method, involved the use of two pointers, where one pointers explore the string from the end, while other explores the string from the beginning, until they meet. If, at any point the character at a particular position from the end and the start are not same, then the string is said to be not a palindrome, else it is said to be a palindrome.

### **Pseudo Code**
```python

function checkPalindrome(String str)
	left = 0 
	right = str.length()-1;
	while(left <= right)
		if (str.charAt(left) != str.charAt(right)) return false
		left++
		right--
	return true


```
### **Time Complexity**:
The time complexity will be `O(N)`, where N is the length of the string.

### **Space Complexity**:
No extra space is required. Therefore, the space complexity will be `O(1)`.

### **Alternate Solution**:
Already mentioned in the detailed solution.
