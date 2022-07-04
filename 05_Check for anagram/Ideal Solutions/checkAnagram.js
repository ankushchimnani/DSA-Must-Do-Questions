/* 	input: N = 4, X = abcd, M = 4, Y = dacb */
const checkAnagram = (str1, str2) => {
  if (str1.length !== str2.length) return false;
  str1.sort();
  str2.sort();
  for (let i in str1) {
    if (str1[i] !== str2[i]) {
      return false;
    }
  }
  return true;
};

console.log(checkAnagram("cdab".split(""), "dacb".split("")));
