class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int w_len = words[0].length();
        int total_len = w_len*words.length;
        if(s.length()<total_len)
        {
            return ans;
        }

        List<String> list = new ArrayList<>(Arrays.asList(words));
        Collections.sort(list);
        for(int i=0;i<=s.length()-total_len;i++)
        {
            List<String> temp = new ArrayList<>();
            int ind = i;
            for(int j=0;j<words.length;j++)
            {
                temp.add(s.substring(ind,ind+w_len));
                ind += w_len;
            }
            Collections.sort(temp);
            if(temp.equals(list))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}