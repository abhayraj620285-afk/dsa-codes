package DynamicProgramming;
import java.util.*;
public class LDSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        Arrays.fill(dp,1);
        int maxLen = 0;
        int prevIdx = -1;
        int lastIdx = -1;
        for(int i=1;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                   if(dp[j]+1>dp[i]){
                       dp[i] = dp[j]+1;
                       prevIdx = j;
                   }
                }
            }
            if(maxLen<dp[i]){
                maxLen = dp[i];
                lastIdx = i;
            }
        }
        List<Integer> result = new ArrayList<>();
        while(lastIdx!=-1){
            result.add(nums[lastIdx]);
            lastIdx = ans[lastIdx];
        }
        return result;
    }
}
