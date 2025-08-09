class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] ans = new int[a.length];
        if(a[0]==b[0])
        {
            ans[0] = 1;
        }
        else
        {
            ans[0] = 0;
        }

        for(int i=1;i<a.length;i++)
        {
            int[] freq = new int[a.length+1];
            for(int j=0;j<=i;j++)
            {
                freq[a[j]]++;
                freq[b[j]]++;
            }
            int count = 0;
            for(int k=0;k<freq.length;k++)
            {
                if(freq[k]==2)
                {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}