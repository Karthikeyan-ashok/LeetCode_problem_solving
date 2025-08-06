class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int cmax = nums[0];
        int max = nums[0];

        int cmin = nums[0];
        int min = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            cmax = Math.max(nums[i],cmax+nums[i]);
            max = Math.max(cmax , max);

            cmin = Math.min(nums[i],cmin+nums[i]);
            min = Math.min(cmin,min);
        }
        return Math.max(Math.abs(max),Math.abs(min));
    }
}