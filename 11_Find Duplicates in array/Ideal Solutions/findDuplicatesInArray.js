const findDuplicatesInArray = (arr) => {
  let sum = 0;
  for (let i = 0; i < arr.length; i++) {
    sum += arr[i];
  }
  let end = arr.length - 1;
  let value = (end * (end + 1)) / 2;
  return Math.abs(value - sum);
};

console.log(findDuplicatesInArray([1, 1, 3, 2, 4]));
