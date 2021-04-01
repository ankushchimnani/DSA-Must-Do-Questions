### **Anagram Detector! - Editorial**
### **Difficulty**: Low
### **Prerequisite: Strings,Sorting**
	---

### **Hint:**
Anagrams is a word, phrase, or name formed by rearranging the letters of another, such as spar, formed from rasp.

### **Short Explaination**
Anagrams are a pair of strings such that one of them can be converted to another by rearranging the letters of the original string. Since, neither adding of characters, or removal of characters is allowed, both the strings should have the same amount of characters, and that too in the same amount.

### **Detailed Explanation**:
We are given two strings, and we have to check if the two strings are anagrams of each other or not. The most intuitive way to check if the two strings are anagrams of each other is to rearrange the two strings into their sorted form of characters, and then check if the two strings are equal or not. If the two strings are equal, they are said to be anagrams of each other, otherwise not. For this question care must be taken, that the only the characters are taken into the consideration, and not the empty spaces.

For Example, if the given strings are "naman" and "manan", after sorting the two strings in lexicographic order, the two strings become "aamnn". As both of them become equal after sorting, they can be termed as Anagrams of each other. 


### **Pseudo Code**
		* String a //input string 
		* String b //input string
		* String a_sorted = Sort(a) //string after removing spaces and sorting the characters
		* String b_sorted = Sort(a) //string after removing spaces and sorting the characters
		* if (a_sorted == b_sorted) return "true"
		* else return "false"
	 

### **Time Complexity**:
In the best case, sorting requires __`O(NlogN)`__, where N is the number of characters in the string. Therefore, the time complexity will be __`O(NlogN)`__.

### **Space Complexity**:
No extra space will be required, only spaces will be removed from the original strings. Therefore, the space complexity will be __`O(1)`__.

### **Alternate Solution**:
Instead of using sorting, we can use arrays/Key-Value Pairs to compare the frequency of characters in both the strings.