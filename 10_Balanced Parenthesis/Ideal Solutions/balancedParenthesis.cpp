#include <bits/stdc++.h>
using namespace std;
bool balancedParenthesis(string str)
{
    // function to check if the parenthesis are balanced or not
    stack<char> s;
    char c;
    for (int i = 0; i < str.length(); i++)
    {
        if (str[i] == '(' || str[i] == '[' || str[i] == '{')
        {
            //Push the element in the stack as they are opening parenthesis
            s.push(str[i]);
            continue;
        }
        // If it's closing parenthesis and stack is empty then it's not balanced so it returns false
        if (s.empty())
            return false;

        if (str[i] == ')') {
            // Store the top element in c
            c = s.top();
            s.pop();
            if (c == '{' || c == '[')
                return false;
        }
        else if (str[i] == '}') {
            // Store the top element in c
            c = s.top();
            s.pop();
            if (c == '(' || c == '[')
                return false;
        }
        else if (str[i] == ']') {
            // Store the top element in c
            c = s.top();
            s.pop();
            if (c == '(' || c == '{')
                return false;
        }
    }
    return (s.empty());
}
int main() {
    int N = 6; // Length of the parenthesis sequence given
    string str = "[()]{}";

    // Function call
    bool result = balancedParenthesis(str);
    if (result)
        cout << "Yes" << endl;
    else
        cout << "No" << endl;
    return 0;
}