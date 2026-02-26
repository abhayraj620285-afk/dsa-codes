package Backtracking.No;
import java.util.*;
// Method 1 :-
public class ofArrayele {

    public void printPer(int[] nums,List<Integer> ds,boolean[] isVisited,List<List<Integer>> list){
        if(ds.size()==nums.length){
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<ds.size();i++){
                arr.add(ds.get(i));
            }
            list.add(arr);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(isVisited[i]==false){ // tavi call lageaga
                ds.add(nums[i]);
                isVisited[i] = true;
                printPer(nums,ds,isVisited,list);
                isVisited[i] = false;
                ds.remove(ds.size()-1);

            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] isVisited = new boolean[nums.length];
        printPer(nums, ds, isVisited, list);
        return list;
    }
}
