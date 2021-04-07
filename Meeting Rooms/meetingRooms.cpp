#include<bits/stdc++.h>
using namespace std;
bool meetingRooms(vector<vector<int> > intervals)
{
    // Function to find out if it's possible to attend all meetings or not
    int n = intervals.size();
    if(n==0)
        return true;
    sort(intervals.begin(),intervals.end());
    for(int i = 1;i < n;i++) {
        int a = intervals[i-1][1];
        int b = intervals[i][0];
    if(a>b)
        return false;
    }
    return true;
}
int main(){

    // Input of intervals in the form [start,end]
    vector<vector<int> > intervals {
        {0,30},
        {5,10},
        {15,20} };
    bool result = meetingRooms(intervals);
    if(result)
        cout<<"true"<<endl;
    else
        cout<<"false"<<endl;
}