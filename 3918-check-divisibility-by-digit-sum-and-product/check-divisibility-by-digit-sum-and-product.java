class Solution {
    public boolean checkDivisibility(int n) {
        int d = n;
        int sum = 0;
        int prod = 1;
        while(d!=0)
        {
            int rem = d%10;
            sum += rem;
            prod *= rem;
            d /= 10;
        }

        int a = sum+prod;
        return n%a==0;
    }
}