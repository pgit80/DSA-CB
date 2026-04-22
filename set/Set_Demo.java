package set;
import java.util.*;
public class Set_Demo {
    public static void main(String[] args) {
        // random order
        HashSet<Integer> st = new HashSet<>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(-10);
        st.add(40);
        st.add(10);
        st.add(30);
        st.add(0);
        st.add(null);
        // System.out.println(st);
        // sorted order
        TreeSet<Integer> st1 = new TreeSet<>();
        st1.add(10);
        st1.add(20);
        st1.add(30);
        st1.add(-10);
        st1.add(40);
        st1.add(10);
        st1.add(30);
        st1.add(0);
        // st1.add(null); will give runtime error
        // System.out.println(st1);
        // preserve insertion order
        LinkedHashSet<Integer> st2 = new LinkedHashSet<>();
        st2.add(10);
        st2.add(20);
        st2.add(30);
        st2.add(-10);
        st2.add(40);
        st2.add(10);
        st2.add(30);
        st2.add(0);
        System.out.println(st2);
    }
}
