package Recurssion;

public class T_hanoi {
    static void hanoi(int n,char src,char hlper,char des){
        if(n==0) return ;
        // n-1 disk from A to B via c
        hanoi(n-1,src,des,hlper);
        // largest disk from A to c
        System.out.println(src+"->"+ des);
        //n-1 disk from B to C via A
        hanoi(n-1,hlper,src,des);
    }



    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
}
