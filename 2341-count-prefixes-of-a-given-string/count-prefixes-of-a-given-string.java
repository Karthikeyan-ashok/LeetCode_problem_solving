class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(int i=0;i<words.length;i++)
        {
            int len = Math.min(s.length(),words[i].length());
            boolean flag = true;
            for(int j=0;j<len;j++)
            {
                if(s.charAt(j)!=words[i].charAt(j) || s.length()<words[i].length())
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                count++;
            }
        }
        return count;
    }
}