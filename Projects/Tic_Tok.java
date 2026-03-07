package Projects;
import java.util.Scanner;
public class Tic_Tok {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        while(!gameOver){
            printBoard(board);
            System.out.println("Player " + player +" enter: ");
            int row = sc.nextInt();
            int cols = sc.nextInt();
            if (board[row][cols] == ' ') {
                board[row][cols] = player;
                gameOver = haveWon(board,player);
                if (gameOver) {
                    System.out.println("Player " + player + " has won.");
                }else{
//                    if (player == 'X') {
//                        player = 'O';
//                    }else{
//                        player = 'X';
//                    }
                    player = (player == 'X') ? 'O' : 'X';
                }
            }else{
                System.out.println("Invalid move. Try again!");
            }
        }
        printBoard(board);
    }
    static boolean haveWon(char[][] board, char player){
        //check for rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        //check for column
        for (int j = 0; j < board.length; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
//        check for diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
    static void printBoard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
        }
    }
}