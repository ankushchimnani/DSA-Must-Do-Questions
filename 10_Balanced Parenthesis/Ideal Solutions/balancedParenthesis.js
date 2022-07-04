/* Given a string S having N characters. Any of the characters of the string are either of '(', '{', '[', ')', '}', ']'. Check whether the pairs and the orders of '{', '}', '(', ')', '[', ']' are correct or not.
 */
const balancedParenthesis = (str) => {
  const stack = [];
  for (let curr of str) {
    const top = stack[stack.length - 1];
    if (top === "(" && curr === ")") {
      stack.pop();
    } else if (top === "[" && curr === "]") {
      stack.pop();
    } else if (top === "{" && curr === "}") {
      stack.pop();
    } else {
      stack.push(curr);
    }
  }
  return stack.length === 0;
};

console.log(balancedParenthesis("[()]{}".split("")));
