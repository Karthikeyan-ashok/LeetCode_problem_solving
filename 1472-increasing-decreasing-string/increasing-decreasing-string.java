class Solution {
    public String sortString(String s) {
        Map<Character,Integer> map = new TreeMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int i = 0;
        StringBuilder ans = new StringBuilder();
        while(map.size()>0)
        {
            if(i==0)
            {
                List<Character> keys = new ArrayList<>(map.keySet());
                for(char ch : keys)
                {
                    ans.append(ch);
                    int freq = map.get(ch);
                    map.put(ch,freq-1);
                    if(map.get(ch)==0)
                    {
                        map.remove(ch);
                    }
                }
                i=1;
            }

            StringBuilder temp = new StringBuilder();
            if(i==1)
            {
                List<Character> keys = new ArrayList<>(map.keySet());
                for(char ch : keys)
                {
                    temp.append(ch);
                    int freq = map.get(ch);
                    map.put(ch,freq-1);
                    if(map.get(ch)==0)
                    {
                        map.remove(ch);
                    }
                }
                i=0;
                ans = ans.append(temp.reverse());
            }
        }
        return ans.toString();
    }
}