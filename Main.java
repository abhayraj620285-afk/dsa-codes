import java.util.*;
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int p=0;p<t;p++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            HashSet<Character> set = new HashSet<>();
            int ans = 0;
            int i=0;
           while(i<s.length()){
               for(int j=0;j<k;j++){
                   char ch = s.charAt(i++);
                   set.add(ch);
               }
//               if(!set.contains()){
//                   ans++;
//                   set.clear();
//               }
           }
            System.out.println(ans);
        }
    }
}
