package sorting;

public class quicksort {

    static int partition(int[] arr, int srt, int end){
        int pivot = arr[srt];
        int count = 0;
        for(int i=srt+1;i<=end;i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
           int pivotidx = srt + count;
           int temp = arr[srt];
           arr[srt] = arr[pivotidx];
           arr[pivotidx] = temp;
           int i=srt;
           int j=end;
           while(i<pivotidx && j>pivotidx){
               while(arr[i]<=pivot) i++;

               while(arr[j]>pivot) j--;
           if(i<pivotidx && j>pivotidx){
               int temp2 = arr[i];
               arr[i] = arr[j];
               arr[j] = temp2;
               i++;
               j--;
           }
           }
           return pivotidx;

    }





    // main code for execution.
    static void quicksort(int[] arr,int srt,int end){
    if(srt >= end) return;
    //partition the array and get the pivot indx
    int pi = partition(arr,srt,end);
    //recursively sort the separted array
    quicksort(arr,srt,pi-1);
    quicksort(arr,pi+1,end);
    }

    static void printarray(int[] arr, int n){
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args) {
        int[] arr= {6,3,1,5,4,5};
        int srt = 0;
        int end = arr.length-1;
        quicksort(arr,srt,end);
        System.out.println("Array after quick sort is : ");
        printarray(arr,end);
    }
}
