class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int rem = 0;
        int pos = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            rem = Math.max(rem,i+nums[i]);
            if(i==pos)
            {
                count++;
                pos = rem;
            }
            if(pos>=nums.length-1)
            {
                break;
            }
        }
        return count;
    }
}