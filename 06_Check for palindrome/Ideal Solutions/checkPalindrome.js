/* input: N = 9, string: malayalam */
const checkPalindrome = (str) => {
  let i = 0,
    j = str.length - 1;
  while (i < j) {
    if (str[i] !== str[j]) return false;
    i++;
    j--;
  }
  return true;
};
console.log(checkPalindrome("malayalam"));
