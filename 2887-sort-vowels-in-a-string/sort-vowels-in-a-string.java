class Solution {
    public String sortVowels(String s) {
        List<Character> list = new ArrayList<>();
        for(char ch : s.toCharArray())
        {
            if("AEIOUaeiou".indexOf(ch)!=-1)
            {
                list.add(ch);
            }
        }
        Collections.sort(list);
        StringBuilder ans = new StringBuilder();
        int k = 0;
        int i;
        for(i=0;i<s.length()||k<list.size();i++)
        {
            if("AEIOUaeiou".indexOf(s.charAt(i))!=-1)
            {
                ans.append(list.get(k++));
            }
            else
            {
                ans.append(s.charAt(i));
            }
        }
        if(i<s.length())
        {
            ans.append(s.substring(i));
        }
        return ans.toString();
    }
}