### Meeting rooms - Editorial

### Difficulty: Easy

### Prerequisite:  Greedy, Sorting.
---
### Hint

Check for rooms with overlapping intervals. 

### Short Explanation

* Check whether any two meeting intervals overlap or not. If they, the answer is false. Else, the answer is true.

### Detailed Explanation

* Let intervals be an array of size N. For all i, ( 1 <= i <= N )  intervals[i] contains a tuple : [starti, endi], denoting the start and end time of the ith meeting.

* Observation:

  1. Two distinct meetings i and j ( 1 <= i,j <= N ) are said to overlap if:
     start[i]<end[j] or, start[j] < end[i].  

  2. If two distinct meetings i and j ( 1 <= i,j <= N ) overlap, both can't be attended together.

* One simple way to solve the probem is to check for each pair of meeting, whether any pair overlaps or not. If any pair of meeting does, the answer is false. Else, it is true.
  This leads to a time complexity of O( N*N ), which is not desirable.

* How can we solve it in a better way?

  Consider three distinct meetings i, j and, k ( 1 <= i,j,k <= N ). Let s1, s2, s3 be the start times of meetings i, j and, k respectively. Similarly let e1, e2 and, e3 be the end times of meetings i, j and, k respectively.
  Let,
  s1 < e1 <= s2 < e2 <= s3 < e3.
  
  As per the above conditions, since interval of meeting j doesn't overlap with interval of meeting i, hence, it is obvious that interval of meeting k doesn't overlap with interval of meeting i.
 
  Hence, sorting the entire intervals array with non-decreasing order of start time will lead to the above condition. Now it is sufficient to check the overlapping condition for all the consecutive pairs of meetings. 
  
  If any pair overlaps, the answer is false. Else, it is true.


* Pseudo code:
  
  ```python
  intervals[N] // intervals array of N meetings
  
  sort( intervals, intervals + N ); // sorting the array in non decreasing order of meeting's start time
   
  flag = 0;
 
  for( i from 1 to N - 1 ){
  
    if( intervals[i][1] > intervals[i+1][0] ){
    
      flag = 1;
      break;
    }

   if( flag == 1 )
   
      print("false");

   else
   
      print("true");
  ```
* Example -
  ```python
  intervals = [ [0,30], [5,10], [15,20] ].
  
  After sorting based on starting values it becomes : [ [0,30], [5,10], [15,20] ].

  Iteration 1: end[1] = 30 and start[2] = 5. Since 30>5, it i impossible to attend both the meetings together.

  Hence the answer is false.
  ```
### Time Complexity:

`O(Nlog(N))`.

Time required to sort the array.

### Space Complexity:

`O(1)`, No extra space is required.

### Alternate Solution:

None
