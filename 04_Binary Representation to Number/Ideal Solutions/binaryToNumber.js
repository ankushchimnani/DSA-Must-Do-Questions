const binaryToNumber = (str) => {
  let base = 1,
    ans = 0;
  for (let i = str.length - 1; i >= 0; i--) {
    if (str[i] == "1") {
      ans += base;
      base *= 2;
    }
  }
  return ans;
};
console.log(binaryToNumber("00000000000000000000000000000111"));
