package Backtracking;
import java.util.*;
public class mazePath {
    public static int count(int sr,int sc,int er,int ec){
    if(sr>er||sc>ec) return 0;
    //if(sr==er && sc==ec) return 1;
    return 1+ count(sr+1,sc,er,ec) + count(sr,sc+1,er,ec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 2;
        int col = 2;
        int count = count(1,1,2,2);
        System.out.println(count);
    }
}
