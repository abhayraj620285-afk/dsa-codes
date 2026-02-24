package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row = row;
        this.col = col;
    }
}
public class NumberOfisland {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> qt = new LinkedList<>();
        int count = 0;
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    count++;
                    bfs(i,j,grid,visited,qt);
                }
            }
        }

        return count;
    }
    public void bfs(int i,int j,char[][] grid,boolean[][] visited,Queue<Pair> qt){
        qt.add(new Pair(i,j));
        visited[i][j] = true;
        while(!qt.isEmpty()){
            Pair x = qt.remove();
            int row = x.row;
            int col = x.col;
            if(row-1>=0 && grid[row-1][col]=='1' && !visited[row-1][col]){
                qt.add(new Pair(row-1,col));
                visited[row-1][col] = true;
            }
            if(row+1< grid.length && grid[row+1][col]=='1' && !visited[row+1][col]){
                qt.add(new Pair(row+1,col));
                visited[row+1][col] = true;
            }
            if(col-1>=0 && grid[row][col-1]=='1' && !visited[row][col-1]){
                qt.add(new Pair(row,col-1));
                visited[row][col-1] = true;
            }
            if(col+1<grid[row].length && grid[row][col+1]=='1' && !visited[row][col+1]){
                qt.add(new Pair(row,col+1));
                visited[row][col+1] = true;
            }
        }
    }


}
