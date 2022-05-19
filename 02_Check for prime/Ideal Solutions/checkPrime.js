const checkPrime = (N) => {
  if (N <= 0) return 0;
  for (let i = 2; i ** 2 < N; i++) {
    if (N % i === 0) {
      return false;
    }
  }
  return true;
};
console.log(checkPrime(-1));


