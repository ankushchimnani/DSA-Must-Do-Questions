### N-Queens - Editorial

### Difficulty:  Medium

### Prerequisite:  Recursion, Backtracking
---
### Hint

Place queens one by one in different columns and check for the possibility of attack on another queen.

### Short Explanation

* The idea is to place queens one by one in different columns, starting from the leftmost column. When we place a queen in a column, we check for attack chances with already placed queens. In the current column, if we find a row for which there is no attack chance, we mark this row and column as part of the solution. If we do not find such a row due to attacks then we backtrack and return false.

### Detailed Explanation

* So initially we are having NxN unattacked cells where we need to place N queens. Let's place the first queen at a cell (i,j), so now the number of unattacked cells is reduced, and number of queens to be placed is N-1. Place the next queen at some unattacked cell. This again reduces the number of unattacked cells and number of queens to be placed becomes N-2. Continue doing this, as long as following conditions hold.

    1. The number of unattacked cells is not 0.
    2. The number of queens to be placed is not 0.

* If the number of queens to be placed becomes 0, then it's over, we found a solution. But if the number of un-attacked cells become 0, then we need to backtrack, i.e. remove the last placed queen from its current cell, and place it at some other cell. We do this recursively.

### Time Complexity:

`O(2^N)`, where `N` is the number of Queens to be placed

### Space Complexity:

`O(N*N)`, where `N` is the number of Queens to be placed

### Alternate Solution:

Check for all the possibility instead of backtracking but it will take more time and memory
