class Solution {
    public boolean stoneGame(int[] piles) {
        int total = 0;
        for(int i : piles)
        {
            total += i;
        }
        int frontSum = 0;
        for(int i=0;i<piles.length;i+=2)
        {
            frontSum += piles[i];
        }

        // int backSum = 0;
        // for(int i=piles.length-1;i>=0;i-=2)
        // {
        //     backSum += piles[i];
        // }

        return frontSum>total-frontSum || total-frontSum>frontSum;
    }
}