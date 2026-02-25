package DynamicProgramming;

import java.util.Arrays;

public class LongestCommonSubsequence {
    // FOR PRINTING LCS
    static void main() {
        String s1 = "anuj";
        String s2 = "anjun";
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        String ans = "";
        int i = m-1;
        int j = n-1;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                ans+=s1.charAt(i-1);
                i--;
                j--;
            }
            else{
                if(dp[i-1][j]>=dp[i][j-1]) i--;
                else j--;
            }
        }
        StringBuilder str = new StringBuilder(ans);
        System.out.println(str.reverse());
    }
    public int lcs(String s1, String s2) {
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        for (int[] ints : dp) Arrays.fill(ints, -1);
        // to save form MEMORY LIMIT EXCEED(MLE) we use stringBuilder because they are pass by reference
        return LCS(s1.length()-1,s2.length()-1,new StringBuilder(s1),new StringBuilder(s2),dp);
    }
    // i->n-1 to 0   j->n-1 to 0
    public int LCS(int i,int j,StringBuilder a,StringBuilder b,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = 1+LCS(i-1,j-1,a,b,dp);
        else return dp[i][j] =  Math.max(LCS(i-1,j,a,b,dp),LCS(i,j-1,a,b,dp));
    }

    // METHOD -> 1
    // USING TABULATION
    // USING M & N
    public int lcs1(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int x = (i-1>=0 && j-1>=0) ? dp[i-1][j-1] : 0;
                int y = (i-1>=0) ? dp[i-1][j] : 0;
                int z = (j-1>=0) ? dp[i][j-1] : 0;
                if(s1.charAt(i)==s2.charAt(j))  dp[i][j] =  1+x;
                else dp[i][j] = Math.max(y,z);
            }
        }
        return dp[m-1][n-1];
    }

    // METHOD -> 2
    // TABULATION USING M+1 & N+1
    public int lcs2(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

}
