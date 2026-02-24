package Graph;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class AdjanceyList {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vertices");
        int v = sc.nextInt();
        System.out.println("Enter edges");
        int e = sc.nextInt();
        List<List<Integer>> ajd = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            ajd.add(new ArrayList<>());
        }
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            ajd.get(a).add(b);
            ajd.get(b).add(a);
        }

        for(int i=0;i<v;i++){
            System.out.println(i + ":");
            for(int j=0;j<ajd.get(i).size();j++){
                System.out.print( ajd.get(i).get(j));
            }
        }
        Queue<Integer> qt = new LinkedList<>();
        int[] status = new int[v];

        qt.add(0);
        qt.remove();
        status[0] = 1;
        while(qt.size()>0){
            int x = qt.remove();

            for(int i=0;i<ajd.get(x).size();i++){
                int y = ajd.get(x).get(i);
                if(status[y]==0){
                    status[y]=1;
                    qt.add(y);
                }
            }
        }
        Queue<Integer> qt1 = new LinkedList<>();
        int[] check = new int[ajd.size()];
        Arrays.fill(check, -1);
        qt1.add(3);
        status[3] = 0;
        while(qt.size()>0){
            int x = qt.remove();
            for(int i=0;i<ajd.get(x).size();i++){
                int y = ajd.get(x).get(i);
                if(check[y]==-1){
                    check[y] = check[y]+1;
                }
                qt1.add(y);
            }
        }




    }
}
