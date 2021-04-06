
# Checking whether the brackets string is balanced or not
def balancedParanthesis(S):
    openingBrackets = ['(', '[', '{']
    stack = []

    # Inserting All Opening Brackets in stack
    for bracket in S:
        if bracket in openingBrackets:
            stack.append(bracket)

        else:
            # If Stack is empty then return false
            if not len(stack): return False

            # Popping out corresponding opening brackets from stack
            if bracket == ')' and stack[-1] == '(':
                stack.pop()
            elif bracket == ']' and stack[-1] == '[':
                stack.pop()
            elif bracket == '}' and stack[-1] == '{':
                stack.pop()
            else:
                return False

    # If Stack is empty return false
    return not len(stack)


if __name__ == "__main__":
    array = []

    # 1. Dynamic Input
    # N = int(input("Enter the size of array : "))

    # 2. Static Input
    S = "[()]{}"

    print(balancedParanthesis(S))
