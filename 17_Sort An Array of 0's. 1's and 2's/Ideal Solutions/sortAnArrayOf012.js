let arr = [0, 1, 2, 0, 1, 2];

const sortAnArrayOf012 = (arr) => {
  let mid = 0;
  let left = 0;
  let end = arr.length - 1;
  while (mid <= end) {
    if (arr[mid] === 0) {
      let tmp = arr[mid];
      arr[mid] = arr[left];
      arr[left] = tmp;
      left++;
      mid++;
    } else if (arr[mid] === 1) {
      mid++;
    } else if (arr[mid] === 2) {
      let tmp = arr[mid];
      arr[mid] = arr[end];
      arr[end] = tmp;
      end--;
    }
  }
  return arr;
};
console.log(sortAnArrayOf012(arr));
