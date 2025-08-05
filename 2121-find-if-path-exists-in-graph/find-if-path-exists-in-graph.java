class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<edges.length;i++)
        {
            map.putIfAbsent(edges[i][0],new ArrayList<>());
            map.putIfAbsent(edges[i][1],new ArrayList<>());
            map.get(edges[i][0]).add(edges[i][1]);
            map.get(edges[i][1]).add(edges[i][0]);
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[n];
        q.add(s);
        visit[s] = true;
        while(!q.isEmpty())
        {
            int i = q.remove();
            if(i==d)
            {
                return true;
            }
            if(map.containsKey(i))
            {
                for(int j : map.get(i))
                {
                    if(!visit[j])
                    {
                        q.add(j);
                        visit[j] = true;
                    }
                }
            }
        }
        return false;
    }
}