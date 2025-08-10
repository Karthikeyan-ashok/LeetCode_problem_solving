class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        double[] res = new double[n - k + 1];
        List<Integer> win = new ArrayList<>(); 
        int start = 0;

        for (int end = 0; end < n; end++) 
        {    
            int pos = Collections.binarySearch(win, nums[end]);
            if (pos < 0) pos = -pos - 1;
            win.add(pos, nums[end]);
            if (end - start + 1 > k) 
            {
                int removePos = Collections.binarySearch(win, nums[start]);
                win.remove(removePos);
                start++;
            }
            if (end - start + 1 == k) 
            {
                if (k % 2 == 1) 
                {
                    res[start] = win.get(k / 2);
                } 
                else 
                {
                    res[start] = ((long)win.get(k / 2) + (long)win.get(k / 2 - 1)) / 2.0;
                }
            }
        }
        return res;
    }
}