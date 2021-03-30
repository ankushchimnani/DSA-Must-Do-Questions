# Infix to postfix - Editorial

### Difficulty:  Medium

### Prerequisite:  Stacks.

### Hint

Expression of the type AB+ ( Operand Opearand Operator ) is known as a postfix expression. 

### Short Explanation

* Scanning the infix expression from left to right. Whenever there is an operand, add them to the postfix expression. For the operators and parentheses, push them into the stack maintaining the precedence order.

### Detailed Explanation

* Let I be the infix expression and let S be the stack. Let P be the postfix expression initially empty.
* Start scanning the infix expression I from left to right.
 
* If the scanned character is an operand, push it to P.
 
* Else if the scanned character is an operator then,
       
       If stack S is empty or top of S is contains a parenthesis or the precedence of the scanned operator is greater than the operator at top of stack S, push the operator into the stack S.
       
       Else, pop all the operators from stack S till all these conditions satisfy:
             1. Stack S is not empty.
             2. Top of stack S is not a parenthesis.
             3. Top operator of the stack S is greater than or equal to the precedence of the sacanned operator.
       
      Afterwards push the scanned character into S.

       Push all the operators into P in the order they are popped from stack S.

* Else if the scanned character is an opening bracket, push it to the stack. 
* Else if the scanned character is a closing bracket, pop the stack until an opening bracket is encountered.
  Push all the operators into P in the order they are popped from stack S. 

* When the entire infix expression is scanned, pop the stack until it is not empty. Push all the operators into P in the order they are popped from Stack S.
 
  At the end P contains the required postfix expression.

* Example -
 
  Let infix expression I = a+b-c+d*(e-f)/g+(h*(i/j)).
  
  Let S be the stack required and P be the postfix expression.  ab+c-def-*g/+hij/*+

  Scanning I left to right:

  First character : a -> S = { }, P = a
  
  Next character : + -> S = { + }, P = a.
  
  Next character : b -> S = { + }, P = ab.
  
  Next character : - -> S = { - }, P = ab+.
  
  Next character : c -> S = { - }, P = ab+c.
  
  Next character : + -> S = { + }, P = ab+c-.
  
  Next character : d -> S = { + }, P = ab+c-d.
  
  Next character : * -> S = { +* }, P = ab+c-d.
  
  Next character : ( -> S = { +*( }, P = ab+c-d.
  
  Next character : e -> S = { +*( }, P = ab+c-de.
  
  Next character : - -> S = { +*(- }, P = ab+c-de.
  
  Next character : f -> S = { +*(- }, P = ab+c-def.
  
  Next character : ) -> S = { +* }, P = ab+c-def-.
  
  Next character : / -> S = { +/ }, P = ab+c-def-*.
  
  Next character : g -> S = { +/ }, P = ab+c-def-*g.
  
  Next character : + -> S = { + }, P = ab+c-def-*g/+.
  
  Next character : ( -> S = { +( }, P = ab+c-def-*g/+.
  
  Next character : h -> S = { +( }, P = ab+c-def-*g/+h.
  
  Next character : * -> S = { +(* }, P = ab+c-def-*g/+h.
  
  Next character : ( -> S = { +(*( }, P = ab+c-def-*g/+h.
  
  Next character : i -> S = { +(*( }, P = ab+c-def-*g/+hi.
  
  Next character : / -> S = { +(*(/ }, P = ab+c-def-*g/+hi.
  
  Next character : j -> S = { +(*(/ }, P = ab+c-def-*g/+hij.
  
  Next character : ) -> S = { +(* }, P = ab+c-def-*g/+hij/.
  
  Next character : ) -> S = { + }, P = ab+c-def-*g/+hij/*.
  
  Pop all from stack hence P = P = ab+c-def-*g/+hij/*+.
  
  

### Time Complexity:

`O(N)`, where N is the length of infix expression.

All characters can get push and popped from stack at most once.

### Space Complexity:

`O(N)`, where N is the length of infix expression.

Maximum number of characters inside is stack is N.

### Alternate Solution:

None
