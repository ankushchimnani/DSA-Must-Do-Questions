### **Infix Postfix - Editorial**
### **Difficulty**: Medium
### **Prerequisite: Stacks**
---
### **Hint:**
Infix Expressions are of the type `a + b`, whereas, postfix expressions are of the type, `ab+`. A stack can be used to convert infix expressions to postfix expressions.

### **Short Explanation**
* Infix expression:The expression of the form a op b. When an operator is in-between every pair of operands.
* Postfix expression:The expression of the form a b op. When an operator is followed for every pair of operands.
* The compiler scans the expression either from left to right or from right to left. Consider the below expression: 
				a op1 b op2 c op3 d 
* If op1 = +, op2 = * , op3 = +,the compiler first scans the expression to evaluate the expression b * c, then again scan the expression to add a to it. The result is then added to d after another scan.The repeated scanning makes it very in-efficient. It is better to convert the expression to postfix(or prefix) form before evaluation.


### **Detailed Explanation**:
Infix Expression- Operators are written in-between their operands. This is the usual way we write expressions.
Example- a+b-c
Postfix Expression- If the operator appears in the expression after the operands.
Example- Postfix of the above expression would be ab+c-
The compiler scans the expression either from left to right or from right to left.
Consider the below expression: a + b * c + d
The compiler first scans the expression to evaluate the expression b * c, then again scan the expression to add a to it. The result is then added to d after another scan.
The repeated scanning makes it very in-efficient. It is better to convert the expression to postfix(or prefix) form before evaluation.
The postfix expression of this would be - abc * +d+
This expression is much easy to evaluate than its infix counterpart.
An important point to note here is Brackets too can be used in the input and postfix notation doesn't have brackets.
* Infix expression:The expression of the form a op b. When an operator is in-between every pair of operands.
* Postfix expression:The expression of the form a b op. When an operator is followed for every pair of operands.
* The compiler scans the expression either from left to right or from right to left. Consider the below expression: 
				a op1 b op2 c op3 d 
* If op1 = +, op2 = * , op3 = +,the compiler first scans the expression to evaluate the expression b * c, then again scan the expression to add a to it. The result is then added to d after another scan.The repeated scanning makes it very in-efficient. It is better to convert the expression to postfix(or prefix) form before evaluation.

The following steps give the method to convert infix expressions to postfix expressions, with the help of a stack.

Steps

	1. Scan the infix expression from left to right. 
	2. If the scanned character is an operand, output it. 
	3. Else, 
	      1 If the precedence of the scanned operator is greater than the precedence of the operator in the stack(or the stack is empty  or the stack contains a ‘(‘ ), push it. 
	      2 Else, Pop all the operators from the stack which are greater than or equal to in precedence than that of the scanned operator. After doing that Push the scanned operator to the stack. (If you encounter parenthesis while popping then stop there and push the scanned operator in the stack.) 
	4. If the scanned character is an ‘(‘, push it to the stack. 
	5. If the scanned character is an ‘)’, pop the stack and and output it until a ‘(‘ is encountered, and discard both the parenthesis. 
	6. Repeat steps 2-6 until infix expression is scanned. 
	7. Print the output 
	8. Pop and output from the stack until it is not empty.

### *Algorithm*
	1. Scan the entire expression left to right. 
	2. If the character is an operand, add it to the final postfix expression, as the relative ordering of the operands is same in postfix and infix expression.
	3. If the character is an opening bracket, put it in the stack. 
	4. If the character is a closing bracket, pop all the elements from the stack, until an opening bracket is met. If the opening bracket is not met, and the stack becomes empty, then the given infix expression is invalid. Brackets in postfix expressions are superfluous, therefore, pop out the bracket, without adding it into the postfix expression.
	5. If the character is an operator, pop out all the operators, until the stack becomes empty, or the character at the top of the stack has a lower priority than the current character. 
	6. After the entire expression is scanned, pop off all the elements from the stack, until the stack becomes empty, and add it to the final postfix expression. 
	7. Finally, print the postfix expression. 
	Priority Order -> (^) > (*,/) > (+,-).
	Operators at the same level have same priority. 
	Brackets free the expression off the priorities, which the algorithm ensures is taken care of. 


### **Time Complexity**:
Time Complexity = `O(n^2)`
### **Space Complexity**:
Space Complexity = `O(n)`

### **Alternate Solution**:
None.
