class Solution {
    public int findJudge(int n, int[][] trust) 
    {
        int[] arr = new int[n+1];
        int people = 0;
        int judge = 0;
        for(int[] i : trust)
        {
            people = i[0];
            judge = i[1];
            arr[people]--;
            arr[judge]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(arr[i] == n-1)
            {
                return i;
            }
        }
        return -1;
    }
}