class Solution {
    public boolean equalFrequency(String word) {
       int[] freq = new int[26];
       for(char ch : word.toCharArray())
       {
            freq[ch-'a']++;
       } 
       for(char ch : word.toCharArray())
       {
            freq[ch-'a']--;
            if(check(freq))
            {
                return true;
            }
            freq[ch-'a']++;
       }
       return false;
    }
    public boolean check(int[] ch)
    {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i : ch)
        {
            if(i==0)
            {
                continue;
            }
            max = Math.max(i,max);
            min = Math.min(i,min);
        }
        return max==min;
    }
}