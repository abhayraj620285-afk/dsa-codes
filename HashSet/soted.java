package HashSet;

import java.util.TreeSet;

public class soted {
    static void main() {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(3);
        set.add(7);
        set.add(1);
        set.add(5);
        set.add(9);

        TreeSet<Integer> result = new TreeSet<>(set.headSet(7));

        System.out.println("Original Set: " + set);
        System.out.println("Elements less than 7: " + result);
    }

   public static void main(String[] args){

   }
}
