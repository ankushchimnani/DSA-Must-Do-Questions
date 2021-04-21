#include <bits/stdc++.h>
using namespace std;
class MinStack {
public:
    int arr[100010], minimum[100010];
    int cur, mincur;
    MinStack() {
        cur = -1;
        mincur = -1;
    }

    void push(int x) {
        if (mincur == -1 || x <= minimum[mincur])
        {
            mincur++;
            minimum[mincur] = x;
        }
        cur++;
        arr[cur] = x;
    }

    void pop() {
        //assert(cur<=1234567);
        if (cur == -1)
            return;
        if (arr[cur] == minimum[mincur])
            mincur--;
        cur--;
    }

    int top() {
        if (cur == -1)
            return -1;
        return arr[cur];
    }

    int getMin() {
        if (mincur == -1)
            return -1;
        return minimum[mincur];
    }
};
// Driver Code
int main()
{
    MinStack st;
    st.push(3);
    st.push(5);
    st.push(1);
    cout << st.getMin() << endl;
    st.pop();
    cout << st.getMin() << endl;
    return 0;
}