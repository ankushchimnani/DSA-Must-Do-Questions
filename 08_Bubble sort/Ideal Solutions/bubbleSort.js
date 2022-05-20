/* Given an array A having N positive integers. Sort the array A using bubble sort.
 */
const swap = (arr, i, j) => {
  let tmp = arr[i];
  arr[i] = arr[j];
  arr[j] = tmp;
};

const bubbleSort = (arr) => {
  if (!arr.length) return 0;
  for (let i = 0; i < arr.length - 1; i++) {
    for (let j = 0; j < arr.length - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        swap(arr, j, j + 1);
      }
    }
  }
  return arr;
};
console.log(bubbleSort([83, 4, 5, 2, 1, 6, 7]));
