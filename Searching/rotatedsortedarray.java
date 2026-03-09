// we have to find the minimum element in rotated sorted array
package Searching;

public class rotatedsortedarray {

    static int minelement(int[] arr, int n,int key){
        int srt = 0;
        int end = n;
        int ans = -1;
        while(srt<=end){
            int mid = (srt+end)/2;

            if(arr[mid]>key){
                srt = mid+1;

            }
            else if(arr[mid]<=key){
                end = mid-1;
               return mid;

            }
        }
        return -1;
    }



    public static void main(String[] args) {
        int[] arr = {10,11,12,1,2,3,4,5,6,7,8,9};
        int n = arr.length-1;
        int key = 11;
        System.out.println(minelement(arr,n,key));
    }
}
