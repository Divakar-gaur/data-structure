package linkedlist;

class Node{
   public Object ele;
   public Node next;

    Node (Object ele){
        this.ele=ele;
    }
    Node (Object ele,Node next){
        this.ele=ele;
        this.next=next;
    }
}