class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> map = new HashMap<>();
        char a = 'a';
        for(char ch : key.toCharArray())
        {
            if(!map.containsKey(ch) && ch!=' ')
            {
                map.put(ch,a);
                a++;
            }
            else
            {
                continue;
            }
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : message.toCharArray())
        {
            if(ch==' ')
            {
                ans.append(" ");
            }
            else
            {
                ans.append(map.get(ch));
            }
        }
        return ans.toString();
    }
}