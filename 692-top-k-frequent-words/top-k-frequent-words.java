class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new TreeMap<>();
        for(String word : words)
        {
            map.put(word,map.getOrDefault(word,0)+1);
        }

        List<String> list = new ArrayList<>();

        while(k>0)
        {
            int max = 0;
            String str = "";
            for(String word : map.keySet())
            {
                if(map.get(word)>max)
                {
                    max = map.get(word);
                    str = word;
                }
            }
            list.add(str);
            map.remove(str);
            k--;
        }
        return list;
    }
}