package stack;

public class user {
    public static void main(String[] args) {
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        System.out.println(s.size());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.peek() );
    }
}