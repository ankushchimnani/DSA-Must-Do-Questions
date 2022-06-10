class Stack {
  #Q1 = [];
  #Q2 = [];

  push(value) {
    if (this.#Q1.length !== 0) {
      while (this.#Q1.length) {
        this.#Q2.push(this.#Q1.shift());
      }
      this.#Q1.push(value);
      while (this.#Q2.length) {
        this.#Q1.push(this.#Q2.shift());
      }
    } else {
      this.#Q1.push(value);
    }
  }
  pop() {
    return this.#Q1.length ? this.#Q1.shift() : "empty";
  }
}

const stack = new Stack();
/* stack.push(9);
console.log(stack.pop());
console.log(stack.pop());
stack.push(10);
console.log(stack.pop());
 */