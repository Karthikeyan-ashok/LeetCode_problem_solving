class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        List<Set<String>> list = new ArrayList();
        for(int i=0;i<responses.size();i++)
        {
            Set<String> temp = new HashSet<>(responses.get(i));
            list.add(temp);
        }
        
        Map<String,Integer> map = new TreeMap<>();
        for(int i=0;i<list.size();i++)
        {
            Set<String> set = list.get(i);
            for(String s : set)
            {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
        }
        String ans = "";
        int n = 0;
        for(String i : map.keySet())
        {
            if(map.get(i)>n)
            {
                ans = i;
                n = map.get(i);
            }
        }
        return ans;
    }
}