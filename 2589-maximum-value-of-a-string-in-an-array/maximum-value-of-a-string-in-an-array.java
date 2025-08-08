class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(String s : strs)
        {
            boolean flag = false;
            for(char ch : s.toCharArray())
            {
                if(Character.isLetter(ch))
                {
                    flag = true;
                }
            }
            if(flag)
            {
                max = Math.max(max,s.length());
            }
            else
            {
                max = Math.max(max,Integer.parseInt(s));
            }
        }
        return max;
    }
}