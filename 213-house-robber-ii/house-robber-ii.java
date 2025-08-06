class Solution {
    public int rob(int[] nums) {
       if(nums.length==0)
       {
            return 0;
       } 
       if(nums.length==1)
       {
            return nums[0];
       }
        return Math.max(check(nums,0,nums.length-2),check(nums,1,nums.length-1));
    }
    public int check(int[] nums,int s, int e)
    {
        int n = e-s+1;
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return nums[s];
        }
        int dp[] = new int[n];
        dp[0] = nums[s];
        dp[1] = Math.max(nums[s],nums[s+1]);
        for(int i=2;i<n;i++)
        {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[s+i]);
        }
        return dp[n-1];
    }
}