class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int start = 0, end = 0;
        int max = Math.min(s.length(),1);
        Set <Character> set = new HashSet<>();
        while(end<s.length())
        {
            char temp = s.charAt(end);
            while(set.contains(temp))
            {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(temp);
            int len = end-start+1;
            max = Math.max(len,max);
            end++;
        }
        return max;
    }
}