const fizzBuzz = (N) => {
  for (let i = 1; i <= N; i++) {
    if (i % 3 == 0 && i % 5 == 0) console.log("FizzBuzz " + i);
    else if (i % 3 === 0) console.log("Fizz " + i);
    else if (i % 5 === 0) console.log("Buzz " + i);
  }
};
fizzBuzz(15);
