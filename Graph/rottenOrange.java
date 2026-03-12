package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Triplet{
    int row;
    int col;
    int time;
    Triplet(int row,int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
public class rottenOrange {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Triplet> qt = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                   qt.add(new Triplet(i,j,0));
                }
            }
        }
        int maxTime = 0;
        while(!qt.isEmpty()){
            Triplet x = qt.remove();
            int row = x.row;
            int col = x.col;
            int time = x.time;
            maxTime = Math.max(time,maxTime);
            if(row-1>=0 && grid[row-1][col]==1){
                grid[row-1][col] = 2;
                qt.add(new Triplet(row-1,col,time+1));

            }
            if(row+1< grid.length && grid[row+1][col]==1){
                grid[row+1][col] = 2;
                qt.add(new Triplet(row+1,col,time+1));

            }
            if(col-1>=0 && grid[row][col-1]==1){
                grid[row][col-1] = 2;
                qt.add(new Triplet(row,col-1,time+1));

            }
            if(col+1<grid[row].length && grid[row][col+1]==1){
                grid[row][col+1] = 2;
                qt.add(new Triplet(row,col+1,time+1));

            }
       }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return maxTime;





    }
}
