#include<bits/stdc++.h>
using namespace std;
int precedence(char c) {
    // Helper Function to determine precedence of each opearator
    if (c == '^')
        return 3;
    else if (c == '*' || c == '/')
        return 2;
    else if (c == '+' || c == '-')
        return 1;
    else
        return -1;
}
void infixPostfix(string s) {
    // Function to convert infix expression to postfix
    stack<char> st;
    st.push('N');
    int len = s.length();
    string ans = "";
    for (int i = 0; i < len; i++) {

        // If the scanned character is an operand, add it to output string.
        if ((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z'))
            ans += s[i];

        // If the scanned character is an ‘(‘, push it to the stack.
        else if (s[i] == '(')
            st.push('(');

        // If the scanned character is an ‘)’, pop and to output string from the stack until an ‘(‘ is encountered.
        else if (s[i] == ')')
        {
            while (st.top() != 'N' && st.top() != '(')
            {
                char c = st.top();
                st.pop();
                ans += c;
            }
            if (st.top() == '(')
            {
                char c = st.top();
                st.pop();
            }
        }

        //If an operator is scanned
        else {
            while (st.top() != 'N' && precedence(s[i]) <= precedence(st.top())) {
                char c = st.top();
                st.pop();
                ans += c;
            }
            st.push(s[i]);
        }
    }
    // Pop all the remaining elements from the stack
    while (st.top() != 'N') {
        char c = st.top();
        st.pop();
        ans += c;
    }

    cout << ans << endl;

}
int main() {
    string str = "a+b-c+d*(e-f)/g+(h*(i/j))";
    infixPostfix(str);
    return 0;
}