class Solution {
    public int numIslands(char[][] grid) 
    {
        int count = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    bfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void bfs(int i, int j, char[][] grid)
    {
        Queue<int[]> q = new LinkedList<>();
        int a[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        q.add(new int[]{i,j});
        grid[i][j] = '0';

        while(!q.isEmpty())
        {
            int temp[] = q.poll();
            for(int d[] : a)
            {
                int x = temp[0]+d[0];
                int y = temp[1]+d[1];
                if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && grid[x][y]=='1')
                {
                    q.add(new int[]{x,y});
                    grid[x][y] = '0';
                }
            }
        }
    }
}