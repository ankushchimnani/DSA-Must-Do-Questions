
### Infix to postfix - Editorial

### Difficulty:  Medium

### Prerequisite:  Stacks.
---
### Hint

Expression of the type AB+ ( Operand Opearand Operator ) is known as a postfix expression. 

### Short Explanation

* Scanning the infix expression from left to right. Whenever there is an operand, add them to the postfix expression. For the operators and parentheses, push them into the stack maintaining the precedence order.

### Detailed Explanation

* Let I be the infix expression and let S be the stack. Let P be the postfix expression initially empty.
* Start scanning the infix expression I from left to right.
 
* If the scanned character is an operand, push it to P.
 
* Else if the scanned character is an operator then,
       
       If stack S is empty or top of S is contains a parenthesis or the precedence of the scanned operator is greater than the operator at top of stack S, push the operator into        the stack S.
       
       Else, pop all the operators from stack S till all these conditions satisfy:
             1. Stack S is not empty.
             2. Top of stack S is not a parenthesis.
             3. Top operator of the stack S is greater than or equal to the precedence of the sacanned operator.
       
       Afterwards push the scanned character into S.

       Push all the operators into P in the order they are popped from stack S.

* Else if the scanned character is an opening bracket, push it to the stack. 
* Else if the scanned character is a closing bracket, pop the stack until an opening bracket is encountered.
* 
  Push all the operators into P in the order they are popped from stack S. 

* When the entire infix expression is scanned, pop the stack until it is not empty. Push all the operators into P in the order they are popped from Stack S.
 
  At the end P contains the required postfix expression.

* Example -
  ```python
  Let infix expression I = A+B*C/(E-F)
  
  Let S be the stack required and P be the postfix expression.

  Scanning I left to right:

  First character : A -> S = { }, P = A
  
  Next character : + -> S = { + }, P = A.
  
  Next character : B -> S = { + }, P = AB.
  
  Next character : * -> S = { +* }, P = AB.
  
  Next character : C -> S = { +* }, P = ABC.
  
  Next character : / -> S = { +/ }, P = ABC*.
  
  Next character : ( -> S = { +/( }, P = ABC*.
  
  Next character : E -> S = { +/( }, P = ABC*E.
  
  Next character : - -> S = { +/(- }, P = ABC*E.
  
  Next character : F -> S = { +/(- }, P = ABC*EF.
  
  Next character : ) -> S = { +/ }, P = ABC*EF-.
  
  Pop all from stack hence P = ABC*EF-/+
  ```
  

### Time Complexity:

`O(N)`, where N is the length of infix expression.

All characters can get push and popped from stack at most once.

### Space Complexity:

`O(M)`, where M is the number of operators in Infix expression.


### Alternate Solution:
None
