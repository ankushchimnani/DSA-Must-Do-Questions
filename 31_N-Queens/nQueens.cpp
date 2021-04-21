#include<bits/stdc++.h>
using namespace std;

// Number of Queens to be placed
int N;

// Board
int board[100][100];

int isAttack(int i, int j)
{
    // Function to check if the cell is attacked or not

    //checking if there is a queen in row or column
    for (int k = 0; k < N; k++)
    {
        if ((board[i][k] == 1) || (board[k][j] == 1))
            return 1;
    }
    //checking for diagonals
    for (int k = 0; k < N; k++)
    {
        for (int l = 0; l < N; l++)
        {
            if (((k + l) == (i + j)) || ((k - l) == (i - j)))
            {
                if (board[k][l] == 1)
                    return 1;
            }
        }
    }
    return 0;
}

int nQueens(int n)
{
    //if n is 0 Base Case, solution found
    if (n == 0)
        return 1;
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            //checking if we can place a queen here or not, queen will not be placed if the place is being attacked or occupied
            if ((!isAttack(i, j)) && (board[i][j] != 1))
            {
                board[i][j] = 1;
                //recursion wether we can put the next queen with this arrangment or not
                if (nQueens(n - 1) == 1) {
                    return 1;
                }
                board[i][j] = 0;
            }
        }
    }
    return 0;
}

int main()
{
    N = 4;
    //setting all elements to 0
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            board[i][j] = 0;
        }
    }
    //calling the function
    nQueens(N);

    //printing the matix
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
            cout << board[i][j] << " ";
        printf("\n");
    }

}