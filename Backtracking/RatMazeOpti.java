package Backtracking;

public class RatMazeOpti {
    public static void maze(int sr,int sc,int er,int ec,String s,int[][] maze){
        if(sc>ec || sr>er) return ;
        if(sr<0 || sc<0) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc] == -1) return;
        if(maze[sr][sc]==0) return;
        maze[sr][sc] = -1;
        // go right
        maze(sr,sc+1,er,ec,s+"R",maze);
        // do down
        maze(sr+1,sc,er,ec,s+"D",maze);
        // go left
        maze(sr,sc-1,er,ec,s+"L",maze);
        // go up
        maze(sr-1,sc,er,ec,s+"U",maze);
        maze[sr][sc] = 1; // BackTracking

    }
    public static void main(String[] args) {
        int row = 3;
        int col = 4;
        int[][] maze = {{1,0,1,1},
                {1,1,1,1},
                {1,1,0,1}};

        maze(0,0,row-1,col-1,"",maze);
    }
}
