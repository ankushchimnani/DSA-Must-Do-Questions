# Rotate the matrix in anti-clockwise direction by 90 degree.
def matrixRotation(matrix):

    if matrix is None: return None
    if len(matrix) == 1: return matrix

    n = len(matrix)

    # Transpose the matrix
    for i in range(n):
        for j in range(i):
            matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]

    # Swapping the rows
    for i in range(n // 2):
        for j in range(n):
            matrix[i][j], matrix[n-i-1][j] = matrix[n-i-1][j], matrix[i][j]

    return matrix


if __name__ == "__main__":

    # Input
    matrix = [[1,2,3],[4,5,6],[7,8,9]]

    print(matrixRotation(matrix))