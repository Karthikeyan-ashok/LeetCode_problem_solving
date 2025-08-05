class Solution {
    public int findCenter(int[][] edges) {
        // Map<Integer,List<Integer>> map = new HashMap<>();

        // for(int i=0;i<edges.length;i++)
        // {
        //     map.putIfAbsent(edges[i][0],new ArrayList<>());
        //     map.putIfAbsent(edges[i][1],new ArrayList<>());

        //     map.get(edges[i][0]).add(edges[i][1]);
        //     map.get(edges[i][1]).add(edges[i][0]);
        // }
        // int n = 0;
        // for(int i : map.keySet())
        // {
        //     if(map.get(i).size()==edges.length)
        //     {
        //         n = i;
        //         break;
        //     }
        // }
        // return n;
        int[]a = edges[0];
        int[]b = edges[1];
        if(a[0]==b[0] || a[0]==b[1])
        {
            return a[0];
        }
        else
        {
            return a[1];
        }
    }
}