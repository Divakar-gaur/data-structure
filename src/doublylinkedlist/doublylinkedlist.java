package doublylinkedlist;

class doublylinkedlist {
    Node head;
    int count;
    Node tail;

    public void add(Object ele) {
        if (head == null) {
            head = new Node(ele);
            count++;
            return;
        }
        Node curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = new Node(curr, ele, null);
        tail = curr.next;
        count++;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.ele);
            curr = curr.next;
        }
    }

    public void reverseDisplay() {
        Node curr = tail;
        while (curr!=null){
            System.out.println(curr.ele);
            curr=curr.prev;
        }
    }
    public void addLast(Object ele){
        Node n=new Node(ele);
        n.prev=tail;
        tail.next=n;
        count++;
        tail=n;
    }
    public void addFirst(Object ele){
        Node n=new Node(ele);
        n.next=head;
        head.prev=n;
        head=n;
        count++;
    }
    public void addPos(Object ele,int index){
        if(index<0|| index>size()) throw new IndexOutOfBoundsException();
        if(index==0){
            addFirst(ele);
            return;
        }
        if(index==size()){
            addLast(ele);
            return;
        }
        Node n=new Node(ele);
        Node curr=head;
        for(int i=1;i<index;i++) curr=curr.next;
        curr.next.prev=n;
        n.next=curr.next;
        n.prev=curr;
        curr.next=n;
        count++;
    }
    public void remove(int index){
        if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
        if (index==0){
            head=head.next;
            count--;
            head.prev=null;
            return;
        }
        if(index==size()-1){
            tail=tail.prev;
            tail.next=null;
            count--;
            return;
        }
        Node curr=head;
        for (int i=0;i<index;i++) curr=curr.next;
        curr.next=curr.next.next;
        curr.next.prev=curr;
        count--;
    }
}
