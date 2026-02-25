package DynamicProgramming;

import java.util.ArrayList;

public class LISusingBS {
    static int LIS(int[] arr){
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(list.isEmpty() || arr[i]>list.get(list.size()-1)) {
                list.add(arr[i]);
            }
            else{
                replace(arr[i],list);
            }
        }
        return list.size();
    }

    private static void replace(int ele, ArrayList<Integer> list) {
        int low = 0;
        int high = list.size()-1;
        int lb = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(list.get(mid)>=ele){
                lb = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        list.set(lb,ele);
    }


}
