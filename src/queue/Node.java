package queue;

public class Node {
    public Object ele;
    public Node next;

    public Node(Object ele) {
        this.ele = ele;
    }

    public Node(Object ele, Node next) {
        this.ele = ele;
        this.next = next;
    }
}
