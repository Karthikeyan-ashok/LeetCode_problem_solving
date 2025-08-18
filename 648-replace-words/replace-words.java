class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder ans = new StringBuilder();
        Collections.sort(dictionary);
        for(String s : sentence.split("\\s+"))
        {
            boolean flag = false;
            for(int i=0;i<dictionary.size();i++)
            {
                if(s.startsWith(dictionary.get(i)))
                {
                    ans.append(dictionary.get(i));
                    flag = true;
                    break;
                }
            }

            if(!flag)
            {
                ans.append(s);
            }
            ans.append(" ");
        }

        return ans.toString().trim();
    }
}