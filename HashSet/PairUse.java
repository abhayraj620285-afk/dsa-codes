package HashSet;

import java.util.HashSet;

class Pair{
    int i;
    int j;
    Pair(int i,int j){
        this.i = i;
        this.j = j;
    }
}
public class PairUse {
    static void main() {
        HashSet<Pair> set = new HashSet<>();
        set.add(new Pair(1,2));
        System.out.println("---------********---------");
        if(set.contains(new Pair(1,2))) System.out.println("yes");
        else System.out.println("false");
    }
}
