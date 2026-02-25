package DynamicProgramming;

public class LCSubString {

    public int longCommSubStr(String s1, String s2) {
//        int m = s1.length();
//        int n = s2.length();
//        maxLen = 0;
//        helper(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2));
//        return maxLen;
        int maxLen = 0;
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
                else{
                    dp[i][j] = 0;
                }
                maxLen = Math.max(maxLen,dp[i][j]);
            }
        }
        return dp[m][n];
    }
    }
//    public int helper(int i,int j, StringBuilder s1,StringBuilder s2){
//        if(i<0 || j<0) return 0;
//        if(s1.charAt(i)==s2.charAt(j)) {
//            int len = 1+helper(i-1,j-1,s1,s2);
//            maxLen = Math.max(maxLen,len);
//            return len;
//        }else{
//            int len = Math.max(helper(i-1,j,s1,s2),helper(i,j-1,s1,s2));
//            maxLen = Math.max(maxLen,len);
//            return 0;
//        }
//
//    }
//}
