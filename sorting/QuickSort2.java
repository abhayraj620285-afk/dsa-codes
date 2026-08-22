package sorting;

public class QuickSort2 {
    static void main() {
        int[] arr = {6,3,1,5,4,5};
        int srt = 0;
        int end = arr.length-1;
        sort(arr,srt,end);
        for(int x : arr){
            System.out.println(x);
        }
    }
    public static void sort(int[] arr,int srt,int end){
        if(srt>=end) return;
        int partion =  partitioning(arr,srt,end);
        sort(arr,srt,partion-1);
        sort(arr,partion+1,end);
    }

    private static int partitioning(int[] arr, int srt, int end) {
        int pivot = arr[end];
        int pivotIdx = srt;
        for(int i=srt;i<end;i++){
            if (arr[i] <= pivot) {
             int temp = arr[i];
             arr[i] = arr[pivotIdx];
             arr[pivotIdx] = temp;
             pivotIdx = i;
            }
        }
        int temp = arr[pivotIdx];
        arr[pivotIdx] = arr[end];
        arr[end] = temp;
        return pivotIdx;
    }

}
