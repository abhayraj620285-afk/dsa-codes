package Backtracking;
import java.util.*;
public class nQueens {

    private static void nQueen(char[][] board, int row) {
        int n = board.length;
        if(row==n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                nQueen(board,row+1);
                board[row][j] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        // for Rows
        for(int i=0;i<n;i++){
            if(board[row][i]=='Q') return false;
        }
        // for col
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        // check for northeast
        int i = row;
        int j = col;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        // chech for southeast
         i = row;
         j = col;
         while(i<n && j<n){
             if(board[i][j]=='Q') return false;
             i++;
             j++;
         }
        // chech for northwest
        i = row;
        j = col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        // chech for southwest
        i = row;
        j = col;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        return true;


    }


    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        nQueen(board,0);
    }

}
