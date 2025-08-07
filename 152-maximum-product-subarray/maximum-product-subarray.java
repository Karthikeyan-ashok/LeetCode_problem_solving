class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int max = nums[0];
        int min = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            int temp = nums[i];
            int maxp = max;

            max = Math.max(temp,Math.max(temp*max,temp*min));
            min = Math.min(temp,Math.min(temp*maxp,temp*min));

            ans = Math.max(ans,max);
        }
        return ans;
    }
}