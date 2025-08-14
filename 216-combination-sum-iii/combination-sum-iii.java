class Solution {
    public void combination(List<List<Integer>> list, List<Integer> temp,int k,int n,int ind)
    {
        if(n<0)
        {
            return;
        }
        if(temp.size()==k && n==0)
        {
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<=9;i++)
        {
            temp.add(i);
            combination(list,temp,k,n-i,i+1);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        combination(list,new ArrayList<>(),k,n,1);
        return list;
    }
}