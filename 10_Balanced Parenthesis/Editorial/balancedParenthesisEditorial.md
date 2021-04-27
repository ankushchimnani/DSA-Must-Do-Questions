### Balanced parenthesis - Editorial

### Difficulty: Easy

### Prerequisite: Stacks.
---
### Hint

'(' will be balanced by ')', '[' by ']' and, '{' by '}'.

### Short Explanation

- For a string to be balanced, if any of the closing brackets ')', ']','}' appears , then it should match the immediate unbalanced opening bracket. Else, the string can never be balanced.

### Detailed Explanation

- Let there be a string S of length N.
- OBSERVATIONS:
    1. If S[x1] = '(' , S[x2] = '[', S[x3] = ']' and, S[x4] = ')' such that 1 <= x1 < x2 <= N then, x2 < x3 < x4 <= N. Similar considerations are to made when string comprises of all 3 brackets.
    2. If S[x1] = '(' , S[x2] = '(' and, S[x3] = ')' such that 1 <= x1 < x2 < x3 <= N then, if S[x2] is already balanced, S[x3] is responsible for balancing S[x1].
- Hence for occurrences of any of the closing brackets ']', '}', '}' the immediate unbalanced opening bracket should be '[','{', or, '(' respectively. Also opening brackets already balanced should not be taken into consideration.
- Hence for each closing bracket S[i], we can check for all opening brackets S[j] ( 1 <= j < i <= N ), such that S[j] is unbalanced. For each S[i], if the first unbalanced bracket S[j] matches ( S[j] = '[' for S[i] = ']' or S[j] = '(' for S[i] = ')' or S[j] = '{' for S[i] = '}' ), the string is said to be balanced. Else, it is not balanced.
This approach leads to a time complexity of O(N*N) which is not desirable.
- Stack based approach:
    1. If any opening bracket ( '(', '{', '[' ) arrives, push it into the stack.
    2. If any closing bracket ( ')', '}', ']' ) arrives, then check whether the closing bracket matches the top of stack or not. If it does, pop out the top of stack and continue analysing the string.
    If it doesn't then the string is not balanced.

    Note - After processing the entire string the stack becomes empty if the string is balanced.

- Pseudo code:

    ```python
    Stack STK;

    String S;

    N; // Size of sting S

    TOP; // TOP of the stack STK

    FLAG = 0;

    for ( i from 0 to N - 1){

      if( S[i] == '(' or S[i] == '{' or S[i] == '[' )

            STK.push(S[i]);

      else{

           if(STK is EMPTY ){

               FLAG = 1;
               break;

           }

           else{

               if( ( S[i] == ')' && STK[TOP] != '(' ) or ( S[i] == '}' && STK[TOP] != '{' ) or ( S[i] == ']' && STK[TOP] != '[' ) ){
                    FLAG = 1;
                    break;
               }

               else
                   STK.pop();
           }

     }
     
     }

    if(FLAG == 1 )

      print("Not balanced")

    else{

      if(STK.empty)

        print("Balanced")

      else

        print("Not Balanced")
    }

    ```

- Example -
    ```python
    1. N = 6, S : [()]{}

        Stack Stk;

        for i = 0, S[0] = '[', push into Stk. Stk = { '[' }

        for i = 1, S[1] = '(', push into Stk. Stk = { '[' , '(' }

        for i = 2, S[2] = ')', Stk[Top] = '(', which matches with S[2], hence pop the top of stack. Stk = { '[' }

        for i = 3, S[3] = ']', Stk[Top] = '[', which matches with S[3], hence pop the top of stack. Stk is empty.

        for i = 4, S[4] = '{', push into stack. Stk = { '{' }

        for i = 5, S[5] = '}', Stk[Top] = '{', which matches with S[5], hence pop the top of stack. Stk is empty.

        After processing the string Stk is empty and out string is balanced.
    ```
    ```python
    2. N = 4, S : [(])

        Stack Stk;

        for i = 0, S[0] = '[', push into Stk. Stk = { '[' }.

        for i = 1, S[1] = '(', push into Stk. Stk = { '[' '(' }.

        for i = 2, S[2] = ']', Stk[Top] = '(', which doesn't matches with S[2], hence flag = 1, break the process.

        Since flag value is 1 the string is not balanced.
    ```
### Time Complexity:

`O(N)`. where N is the length of the string.

Any character of string get pushed or popped at most once into the stack while iterating over the entire string.

### Space Complexity:

`O(N)`, All the N characters of string can reside inside the stack.


### Alternate Solution:

None
