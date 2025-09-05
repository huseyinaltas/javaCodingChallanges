class ListNode {
  constructor(val = 0, next = null) {
    this.val = val;
    this.next = next;
  }

  reverseList(head) {
    let prev = null;
    let curr = head;
    while (curr !== null) {
      let nextTemp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextTemp;
    }
    return prev;
  }

  reverseList1(head) {
    return null;
  }
}

// Example usage:
const node1 = new ListNode();
const node2 = new ListNode();
const node3 = new ListNode();
node1.val = 1;
node2.val = 2;
node3.val = 3;
node1.next = node2;
node2.next = node3;

const reversedHead = node1.reverseList1(node1);
console.log("Reversed linked list:");
let curr = reversedHead;
while (curr !== null) {
  process.stdout.write(curr.val + " ");
  curr = curr.next;
}
