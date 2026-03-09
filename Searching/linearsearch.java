package Searching;
import java.util.*;
public class linearsearch {
    public static int search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("Enter taregt:");
    int target = sc.nextInt();
    int[] arr = {2,3,4,5,6,7};
        System.out.println(search(arr,target));
    }
}
