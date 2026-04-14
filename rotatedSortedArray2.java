
import java.util.Scanner;
public class rotatedSortedArray2 {
    // if srt and end index are equal as well as mid.

    static int binarySearch(int[] arr,int target){
        int srt = 0;
        int end = arr.length-1;
        while(srt<=end){
            int mid = srt + (end-srt)/2;
            if(arr[mid]==target){
                return mid;
            }
            Scanner sc = new Scanner(System.in);
            if(arr[srt]==arr[end]){
                srt++;
                end--;
            }

           else if(arr[mid]<=arr[end]){
               if(arr[mid]<target && arr[end]>=target){
                   srt = mid+1;
               }
               else{
                   end = mid-1;
               }
           }
           else{
               if(arr[srt]<=target && arr[mid]>target){
                   end = mid-1;
               }
               else{
                   srt = mid+1;
               }
            }

        }
        return -1;
    }




    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,3,1,1};
        int target = 2;
        System.out.println(binarySearch(arr,target));
    }
}
