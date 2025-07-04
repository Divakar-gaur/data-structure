package doublylinkedlist;

class Node {
    Node prev;
    Object ele;
    Node next;

    Node(Object ele) {
        this.ele = ele;
    }

    Node(Node prev, Object ele, Node next) {
        this.prev = prev;
        this.ele = ele;
        this.next = next;
    }
}
