package queue;

public class user {
    public static void main(String[] args) {
        queue q=new queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
