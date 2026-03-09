package Searching;
import java.util.*;
public class reverse {
    static int reverse(int n){
       int rev = 0;
       while(n>0){
           int rem = n%10;
           rev = rev*10+rem;
           n = n/10;
       }
       return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 139246;
        int ts = 100;
        int sum = 0;
        int count = 1;
        while(n>0){
            int rem = n%100;
            if(count%2!=0){
                sum = sum+rem;
                count++;
            }

            else{
                sum = sum+reverse(rem);
                count++;
            }

            n = n/100;
        }
        System.out.println(sum%100);
    }
}
