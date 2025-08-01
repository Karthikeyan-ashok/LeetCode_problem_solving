class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];

        for(int i : nums)
        {
            freq[i]++;
        }

        int pair = 0;
        int no_pair = 0;

        for(int i : freq)
        {
           pair += i/2;
           no_pair += i%2;
        }

        return new int[]{pair,no_pair};
    }
}