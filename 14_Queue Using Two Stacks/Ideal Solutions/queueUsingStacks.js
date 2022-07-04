class Queue {
  constructor() {
    this.stack1 = [];
    this.stack2 = [];
  }

  enqueue(value) {
    this.stack1.push(value);
  }

  dequeue() {
    if (!this.stack2.length)
      while (this.stack1.length !== 0) {
        this.stack2.push(this.stack1.pop());
      }
    return this.stack2[this.stack2.length - 1] === undefined
      ? "empty"
      : this.stack2.pop();
  }
  isEmpty() {
    return this.stack1.length === 0 && this.stack2.length === 0;
  }
  peek() {
    if (this.isEmpty()) return "empty queue";
    return this.stack2.length === 0
      ? this.stack1[0]
      : this.stack2[this.stack2.length - 1];
  }
}
const queue = new Queue();

queue.enqueue(0);
queue.enqueue(2);

console.log(queue.dequeue());
console.log(queue.dequeue());
console.log(queue.dequeue());
console.log(queue.peek());
