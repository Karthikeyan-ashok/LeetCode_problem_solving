class Solution {
    
    public static int subSetSum(int [] nums, int sum){
        int n = nums.length;
        int [][]dp = new int[n+1][sum+1];

        for(int i = 0; i <n+1; i++){
            dp[i][0] = 1;
        }

        for(int i=1; i<n+1; i++)
        {
            for(int j=0; j<sum+1; j++)
            {
                if(nums[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];
                } 
                else 
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) 
        {
            sum += num;
        }

        if (sum < Math.abs(target) || (target + sum) % 2 != 0)
        {
            return 0;
        }

        int s1 = (target + sum) / 2;
        return subSetSum(nums, s1);  
    }
}