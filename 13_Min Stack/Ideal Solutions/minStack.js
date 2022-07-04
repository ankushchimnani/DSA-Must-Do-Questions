class Stack {
  _stack = [];

  push(val) {
    const min = Math.min(val, this.getMin());
    this._stack.push([val, min]);
  }
  top() {
    return this.peek()[0];
  }
  pop() {
    return this._stack.pop();
  }

  peek() {
    return this._stack[this._stack.length - 1] || 0;
  }
  getMin() {
    return this.peek()[1] ?? Infinity;
  }
}

const stack = new Stack();
stack.push(2);
stack.push(6);
stack.push(0);
stack.push(10);
console.log(stack.getMin()); //0
