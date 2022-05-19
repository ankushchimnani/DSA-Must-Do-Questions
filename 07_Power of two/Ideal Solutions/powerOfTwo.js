/* 
Given a positive integer N. 
Check if it is a power of two or not.
*/

const powerOfTwo = (N) => {
  while (N % 2 == 0) {
    N /= 2;
  }
  return N === 1 ? true : false;
};
console.log(powerOfTwo(18));
