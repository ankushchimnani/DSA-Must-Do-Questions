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

  reverse() {
    if (!this.head) return this.head;

    let curr = this.head;
    let prev = null;

    while (curr) {
      let tmp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = tmp;
    }
    this.head = prev;
  }
}

const LL = new Linkedlist();

LL.add(3);
LL.add(2);
LL.add(1);
/* LL.print(); */
LL.reverse();
LL.print(); //1 , 2, 3
