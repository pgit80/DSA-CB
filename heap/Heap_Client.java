package heap;

public class Heap_Client {
    public static void main(String[] args) {
        My_Min_Heap mh = new My_Min_Heap();
        mh.add(10);
        mh.add(20);
        mh.add(30);
        mh.add(5);
        mh.add(7);
        mh.add(3);
        mh.add(2);
        mh.add(-10);
        mh.add(-20);
        mh.display();
        System.out.println(mh.remove());
        mh.display();
        System.out.println(mh.min());
    }
}
