class Solution {
    public boolean checkEqualPartitions(int[] nums, long target) {
        return check(0,1,1,nums,target);
    }
    public boolean check(int i,long a,long b,int[] nums,long target)
    {
        if(a>target || b>target)
        {
            return false;
        }
        if(i==nums.length)
        {
            return a==target && b==target;
        }
        boolean b1 = check(i+1,a*nums[i],b,nums,target);
        boolean b2 = check(i+1,a,b*nums[i],nums,target);

        return b1||b2;
    }
}