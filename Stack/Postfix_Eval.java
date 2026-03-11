package Stack;
import java.util.*;
public class Postfix_Eval {
    public static void main(String[] args) {
        String str = "532^*42/+";
        Stack<Integer> val = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }else{
                int v2 = val.pop();
                int v1 = val.pop();
                if(ch=='+') val.push(v1+v2);
                if(ch=='-') val.push(v1-v2);
                if(ch=='*') val.push(v1*v2);
                if(ch=='/') val.push(v1/v2);
                if(ch=='^') val.push((int)Math.pow(v1, v2));
                // used (int) because Math.pow gives only double value.
            }
        }
        System.out.println(val.peek());
    }
}
