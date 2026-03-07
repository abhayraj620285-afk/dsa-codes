package Heap;

import java.util.Arrays;

class Heap{
    int [] arr;
    int idx = 1;
    int peek(){
        return arr[1];
    }
    int remove(){
        if(idx==1){
            System.out.println("Underflow");
            return -1;
        }
        int min = arr[1];
        arr[1] = arr[idx-1];
        idx--;
        // rearrangemet
        int root = 1;
        while(root<=size()){
            int left = 2*root,right = 2*root+1;
            int leftval = (left<=size()) ? arr[left] : Integer.MAX_VALUE;
            int rightval = (right<=size()) ? arr[right] : Integer.MAX_VALUE;
            if(arr[root]<leftval && arr[root]<rightval) break;
            else{
                if(leftval<rightval){ // left child se swap hoga
                    int temp = arr[root];
                    arr[root] = arr[left];
                    arr[left] = temp;
                    root = left;
                }
                else{ // right child se swap
                    int temp = arr[root];
                    arr[root] = arr[right];
                    arr[right] = temp;
                    root = right;

                }
            }
        }
        return min;
    }
    void add(int ele) {
        arr[idx++] = ele;
        // rearrangement
        int root = idx - 1;
        while (root != 1) {
            int p = root / 2;
            if (arr[root] < arr[p]) {
                int temp = arr[root];
                arr[root] = arr[p];
                arr[p] = temp;
                root = p;
            } else break;
        }
    }
    void display(){
        for(int i=1;i<idx;i++){
            System.out.print(arr[i]+" " );
        }
        System.out.println();
    }


    int size(){
        return idx-1;
    }
    Heap(int capacity){
        arr = new int[capacity+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
    }


}
public class MinHeapImplemenet {
    static void main() {
        Heap h = new Heap(10);
        h.add(10);
        h.add(15);
        h.add(8);
        h.add(9);
        h.add(4);
        h.display();
       int x =  h.remove();
        System.out.println(x);
        h.display();

    }
}
