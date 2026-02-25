package DynamicProgramming;

import java.util.Arrays;

public class LDecSub {
    // TABULATION
    // LONGEST DECREASING SUBSEQUENCE

    public int lengthOfList(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLen = 0;
        for(int i=0;i<nums.length;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(nums[j]>nums[i]){
                    max = Math.max(dp[j],max);
                }
            }
            dp[i]+=max;
            maxLen = Math.max(maxLen,dp[i]);
        }
        return maxLen;
    }
}
