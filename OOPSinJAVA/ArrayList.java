package OOPSinJAVA;
import java.util.*;
public class ArrayList {
    public static class arraylist{
        int arr[] = new int[2];
        int idx = 0;
        int size = 0;
        public void add(int ele){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr,arr.length*2);
                arr = brr;
            }
            arr[idx] = ele;
            idx++;
            size++;
        }

    }

    public static void main(String[] args) {
        arraylist arr = new arraylist();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
    }
}
