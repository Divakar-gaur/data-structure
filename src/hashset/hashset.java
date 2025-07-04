package hashset;

public class hashset {
    int count = 0;
    Node[] a = new Node[10];

    public boolean add(Object ele) {
        int hc = Math.abs(ele.hashCode());
        int index = hc % a.length;
        if (a[index] == null) {
            a[index] = new Node(ele);
            count++;
            return true;
        }
        Node curr = a[index];
        Node temp = null;
        while (curr != null) {
            if (curr.ele.equals(ele)) return false;
            temp = curr;
            curr = curr.next;
        }
        temp.next = new Node(ele);
        count++;
        return true;
    }

    public boolean remove(Object ele){
        int hc = Math.abs(ele.hashCode());
        int index = hc % a.length;
        Node prev=null;
        Node curr=a[index];
        while (curr!=null){
            if (curr.ele.equals(ele)){
                if(prev==null){
                    a[index]=a[index].next;
                    count--;
                    return true;
                }
                prev.next=prev.next.next;
                count--;
                return true;
            }
            prev=curr;
            curr=curr.next;
        }
        return false;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void display(){
        for(int i=0;i<a.length;i++){
            Node curr=a[i];
            while (curr!=null){
                System.out.println(curr.ele);
            }
        }
    }

}
