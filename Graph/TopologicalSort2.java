package Graph;
import java.util.*;
// TOPOLOGICAL SORT USING DFS

public class TopologicalSort2 {
    public int[] findOrder(int numCourses, int[][] prerequisites){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        int[] ans = new int[numCourses];
        for(int i = 0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for (int[] prerequisite : prerequisites) {
            int u = prerequisite[0];
            int v = prerequisite[1];
            adj.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer> qt = new LinkedList<>();
       for(int i=0;i<indegree.length;i++){
           if(indegree[i]==0){
               qt.add(i);
           }
       }
       int k = 0;
       while(!qt.isEmpty()){
           int x = qt.remove();
           ans[k++] = x;
           for(int ele : adj.get(x)){
               if(indegree[ele]!=0){
                   indegree[ele]--;
               }
               if(indegree[ele]==0){
                   qt.add(ele);
               }
           }
       }
       return ans;
    }



    public boolean dfs(int i,ArrayList<Integer> list ,ArrayList<ArrayList<Integer>> adj, boolean [] visited,boolean [] cycle){
        visited[i]=true;
        for(int ele : adj.get(i)){
            dfs(ele,list,adj,visited,cycle);
        }
        list.add(i);
        return true;
    }

    public int[] findOrder1(int numCourses, int[][] prerequisites){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edges : prerequisites){
            int u = edges[0];
            int v = edges[1];
            adj.get(u).add(v);
        }
        int[] ans = new int[numCourses];
        ArrayList<Integer> list = new ArrayList<>();
        boolean [] visited = new boolean[numCourses];
        boolean [] cycle = new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(dfs(i,list,adj,visited,cycle)){
                    return new int[0];
                }
            }
        }
        Collections.reverse(list);
        int k = 0;
        for(int i=0;i<list.size();i++){
            ans[k++] = list.get(i);
        }
        return ans;
    }
}
