package HashSet;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Treeset {
    static void main() {
        TreeSet<Integer> st1 = new TreeSet<>();
        st1.add(20);
        st1.add(60);
        st1.add(5);
        TreeSet<Integer> st2 = new TreeSet<>();
        st2.add(1);
        st2.add(70);
        st1.addAll(st2);
        System.out.println(st1);

    }
}
