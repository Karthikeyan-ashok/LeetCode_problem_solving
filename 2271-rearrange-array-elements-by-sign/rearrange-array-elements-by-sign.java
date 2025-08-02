class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int[nums.length];
        int k = 0;
        for(int i=0;i<nums.length&&k<arr.length;i++)
        {
            if(nums[i]>=0)
            {
                arr[k] = nums[i];
                k+=2;
            }
        }
        k = 1;
        for(int i=0;i<nums.length&&k<arr.length;i++)
        {
            if(nums[i]<0)
            {
                arr[k] = nums[i];
                k+=2;
            }
        }
        return arr;
    }
}