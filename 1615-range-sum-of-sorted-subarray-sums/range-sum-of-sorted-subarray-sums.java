class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Long> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            long sum = nums[i];
            list.add(sum);
            for(int j=i+1;j<n;j++)
            {
                sum += nums[j];
                list.add(sum);
            }
        }
        Collections.sort(list);

        long sum = 0;
        int mod = 1000000007;

        for(int i=left;i<=right;i++)
        {
            sum = (sum+list.get(i-1))%mod;
        }
        return (int)sum;
    }
}