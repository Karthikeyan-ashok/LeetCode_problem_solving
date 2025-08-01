class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        boolean[] ar1 = new boolean[101];
        boolean[] ar2 = new boolean[101];
        boolean[] ar3 = new boolean[101];

        List<Integer> list = new ArrayList<>();

        for(int i : nums1)
        {
            ar1[i] = true;
        }
        for(int i : nums2)
        {
            ar2[i] = true;
        }
        for(int i : nums3)
        {
            ar3[i] = true;
        }

        for(int i=0;i<101;i++)
        {
            if(ar1[i]&&ar2[i] || ar2[i]&&ar3[i] || ar1[i]&&ar3[i])
            {
                list.add(i);
            }
        }
        return list;
    }
}