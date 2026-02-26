package Backtracking;

public class FOUR_DMazePath {
    public static void maze(int sr,int sc,int er,int ec,String s,boolean[][] isVisited){

        if(sc>ec || sr>er) return ;
        if(sr<0 || sc<0) return;
        if(isVisited[sr][sc] == true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // go right
        maze(sr,sc+1,er,ec,s+"R",isVisited);
        // do down
        maze(sr+1,sc,er,ec,s+"D",isVisited);
        // go left
        maze(sr,sc-1,er,ec,s+"L",isVisited);
        // go up
        maze(sr-1,sc,er,ec,s+"U",isVisited);
        isVisited[sr][sc] = false; // BackTracking

    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean[][] isVisited = new boolean[row][col]; // by default it is false
        maze(0,0,row-1,col-1,"",isVisited);
    }
}
