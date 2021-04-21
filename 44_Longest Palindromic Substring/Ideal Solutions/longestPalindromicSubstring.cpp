#include <bits/stdc++.h>
using namespace std;

void longestPalindromicSubstring(string str) {
    // Function to calculate longest palindromic substring
    int maxLength = 1;
    int start = 0;
    int len = str.length();
    int low, high;
    for (int i = 1; i < len; ++i) {
        low = i - 1;
        high = i;
        while (low >= 0 && high < len && str[low] == str[high]) {
            if (high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }
            low--;
            high++;
        }
        low = i - 1;
        high = i + 1;
        while (low >= 0 && high < len && str[low] == str[high]) {
            if (high - low + 1 > maxLength) {
                start = low;
                maxLength = high - low + 1;
            }
            low--;
            high++;
        }
    }
    // maxLength is the length of the longest palindromic substring

    // Printing the longest palindromic substring
    for (int i = start; i <= start + maxLength - 1; i++)
        cout << str[i];
    cout << endl;
}
int main() {
    int N = 11; // Size of the String
    string str = "xyzasisayzx";
    longestPalindromicSubstring(str);
    return 0;
}