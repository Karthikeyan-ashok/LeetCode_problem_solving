class Solution {
    public int minPairSum(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int i = 0;
        int j = nums.length-1;
        Arrays.sort(nums);
        while(i<j)
        {
            int sum = nums[i]+nums[j];
            ans = Math.max(sum,ans);
            i++;
            j--;
        }
        return ans;
    }
}