class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
        {
            return "";
        }

        Map<Character,Integer> map = new HashMap<>();
        for(char ch : t.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int i = 0;
        int j = 0;
        int ind = 0;
        int ind2 = 0;
        int min = Integer.MAX_VALUE;

        int n = map.size();
        int count = 0;

        Map<Character,Integer> temp = new HashMap<>();
        while(j<s.length())
        {
            char end = s.charAt(j);
            temp.put(end,temp.getOrDefault(end,0)+1);
            if(map.containsKey(end) && map.get(end).intValue()==temp.get(end).intValue())
            {
                count++;
            }
            while(i<=j && n==count)
            {
                if(j-i+1<min)
                {
                    min = j-i+1;
                    ind = i;
                    ind2 = j+1;
                }
                char ch = s.charAt(i);
                temp.put(ch,temp.getOrDefault(ch,0)-1);
                if(map.containsKey(ch) && temp.get(ch)<map.get(ch))
                {
                    count--;
                }
                i++;
            }
            j++;
        }
        return (min==Integer.MAX_VALUE)?"":s.substring(ind,ind2);
    }
}