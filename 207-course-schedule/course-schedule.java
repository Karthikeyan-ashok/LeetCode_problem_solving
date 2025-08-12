class Solution {
    List<List<Integer>> adj=new ArrayList<>();
    public void addEdge(int n, int[][] p)
    {
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[]a:p)
        {

            adj.get(a[1]).add(a[0]);
        }
    }
    public boolean dfs(int i, boolean[] visited, boolean[] pathvisited){
        visited[i]=true;
        pathvisited[i]=true;

        for(int a:adj.get(i))
        {
            if(!visited[a])
            {
                if(dfs(a,visited,pathvisited))return true;
            }
            else if(pathvisited[a])
            {
                return true;
            }
        }
        pathvisited[i]=false;
        return false;
    }
    
    public boolean canFinish(int n, int[][] p) {
        adj.clear();
        addEdge(n,p);
        
        boolean[]visited=new boolean[n];
        boolean[]pathvisited=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if (!visited[i])
            { 
                if (dfs(i, visited, pathvisited)) return false;
            }
        }
        return true;
    }
}