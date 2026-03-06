package mystring;
import java.util.*;
public class panindrome {
//
public static void main(String[] args) {
    String str = "abad";
//    StringBuilder gtr = new StringBuilder(str);
//    gtr.reverse();
//    // hacks
//    String s = gtr+"";
//    if(str.equals(s)){
//        System.out.println("palindrome");
//    }
//    else{
//        System.out.println("not palindrome");
//    }

    int i=0;
    int j=str.length()-1;
    while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
            System.out.println("not palindrome");
            break;
        }
        i++;
        j--;
    }
    System.out.println("palindrome");


  }
}
