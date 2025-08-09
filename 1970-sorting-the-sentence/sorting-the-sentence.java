class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split("\\s+");
        int num[] = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            num[i] = arr[i].charAt(arr[i].length()-1)-'0';
        }
        Map<Integer,String> map = new TreeMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(num[i],arr[i]);
        }

        StringBuilder ans = new StringBuilder();
        for(int i : map.keySet())
        {
            StringBuilder temp = new StringBuilder(map.get(i));
            ans.append(temp.deleteCharAt(temp.length()-1)).append(" ");
        }
        return ans.toString().trim();
    }
}