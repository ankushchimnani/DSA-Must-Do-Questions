const binaryRepresentation = (N) => {
  let i;
  process.stdout.write("0");
  for (i = 1 << 30; i > 0; i = Math.floor(i / 2)) {
    if ((N & i) != 0) {
      process.stdout.write("1");
    } else {
      process.stdout.write("0");
    }
  }
};
binaryRepresentation(7);
