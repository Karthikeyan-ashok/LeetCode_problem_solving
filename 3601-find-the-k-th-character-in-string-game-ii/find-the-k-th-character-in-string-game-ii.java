class Solution {
    public char kthCharacter(long k, int[] ops) {
        long n = 1;
        int step = 0;
        while (n < k) 
        {
            n <<= 1;    
            step++;
        }
        return check(k, step, ops, 0);
    }

    private char check(long k, int step, int[] ops, int shift) {
        if (step == 0) 
        {
            return (char) ('a' + (shift % 26));
        }
        long half = 1L << (step - 1);
        if (k > half)
        {
            k -= half;
            shift += ops[step - 1]; 
        }
        return check(k, step - 1, ops, shift);
    }
}
