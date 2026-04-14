package Graph;
import java.util.*;
public class EventualSafeState {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        // REVERSE GRAPH
        int[] indegree = new int[n];
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<graph.length;i++) adj.add(new ArrayList<>());
        for(int i=0;i<graph.length;i++){
            for(int ele : graph[i]){
                adj.get(ele).add(i);
                indegree[i]++;
            }
        }
        // APPLYING KAHN'S ALGO
        Queue<Integer> qt = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) qt.add(i);
        }
        while(!qt.isEmpty()){
            int x = qt.remove();
            ans.add(x);
            for(int ele : adj.get(x)){
                if(indegree[ele]!=0){
                    indegree[ele]--;
                }
                if(indegree[ele]==0){
                    qt.add(ele);
                }
            }

        }
        Collections.sort(ans);
        return ans;
    }
}
