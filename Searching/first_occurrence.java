package Searching;

public class first_occurrence {
    static void firsttime(int[] arr,int srt,int end,int key) {
        if (srt > end) {
            return;
        }
        int mid = (srt + end) / 2;
        int ifo = -1;
        if(arr[mid] == key){
            ifo = mid;
            firsttime(arr,srt,mid-1,key);
            System.out.println(ifo);
            return;

        }
         if(arr[mid]>key){
             firsttime(arr,srt,mid-1,key);
        }
         if(arr[mid]<key){
            firsttime(arr,mid+1,end,key);
        }

    }



    public static void main(String[] args) {
        int[] arr = {2,5,6,6,9,9,9,9,9};

        int srt = 0;
        int end = arr.length-1;
        int key = 6;
        firsttime(arr,srt,end,key);
    }
}
