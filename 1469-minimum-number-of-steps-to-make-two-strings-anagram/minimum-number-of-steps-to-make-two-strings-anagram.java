class Solution {
    public int minSteps(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray())
        {
            if(map.containsKey(ch) )
            {
                if(map.get(ch)!=0)
                {
                    int i = map.get(ch);
                    map.put(ch,i-1);
                }
            }
        }
        int sum = 0;
        for(char i : map.keySet())
        {
            sum += map.get(i);
        }
        return sum;
    }
}