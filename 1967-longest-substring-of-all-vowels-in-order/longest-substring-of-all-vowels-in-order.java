class Solution {
    public int longestBeautifulSubstring(String word) {
        int max = 0;
        int len = 1;
        int count = 1;
        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i)==word.charAt(i-1))
            {
                len++;
            }
            else if(word.charAt(i)>word.charAt(i-1))
            {
                len++;
                count++;
            }
            else
            {
                len = 1;
                count = 1;
            }

            if(count==5)
            {
                max = Math.max(max,len);
            }
        }
        return max;
    }
}