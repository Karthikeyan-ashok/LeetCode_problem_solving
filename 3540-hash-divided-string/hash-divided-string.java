class Solution {
    public String stringHash(String s, int k) {
        String ans = "";
        for(int i=0;i<s.length();i+=k)
        {
            String temp = s.substring(i,i+k);
            int sum = 0;
            for(int j=0;j<temp.length();j++)
            {
                sum += temp.charAt(j)-'a';
            }
            sum = sum%26;
            ans += (char)(sum+'a');
        }
        return ans;
    }
}