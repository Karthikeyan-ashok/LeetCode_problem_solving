class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>();
        for(String i : nums)
        {
            set.add(i);
        }
        int n = nums.length;

        for(int i=0;i<Math.pow(2,n);i++)
        {
            String a = Integer.toBinaryString(i);
            while(a.length()!=n)
            {
                a = "0"+a;
            }
            if(!set.contains(a))
            {
                return a;
            }
        }
        return "";
    }
}