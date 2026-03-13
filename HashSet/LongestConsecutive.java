package HashSet;
import java.util.*;
public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,100,90,200};
        HashSet<Integer> st = new HashSet<>();
        for(int num :nums) st.add(num);
        for(int num : st){
            if(!st.contains(num-1)){
                int currnum = num;
                int currCount = 0;
                while(st.contains(num+1)){
                    currCount++;
                    currnum++;
                }
            }
        }
    }


}
