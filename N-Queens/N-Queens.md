## **N-Queens**
The n-queens puzzle is the problem of placing n queens on an n x n chessboard such that no two queens attack each other.

__Note__: Given an integer n, output an arrangement if it's possible to place n queens under the given condition, else output "Not Possible"

#### **Sample Input**
    N = 4

#### **Sample Output**
    { 0,  1,  0,  0}
    { 0,  0,  0,  1}
    { 1,  0,  0,  0}
    { 0,  0,  1,  0}

#### **Sample Explanation**
    1 -> Represents Queen at that place
    0 -> Empty Cell
    No two Queens attack each other in this arrangement

#### **Expected Time Complexity**
__O__(N!), where N*N is the size of the board
#### **Expected Space Complexity**
__O__(N), where N*N is the size of the board

#### **Constraints**
	1 <= N <= 9