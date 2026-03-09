package Searching;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
public class binary_search2 {

    static int binarysearch(int[] arr,int n,int k){
        int srt = 0;
        int end = n-1;
        int srtindex = -1;
        int endindex = -1;
        //ArrayList<Integer>[] searched = new ArrayList[2];

        while(srt<=end){
            int mid = srt + (end-srt)/2;

            if(arr[mid]==k){
              // ifo = mid;
              end = mid-1;
              srtindex = mid;
            }
            else if(arr[mid+1]==k){
                srt = mid+1;
                endindex = mid;
            }
            else if(k<arr[mid]){
                end = mid-1;
            }
            else{
                srt = mid+1;
            }

        }
        return srtindex+endindex;



    }


    public static void main(String[] args) {
        int[] arr = {2,5,6,6,8,9,9,9,9};
        int n = arr.length;
        int key = 9;
        Arrays.sort(arr);
        System.out.println(binarysearch(arr,n,key));
    }
}
