package OOPSinJAVA;
import java.util.*;
import java.util.ArrayList;
public class ArrListrev {
    static void reversearraylist(ArrayList<Integer> list){
        int i=0;
        int j=list.size()-1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,j);
            list.set(j,temp);
            i++;
            j--;
        }

    }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        reversearraylist(list);
        System.out.println(list);
    }
}
