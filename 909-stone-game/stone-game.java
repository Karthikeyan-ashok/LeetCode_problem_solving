class Solution {
    public boolean stoneGame(int[] piles) {
        int total = 0;
        for(int i : piles)
        {
            total += i;
        }
        int sum = 0;
        for(int i=0;i<piles.length;i+=2)
        {
            sum += piles[i];
        }

        return sum>total-sum || total-sum>sum;
    }
}