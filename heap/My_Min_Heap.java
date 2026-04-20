package heap;

import java.util.ArrayList;

public class My_Min_Heap {
    // this code is for min heap implementation
    // max heap is homework
    ArrayList<Integer> list = new ArrayList<>();

    public void add(int item) {
        list.add(item);
        upheapify(list.size() - 1);
    }

    // ci- child index
    // pi- parent index
    private void upheapify(int ci) {
        int pi = (ci - 1) / 2;
        // min heap case
        if (list.get(pi) > list.get(ci)) {
            swap(pi, ci);
            ci = pi;
            upheapify(pi);
        }
    }

    // swap method
    public void swap(int i, int j) {
        int ith = list.get(i);
        int jth = list.get(j);
        list.set(i, jth); // set method updates the value of element in list at particular index
        list.set(j, ith);
    }

    public int min() {
        return list.get(0);
    }

    public int size() {
        return list.size();
    }

    public int remove() {
        // to remove element from top-> swap it with last element and then remove->then
        // downheapify
        swap(0, list.size() - 1);
        int rv = list.remove(list.size() - 1);
        downheapify(0); // from at very top
        return rv;
    }

    // to make the heap follow rules again, do downheapify
    public void downheapify(int pi) {
        int lci = pi * 2 + 1;
        int rci = pi * 2 + 2;
        int mini = pi;
        // find minimum index of lci, rci, pi
        if (lci < list.size() && list.get(lci) < list.get(mini))
            mini = lci;
        if (rci < list.size() && list.get(rci) < list.get(mini))
            mini = rci;
        // if our minimum index is not already the parent index itself then downheapify
        // again
        if (mini != pi) {
            swap(pi, mini);
            downheapify(mini);
        }
    }
    public void display(){
        for(int x : list){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
