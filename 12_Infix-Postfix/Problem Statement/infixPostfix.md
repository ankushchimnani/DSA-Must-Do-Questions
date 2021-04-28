## **Infix Postfix**
Infix Expression- Operators are written in-between their operands. This is the usual way we write expressions.

Example- a+b-c

Postfix Expression- If the operator appears in the expression after the operands.

Example- Postfix of the above expression would be ab+c-

The compiler scans the expression either from left to right or from right to left.

Consider the below expression: a + b * c + d

The compiler first scans the expression to evaluate the expression b * c, then again scan the expression to add a to it. The result is then added to d after another scan.

The repeated scanning makes it very in-efficient. It is better to convert the expression to postfix(or prefix) form before evaluation.

The postfix expression of this would be- abc * + d+ 

This expression is much easy to evaluate than its infix counterpart.

**Remember** Brackets too can be used in the input and postfix notation doesn't have brackets.




#### **Sample Input**
	a+b-c+d*(e-f)/g+(h*(i/j))

	

#### **Sample Output**
	ab+c-def-*g/+hij/*+

#### **Sample Explanation**
The postfix expression for the expression given in the sample input is given by the ouptut.

#### **Expected Time Complexity**
__O__(N^2), where N is the size of the expression.

#### **Expected Space Complexity**
__O__(M), where M is the number of operators in string. 

#### **Constraints**
	  Number of operands <= 26
