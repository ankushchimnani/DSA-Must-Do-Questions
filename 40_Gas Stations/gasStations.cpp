#include <bits/stdc++.h>
using namespace std;
int gasStations(int gas[], int cost[], int n) {
    // Function to find the index of the starting gas station around the circuit once
    int totalDiff = 0, diff = 0;
    int index = 0;
    for (int i = 0; i < n; i++) {
        diff += gas[i] - cost[i];
        totalDiff += gas[i] - cost[i];
        if (diff < 0) {
            diff = 0;
            index = i + 1;
        }
    }
    if ((totalDiff >= 0))
        return index;
    else
        return -1;
}
int main() {
    int n = 5; // Size of the array
    int gas[] = {1, 2, 3, 4, 5};    //  Amount of gas on ith station
    int cost[] = {3, 4, 5, 1, 2};   //  Cost to travel from ith to (i+1)th station
    cout << gasStations(gas, cost, n) << endl;
    return 0;
}