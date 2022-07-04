class Node {
  constructor(element) {
    this.element = element;
    this.next = null;
  }
}

class Linkedlist {
  constructor() {
    this.head = null;
    this.size = 0;
  }

  add(val) {
    var node = new Node(val);

    var current;

    if (this.head == null) this.head = node;
    else {
      current = this.head;

      while (current.next) {
        current = current.next;
      }

      current.next = node;
    }
    this.size++;
  }

  print() {
    if (this.head === null) return "empty";

    let curr = this.head;

    while (curr) {
      console.log(curr.element);
      curr = curr.next;
    }
  }

  detectLoop() {
    if (!this.head) return this.head;
    let curr = this.head;
    let map = new Set();

    while (curr) {
      if (map.has(curr)) return true;
      map.add(curr);
      curr = curr.next;
    }
    return false;
  }

  creatrLoop() {
    this.head.next.next.next.next = this.head;
    return this.head;
  }
}

const LL = new Linkedlist();
LL.add(3);
LL.add(2);
LL.add(1);
LL.add(8);
LL.creatrLoop(); // creating loop inside LL for test
console.log(LL.detectLoop());
