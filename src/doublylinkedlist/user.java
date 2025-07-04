package doublylinkedlist;

public class user {
    public static void main(String[] args) {
        doublylinkedlist l=new doublylinkedlist();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add("ram");
        l.add(true);

        System.out.println(l.size());
    }
}