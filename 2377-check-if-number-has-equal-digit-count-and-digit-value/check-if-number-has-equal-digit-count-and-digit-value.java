class Solution {
    public boolean digitCount(String num) {
        int freq[] = new int[11];

        for(char ch : num.toCharArray())
        {
            freq[ch-'0']++;
        }

        for(int i=0;i<num.length();i++)
        {
            if(freq[i]!=num.charAt(i)-'0')
            {
                return false;
            }
        }
        return true;
    }
}