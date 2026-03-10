package sorting;

public class MergeSort {

    static void printarray(int[] arr){
        for(int val : arr){
            System.out.println(val);
        }
    }

    // this function will sort the given array separately.
    static void mergesort(int[] arr,int srt,int end){

        if(srt>=end) return;
        int mid = (srt+end)/2;
        mergesort(arr,srt,mid);
        mergesort(arr,mid+1,end);
        merge(arr,srt,end,mid);

    }

    static void merge(int[] arr,int srt,int end,int mid){
        int n1 = mid - srt + 1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0;i<n1;i++){
            left[i] = arr[srt+i];
        }
        for(int i=0;i<n2;i++){
            right[i] = arr[mid+1+i];
        }
        int i=0,j=0,k=srt;
        while(i<n1 && j<n2){
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < n1) {
            arr[k++] = left[i++];
        }


        while (j < n2) {
            arr[k++] = right[j++];
        }
    }



    public static void main(String[] args) {
        int[] arr = {4, 20, 7, 2, 11, 8};
        int srt = 0;
        int end = arr.length-1;
        mergesort(arr,srt,end);
        printarray(arr);
    }

}
