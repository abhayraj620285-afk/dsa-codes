package Backtracking;

public class RatInMaze {
    public static void maze(int sr,int sc,int er,int ec,String s,int[][] maze,boolean[][] isVisited){
        if(sc>ec || sr>er) return ;
        if(sr<0 || sc<0) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(isVisited[sr][sc] == true) return;
        if(maze[sr][sc]==0) return;
        isVisited[sr][sc] = true;
        // go right
        maze(sr,sc+1,er,ec,s+"R",maze,isVisited);
        // do down
        maze(sr+1,sc,er,ec,s+"D",maze,isVisited);
        // go left
        maze(sr,sc-1,er,ec,s+"L",maze,isVisited);
        // go up
        maze(sr-1,sc,er,ec,s+"U",maze,isVisited);
        isVisited[sr][sc] = false; // BackTracking

    }
    public static void main(String[] args) {
        int row = 3;
        int col = 4;
        int[][] maze = {{1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}};
        boolean[][] isVisited = new boolean[row][col]; // by default it is false
        maze(0,0,row-1,col-1,"",maze,isVisited);
    }
}
