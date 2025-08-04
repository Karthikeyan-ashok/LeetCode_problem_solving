class Solution {
    public List<Integer> getRow(int n) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            List<Integer> l1 = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || i==j)
                {
                    l1.add(1);
                }
                else
                {
                    int a = list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    l1.add(a);
                }
            }
            list.add(new ArrayList<>(l1));
        }
        return list.get(n);
    }
}