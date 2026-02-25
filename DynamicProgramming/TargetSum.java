package DynamicProgramming;

public class TargetSum {
    static int absSum;
    public int findTargetSumWays(int[] nums, int target) {
        absSum = 0;
        for(int i=0;i<nums.length;i++){
            absSum+=nums[i];
        }
        int[][] dp = new int[nums.length][2*absSum+1];
        // taking length of dp to be greater than array sum
        return helper(0,0,target,nums,dp);
    }
    public int helper(int i,int sum,int target,int[] nums,int[][] dp){
        if(i==nums.length){
            if(sum==target) return 1;
            else return 0;
        }
        // here sum can be negative also
        // so to avoid negative absSum is to be added
        if(dp[i][sum+absSum]!=0) return dp[i][sum+absSum];
        int add = helper(i+1,sum+nums[i],target,nums,dp);
        int sub = helper(i+1,sum-nums[i],target,nums,dp);
        return dp[i][sum+absSum] = add+sum;
    }
}
