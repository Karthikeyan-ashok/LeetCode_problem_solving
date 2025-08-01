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
            int n = i/2;
            int r = i%2;
            while(n>0)
            {
                pair++;
                n--;
            }
            if(r==1)
            {
                no_pair++;
            }
        }

        return new int[]{pair,no_pair};
    }
}