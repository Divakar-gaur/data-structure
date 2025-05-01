package stack;

public class stack {
    Node head;
    int count;

    public void push(Object ele) {
        if (head == null) {
            head = new Node(ele);
            count++;
            return;
        }
        head = new Node(ele, head);
        count++;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count==0;
    }

    public Object peek(){
        return head.ele;
    }

    public Object pop(){
        Object ele=head.ele;
        head=head.next;
        count--;
        return ele;
    }
}
