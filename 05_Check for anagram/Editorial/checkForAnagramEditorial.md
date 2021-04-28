### **Check for Anagram! - Editorial**

### **Difficulty**: Low

### **Prerequisite: Strings,Sorting**
---

### **Hint:**
Anagrams is a word, phrase, or name formed by rearranging the letters of another, such as spar, formed from rasp.

### **Short Explaination**
Anagrams are a pair of strings such that one of them can be converted to another by rearranging the letters of the original string. Since, neither adding of characters, or removal of characters is allowed, both the strings should have the same characters, and that too in the same amount.

### **Detailed Explanation**:
We are given two strings, and we have to check if the two strings are anagrams of each other or not. The most intuitive way to check if the two strings are anagrams of each other is to rearrange the two strings into their sorted form of characters, and then check if the two strings are equal or not. If the two strings are equal, they are said to be anagrams of each other, otherwise not. For this question care must be taken, that the only the characters are taken into the consideration, and not the empty spaces.

For Example, given a string A = "naman" and a string B = "manan". After sorting the string A becomes A = "aamnn", and the string B = "aamnn". After comparing the corresponding indices, it can be seen that the two strings A and B, after sorting become equal. Therefore, the strings A and B, are said to be Anagrams of each other. 


### **Pseudo Code**
```python
	String a //input string 
	String b //input string
	String a_sorted = Sort(a) //string after removing spaces and sorting the characters
	String b_sorted = Sort(a) //string after removing spaces and sorting the characters
	if (a_sorted == b_sorted) return "true"
        else return "false"
	 
```
### **Time Complexity**:
In the best case, sorting requires __`O(NlogN)`__, where N is the number of characters in the string. Therefore, the time complexity will be __`O(NlogN)`__.

### **Space Complexity**:

`O(1)`, No extra space will be required.

### **Alternate Solution**:
Instead of using sorting, we can use arrays/Key-Value Pairs to compare the frequency of characters in both the strings.
