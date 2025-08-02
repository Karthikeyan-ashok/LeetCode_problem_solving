class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2,s.length());
        
        int i = 0;
        for(char ch : a.toCharArray())
        {
            if("AEIOUaeiou".indexOf(ch)!=-1)
            {
                i++;
            }
        }

        for(char ch : b.toCharArray())
        {
            if("AEIOUaeiou".indexOf(ch)!=-1)
            {
                i--;
            }
        }
        return i==0;
    }
}