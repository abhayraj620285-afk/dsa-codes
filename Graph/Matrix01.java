package Graph;

import java.util.LinkedList;
import java.util.Queue;

// Leetcode : 542
public class Matrix01 {
    public int[][] updateMatrix(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;
    int[][] ans = new int[m][n];
    Queue<Pair> qt = new LinkedList<>();
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==0) {
                qt.add(new Pair(i,j));
            }
        }
    }
    while(!qt.isEmpty()){
        Pair x = qt.remove();
        int row = x.row;
        int col = x.col;
        if(col-1>=0 && mat[row][col-1]==0 && ans[row][col-1]==0){
            ans[row][col-1] = ans[row][col]+1;
            qt.add(new Pair(row,col-1));
        }
        if(col+1<n && mat[row][col+1]==0 && ans[row][col+1]==0){
            ans[row][col+1] = ans[row][col]+1;
            qt.add(new Pair(row,col+1));
        }
        if(row-1>=0 && mat[row-1][col]==0 && ans[row-1][col]==0){
            ans[row-1][col] = ans[row][col]+1;
            qt.add(new Pair(row-1,col));
        }
        if(row+1<m && mat[row+1][col]==0 && ans[row+1][col]==0){
            ans[row+1][col] = ans[row][col]+1;
            qt.add(new Pair(row+1,col));
        }

    }
    return ans;
    }
}
