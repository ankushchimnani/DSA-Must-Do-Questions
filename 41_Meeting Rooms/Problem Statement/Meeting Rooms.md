## **Meeting Rooms**
Given an array of meeting time intervals where intervals[i] = [starti, endi], determine if a person could attend all meetings.


#### **Sample Input**
    intervals = [ [0,30], [5,10], [15,20] ]

#### **Sample Output**
    false

#### **Sample Explanation**
    Two or more meetings are overlapping, so the person cannot attend all the meetings.

#### **Expected Time Complexity**
__O__(N*logN), where N is the length of the intervals array
#### **Expected Space Complexity**
__O__(1), constant space solution

#### **Constraints**
    0 <= intervals.length <= 10^4
    intervals[i].length == 2
    0 <= starti < endi <= 10^6

