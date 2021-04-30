### **Matrix Rotation - Editorial**
### **Difficulty: Medium**
### **Prerequisite: 2-Dimensional Arrays**
---
### **Hint**:
Visualizing the 2D in the form of squares, and hence rotating them appropriately would help.

### **Short Explanation**:
In this question, we have been asked to rotate a given square matrix, by 90 degrees, in anti-clockwise direction. A solution that requires extra space is trivial, but we need to do the rotation in-place. The 2D array, can be visualized in the form of squares, and each square is rotated simultaneously. It can be observed, that a matrix of dimension N X N, will have N/2 squares.

### **Detailed Explanation**:
In this question, we are expected to rotate the square matrix, in anticlockwise direction by 90 degrees. A solution that requires extra space is trivial, and basically involves, converting the last column into the first row, the second last column into the second row, and so on.
A solution that requires no extra space can be thought of, by viusalizing the matrix in the form of squares, and rotating the matrix simulataneously. A matrix of dimension N X N, will have N/2(floor value)squares. 
For example, if the given matrix is 

	   1 2 3
	   4 5 6 
	   7 8 9

The first cycle, consists of elements `1 2 3 6 9 8 7 4` , and after moving them in anticlockwise direction, the matrix becomes. 

	  3 6 9
	  2 5 8
	  1 4 7



### *Pseudo Code*
```python

	function rotateMatrix(int[][] matrix)
	int n = matrix.length
	for (int i=0;i<n/2;i++)
		for (int j=i;j<n-i-1;j++)
			int temp = matrix[i][j]
			matrix[i][j] = matrix[j][n-i-1]
			matrix[j][n-i-1] = matrix[n-i-1][n-j-1]
			matrix[n-i-1][n-j-1] = matrix[n-j-1][i];
			matrix[n-j-1][i] = temp
	return matrix

```
### Time Complexity:

`O(n*n)` where n is the size of the matrix, as a single traversal of the matrix is needed.

### Space Complexity:

`O(1)`, no extra space required.

## Alternate Solution:
A solution that requires extra space has been mentioned in the detailed explanation
