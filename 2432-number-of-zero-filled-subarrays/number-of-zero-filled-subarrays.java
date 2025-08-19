class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long sum = 0;

        for(int num : nums)
        {
            if(num==0)
            {
                sum++;
                count += sum;
            }
            else
            {
                sum = 0;
            }
        }
        return count;
    }
}