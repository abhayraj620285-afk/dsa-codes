package Graph;

import java.util.LinkedList;
import java.util.Queue;
 class Pairs{
    int row;
    int col;
    Pairs(int row,int col){
        this.row = row;
        this.col = col;
    }
 }
public class NoOfEnclave {
    public int numEnclaves(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    Queue<Pairs> qt = new LinkedList<>();
    for(int i=0;i<m;i++){
       if(grid[i][0]==1){
           grid[i][0] = -1;
           qt.add(new Pairs(i,0));
       }
       if(grid[i][n-1]==1){
           grid[i][n-1] = -1;
           qt.add(new Pairs(i,n-1));
       }
    }
    for(int j=0;j<n;j++){
        if(grid[0][j]==1){
            grid[0][j] = -1;
            qt.add(new Pairs(0,j));
        }
        if(grid[m-1][j]==1){
            grid[m-1][j] = -1;
            qt.add(new Pairs(m-1,j));
        }
    }
    while(!qt.isEmpty()){
        Pairs x = qt.remove();
        int row = x.row;
        int col = x.col;
        if(row-1>=0 && grid[row-1][col]==1){
            grid[row-1][col] = -1;
            qt.add(new Pairs(row-1,col));

        }
        if(row+1< grid.length && grid[row+1][col]==1){
            grid[row+1][col] = -1;
            qt.add(new Pairs(row+1,col));

        }
        if(col-1>=0 && grid[row][col-1]==1){
            grid[row][col-1] = -1;
            qt.add(new Pairs(row,col-1));

        }
        if(col+1<grid[row].length && grid[row][col+1]==1){
            grid[row][col+1] = -1;
            qt.add(new Pairs(row,col+1));

        }
    }
    return 0;
    }
}
