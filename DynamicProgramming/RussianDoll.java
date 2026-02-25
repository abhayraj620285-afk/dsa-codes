package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

// LIS application
public class RussianDoll {
    public int maxEnvelopes(int[][] envelopes) {
    // Comparator Function
    Arrays.sort(envelopes, (a, b) -> {
        if(a[0] == b[0]) return b[1] - a[1];
        else return a[0] - b[0];
    });
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i=0;i<envelopes.length;i++){
       arr.add(envelopes[i][1]);
    }
    ArrayList<Integer> ans = new ArrayList<>();
    for(int i=0;i<arr.size();i++){
        if(ans.isEmpty() || arr.get(i)>=ans.get(ans.size()-1)){
            ans.add(arr.get(i));
        }else{
            binary(arr.get(i),ans);
        }
    }
    return ans.size();
    }

    public void binary(Integer ele, ArrayList<Integer> list) {
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
