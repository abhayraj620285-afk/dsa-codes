
package Searching;
import java.util.Scanner;
import java.util.Collection;
import java.util.Arrays;

public class Binary_Search {

    static void search(int[] arr,int srt,int end,int key){
        if(srt>end) return;
        int mid = srt + (end - srt) / 2;
        int ifo = -1;
        if(arr[mid]==key) {

            return;
        }


        if(key>arr[mid]){
            search(arr,mid+1,end,key);
        }
        if(key<arr[mid]){
            search(arr,srt,mid-1,key);
        }

    }




    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6};
        int n = arr.length;
        //Scanner sc = new Scanner(System.in);
       // System.out.println("Enter key element to search : ");
        int key = 4;
        //Arrays.sort(arr);
        int srt = 0;
        int end = n-1;
        search(arr,srt,end,key);

    }
}
