package linkedlist;

public class user {
    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        l.add(10);
        l.add(20);
        l.add("dhruva");
        l.add(true);
        l.add(30);

        System.out.println(l.size());
        System.out.println("++++++++++++++++++++++++");
        System.out.println(l.get(3));
        System.out.println("++++++++++++++++++++++++");

        l.addPos(40,4);
        System.out.println(l.get(4));
        l.display();
        System.out.println("++++++++++++++++++++++++");
        l.addFirst(50);
        l.display();
        l.remove(3 );
        System.out.println("++++++++++++++++++++++++");
        l.display();
    }
}
