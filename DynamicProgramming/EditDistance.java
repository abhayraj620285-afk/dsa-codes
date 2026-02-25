package DynamicProgramming;

import java.util.Arrays;

public class EditDistance {
    // USING TABULATION
    public int editDistance(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;i++){
                if(s1.equals(s2)) dp[i][j] = ((i>=1 && j>=1) ? dp[i-1][j-1] : 0);
                int remove = 1+((i>=1) ? dp[i-1][j] : j+1);
                int replace = 1+((i>=1 && j>=1) ? dp[i-1][j-1] : (i==0 ? j+1 : i+1));
                int insert = 1+((j>=1) ? dp[i][j-1] : i+1);
                dp[i][j] = Math.min(remove,Math.min(replace,insert));
            }
        }
        return dp[m-1][n-1];
    }

//    public int editDistance(String s1,String s2){
//        int i = s1.length();
//        int j = s2.length();
//        int[][] dp = new int[i][j];
//        for(int[] ints : dp) Arrays.fill(ints,-1);
//        return edit(i-1,j-1,new StringBuilder(s1),new StringBuilder(s2),dp);
//    }
//    public int edit(int i,int j,StringBuilder str1,StringBuilder str2,int[][] dp){
//        if(i<0) return j+1;
//        if(j<0) return i+1;
//        if(dp[i][j]!=0) return dp[i][j];
//        if(str1.charAt(i)==str2.charAt(j)) return dp[i][j] = edit(i-1,j-1,str1,str2,dp);
//        int remove = 1+edit(i-1,j,str1,str2,dp);
//        int replace = 1+edit(i-1,j-1,str1,str2,dp);
//        int insert = 1+edit(i,j-1,str1,str2,dp);
//        return dp[i][j] = Math.min(remove,Math.min(replace,insert));
//    }
}
