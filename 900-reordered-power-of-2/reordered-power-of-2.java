class Solution {
    public boolean reorderedPowerOf2(int n) {
        String a = check(n);
        for(int i=0;i<31;i++)
        {
            int num = 1<<i;
            if(a.equals(check(num)))
            {
                return true;
            }
        }
        return false;
    }
    public String check(int n)
    {
        char[] ch = String.valueOf(n).toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}