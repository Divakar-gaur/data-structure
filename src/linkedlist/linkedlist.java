package linkedlist;

public class linkedlist {
    public Node head;
    public int count=0;
    public void add(Object ele){
        if(head==null){
            head=new Node(ele);
            count++;
            return;
        }
        Node curr=head;
        while (curr.next!=null){
            curr=curr.next;
        }
        curr.next= new Node(ele,null);
        count++;
    }

    public int size(){
        return count;
    }
    public Object get(int index){
        if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
        Node curr=head;
        for (int i=1;i<index ;i++){
            curr=curr.next;
        }
        return curr.ele;
    }
    public void addPos(Object ele,int index){
        if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
        Node n=new Node(ele);
        if (index==0){
            addFirst(ele);
            return;
        }
        Node curr=head;
        for (int i=1;i<index;i++) curr=curr.next;
        n.next=curr.next;
        curr.next=n;
        count++;
    }

    public void addFirst(Object ele){
        Node n=new Node(ele);
        n.next=head;
        head=n;
        count++;
        return;
    }
    public void display(){
        Node curr=head;
        while (curr!=null){
            System.out.println(curr.ele);
            curr=curr.next;
        }
    }
    public void contains(Object ele){
        Node curr=head;
        while (curr.next!=null){
            if(curr.ele==ele){
                System.out.println("element present");
                return;
            }
        }
        System.out.println("not present");
    }
    public void remove (int index){
        if(index<0 || index>=size()) throw new IndexOutOfBoundsException();
        Node curr=head;
        if(index==0){
            head=head.next;
            count--;
            return;
        }
        for(int i=1;i<index;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        count--;
    }
}

