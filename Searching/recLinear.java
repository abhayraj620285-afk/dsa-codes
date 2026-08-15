package Searching;

public class recLinear {
    static int linear(int[] arr,int target,int idx){
        if(idx==arr.length) return -1;
        if(arr[idx]==target) return idx;
       return linear(arr,target,idx+1);
    }

    static void main() {
        int[] arr = {2,8,4,7,1,0};
        int target = 7;
        int idx = 0;
        int ele = linear(arr,target,idx);
        if(ele!=-1){
            System.out.println("Target Element found at index : " + ele);
        }
        else System.out.println("Element not found : " + ele);
    }

}
