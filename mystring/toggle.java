package mystring;
import java.util.*;
public class toggle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        for(int i=0;i<str.length();i++){

            boolean flag = true;
            // for accessing individual elements.
            char ch = str.charAt(i);
            // typecasting char -> int
            if(ch==' ') continue;
            if(ch>='0' && ch<='9') continue;

            int asci = (int)ch;
            if(asci>=97) flag = false;
            if(flag == true){
                asci+=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
            else{
                asci-=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }

        }
        System.out.println(str);
    }
}
