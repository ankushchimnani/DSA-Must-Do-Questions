function FizzBuzz(N){
  for (let i = 1; i <= N; i++) {
      let out = '';
      if (i % 3 === 0) out += 'Fizz';
      if (i % 5 === 0) out += 'Buzz';
      console.log(out || i);
  }
}
