class ListNode {
  constructor(data) {
    this.val = data;
    this.next = null;
  }
}

function AdddTwoLL(l1, l2) {
  let dummy = new ListNode();
  let temp = dummy;
  let carry = 0;

  while (l1 !== null || l2 !== null || carry == 1) {
    let sum = 0;
    if (l1 !== null) {
      sum += l1.val;
      l1 = l1.next;
    }
    if (l2 !== null) {
      sum += l2.val;
      l2 = l2.next;
    }
    sum += carry;
    carry = Math.floor(sum / 10);

    let newNode = new ListNode(sum % 10);
    temp.next = newNode;
    temp = temp.next;
  }
  return dummy.next;
}
