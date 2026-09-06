package sorting;

public class countSort2 {
    static void main() {
        int[] arr = {0,1,3,0,3,2,4,5,2,4,6,2,2,3};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }
        int[] freq = new int[max+1];
        for(int i=0;i<n;i++){
            freq[i]++;
        }
        for(int i=0;i<freq.length;i++){
            System.out.println(freq[i]);
        }
    }
}