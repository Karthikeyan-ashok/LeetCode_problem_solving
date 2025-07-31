class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> sset = new HashSet<>();
        
        for(int i : arr)
        {
            Set<Integer> temp = new HashSet<>();
            temp.add(i);
            
            for(int j : sset)
            {
                temp.add(i|j);
            }
            sset = temp;
            set.addAll(sset);
        }
        return set.size();
    }
}