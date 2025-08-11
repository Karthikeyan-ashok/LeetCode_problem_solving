class Solution {
    public boolean isMatch(String s, String p) {
        boolean[] dp = new boolean[p.length()+1];
        dp[0] = true;
        for(int i=1;i<=p.length();i++)
        {
            if(p.charAt(i-1)=='*')
            {
                dp[i] = dp[i-1];
            }
        }

        for(int i=1;i<=s.length();i++)
        {
            boolean[] temp = new boolean[p.length()+1];
            for(int j=1;j<=p.length();j++)
            {
                char a = s.charAt(i-1);
                char b = p.charAt(j-1);
                if(b=='*')
                {
                    temp[j] = temp[j-1] || dp[j];
                }
                else if(b=='?' || a==b)
                {
                    temp[j] = dp[j-1];
                }
            }
            dp = temp;
        }
        return dp[p.length()];
    }
}