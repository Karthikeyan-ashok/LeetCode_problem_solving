class Solution {
    public void dfs(int i,boolean[]visited,int[][]arr)
    {
        visited[i] = true;
        for(int j=0;j<arr.length;j++)
        {
            if(!visited[j] && arr[i][j]==1)
            {
                dfs(j,visited,arr);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for(int i=0;i<isConnected.length;i++)
        {
            if(!visited[i])
            {
                dfs(i,visited,isConnected);
                count++;
            }
        }   
        return count;
    }
}