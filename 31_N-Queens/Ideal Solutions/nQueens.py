
# N-Queens Problem

def isSafe(row, column, board, size):
    # CHECKING ROW/COLUMN
    for k in range(0, size):
        if board[row][k] == 1 or board[k][column] == 1:
            return False

    # CHECKING DIAGONALS
    for r in range(0, size):
        for c in range(0, size):
            if (r + c == row + column) or (r - c == row - column):
                if board[r][c] == 1:
                    return False
    return True



def nQueens(board, size, row ):
    # Base Case
    if row == size: return True

    # CHECKING FOR EACH ROW/COLUMN of Board
    for column in range(0, 4):
        if isSafe(row, column, board, size) and board[row][column] != 1:

            # Putting Queen at row, column
            board[row][column] = 1
            if nQueens(board, size, row+1): return True
            # Removing Queen from row, column
            board[row][column] = 0

    return False


if __name__ == "__main__":

    # Static Input
    N = 4
    board = [[0] * N for _ in range(N)]

    nQueens(board, N, 0)

    # Print the cell values of the board
    for i in board:
        print(i)


