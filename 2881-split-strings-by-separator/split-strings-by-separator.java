class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();

        for(String a : words)
        {
            StringBuilder s = new StringBuilder();
            for(char ch : a.toCharArray())
            {
                if(ch==separator)
                {
                    if(!s.isEmpty())
                    {
                        ans.add(s.toString());
                        s = new StringBuilder();
                    }
                }
                else
                {
                    s.append(ch);
                }
            }
            if(!s.equals(separator) && !s.isEmpty())
            {
                ans.add(s.toString());
            }
        }
        return ans;
    }
}