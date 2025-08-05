class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(new ArrayList<>());
        }
        for(List<Integer> l : edges)
        {
            list.get(l.get(0)).add(l.get(1));
        }

        boolean[] visited = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                dfs(list,i,visited);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                ans.add(i);
            }
        }
        return ans;
    }
    public void dfs(List<List<Integer>> list , int i , boolean[] visited)
    {
        for(int k : list.get(i))
        {
            if(!visited[k])
            {
                visited[k] = true;
                dfs(list,k,visited);
            }
        }
    }
}