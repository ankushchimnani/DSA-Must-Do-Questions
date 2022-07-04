let mat = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 10, 11, 12],
  [13, 14, 15, 16],
];

function rotateMatrix(N, mat) {
  for (let x = 0; x < N / 2; x++) {
    for (let y = x; y < N - x - 1; y++) {
      let temp = mat[x][y];
      mat[x][y] = mat[y][N - 1 - x];
      mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];
      mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];
      mat[N - 1 - y][x] = temp;
    }
  }
}

rotateMatrix(4, mat);
console.log(mat);
