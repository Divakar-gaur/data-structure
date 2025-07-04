package arraylist;

public class arraylist {
    Object[] o = new Object[10];
    int count = 0;

    public void add (Object ele) {
        if (count >= o.length) increase();
        o[count++] = ele;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    private void increase() {
        Object[] a = new Object[o.length + ((o.length / 2) + 1)];
        for (int i = 0; i < o.length; i++) {
            a[i] = o[i];
        }
        o = a;
    }

    public Object get(int index) {
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();
        return o[index];
    }

    public void addPos(Object ele, int index) {
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();
        if (count >= o.length) increase();
        for (int i = size(); i > index; i--) {
            o[i] = o[i - 1];
        }
        o[index] = ele;
        count++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();
        for (int i = index; i < size(); i++) {
            o[i] = o[i + 1];
        }
        count--;
    }
    public static void main(String[] args) {
        arraylist x = new arraylist();
        x.add(10);
        x.add(20);
        x.add(30);
        x.add(40);
        x.add(50);

        x.addPos(25,2);
        x.remove(4);
        System.out.println("size = "+x.size());
        System.out.println("=======================");
        System.out.println("Empty ? -> "+x.isEmpty());
        System.out.println("==============================");
        for(int i=0;i<x.size();i++){
            System.out.println(x.get(i));
        }
    }
}
