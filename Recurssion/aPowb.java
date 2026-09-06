package Recurssion;

public class aPowb {
    static void main() {
        int x = 2;
        int n = -2;
        System.out.println(myPow(x,n));
    }
    public static double myPow(double x,int n){
        if(n==0) return 1;
        if(n==-1) return (double)(1/x);
        double call = myPow(x,n/2);
       if(n%2==0) return call*call;
       if(n<0) return (double)(1/x)*call*call;
       else return x*call*call;
    }
}
