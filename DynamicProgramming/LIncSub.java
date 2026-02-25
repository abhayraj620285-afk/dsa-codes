package DynamicProgramming;

import java.util.Arrays;
// LONGEST INCREASING SUBSEQUENCE
public class LIncSub {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int[] ints : dp){
            Arrays.fill(ints,-1);
        }
        return helper(0,-1,nums,dp);
    }
    public int helper(int idx,int prev,int[] arr,int[][] dp){
        if(idx == arr.length) return 0;
        // we increase prev index by 1 due to negative ind by 1;
        if(dp[idx][prev+1]!=-1) return dp[idx][prev+1];
        int skip = helper(idx+1,prev,arr,dp);
        if(prev!=-1 && arr[prev]>=arr[idx]) return dp[idx][prev+1] = skip;
        int pick = 1 + helper(idx+1,idx,arr,dp);
        return dp[idx][prev+1] = Math.max(pick,skip);
    }

    public int lengthOfLIST(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLen = 0;
        for(int i=0;i<n;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    max = Math.max(dp[j],max);
                }
            }
            dp[i]+=max;
            maxLen = Math.max(maxLen,dp[i]);
        }
        return maxLen;
    }
    // USING TABULATION


}
