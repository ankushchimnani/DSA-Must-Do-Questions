/*  
Infix Expression- 
Operators are written in-between their operands. This is the usual way we write expressions.
example : a + b * c + d

Postfix Expression- If the operator appears in the expression after the operands.
example : abc * + d+ 

*/

const isalnum = (value) => {
  const regex = /^[a-zA-Z0-9]+$/;
  return value.match(regex) ? true : false;
};

const priority = (char) => {
  if (char == "^") return 3;
  else if (char == "/" || char == "*") return 2;
  else if (char == "+" || char == "-") return 1;
  else return -1;
};

function infixPostfix(s) {
  let st = []; 
  let result = "";

  for (let i = 0; i < s.length; i++) {
    let c = s[i];
    if (isalnum(c)) result += c;
    else if (c == "(") st.push("(");
    else if (c == ")") {
      while (st[st.length - 1] != "(") {
        result += st[st.length - 1];
        st.pop();
      }
      st.pop();
    } else {
      while (st.length != 0 && priority(s[i]) <= priority(st[st.length - 1])) {
        result += st[st.length - 1];
        st.pop();
      }
      st.push(c);
    }
  }

  while (st.length != 0) {
    result += st[st.length - 1];
    st.pop();
  }

  return result;
}
console.log(infixPostfix("a+b-c+d*(e-f)/g+(h*(i/j))".split("")));
