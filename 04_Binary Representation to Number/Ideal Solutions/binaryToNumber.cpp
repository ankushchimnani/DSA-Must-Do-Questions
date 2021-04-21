#include <bits/stdc++.h>
using namespace std;

int binaryToNumber(string str)
{
    // Function to convert binary to decimal
    int  number = 0, base = 1, len = str.length();
    for (int i = len - 1; i >= 0; i--) {
        if (str[i] == '1')
            number += base;
        base = base * 2;
    }
    return number;
}

int main() {
    string num = "00000000000000000000000000000111"; // Binary Representation of a Number
    cout << binaryToNumber(num) << endl;
}
