/* Given an input array, sort the array using Quick Sort  */

function swap(arr, i, j) {
  let temp = arr[i];
  arr[i] = arr[j];
  arr[j] = temp;
}

/* Divide and rule 1946 16 aug*/
function partition(arr, low, high) {
  let pivot = arr[high];
  let i = low - 1;
  for (let j = low; j <= high - 1; j++) {
    if (arr[j] < pivot) {
      i++;
      swap(arr, i, j);
    }
  }
  swap(arr, i + 1, high);
  return i + 1;
}

function sortUsingQuicksort(arr, low, high) {
  if (low < high) {
    let pi = partition(arr, low, high);
    sortUsingQuicksort(arr, low, pi - 1);
    sortUsingQuicksort(arr, pi + 1, high);
  }
}
let arr = [10, 7, 8, 9, 1, 5];
let n = arr.length;

sortUsingQuicksort(arr, 0, n - 1);
console.log(arr);
