OPERATORS = ['+', '-', '*', '/', '(', ')', '^']
PRIORITY = {'+': 1, '-': 1, '*': 2, '/': 2, '^': 3}

# Convert Infix Expression to Postfix Expression
def infixPostfix(expression):
    stack = []
    result = ''

    for ch in expression:
        if ch not in OPERATORS:
            result += ch
        elif ch == '(':
            stack.append('(')
        elif ch == ')':
            while stack and stack[-1] != '(':
                result += stack.pop()
        else:
            while stack and stack[-1] != '(' and PRIORITY[ch] <= PRIORITY[stack[-1]]:
                result += stack.pop()
            stack.append(ch)

    while stack:
        result += stack.pop()

    return result


if __name__ == "__main__":

    # Input
    array = [1, 2, 1, 3, 5, 6, 4]
    N = 10
    M = 6

    expression = "a+b-c+d*(e-f)/g+(h*(i/j))"
    print(infixPostfix(expression))
