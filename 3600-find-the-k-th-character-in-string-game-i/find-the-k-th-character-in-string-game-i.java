class Solution {
    public char check(int k,int step)
    {
        if(step==0)
        {
            return 'a';
        }
        else
        {
            int half = 1<<step-1;
            if(k>half)
            {
                char res = check(k-half,step-1);
                res = res=='z'?'a':(char)(res+1);
                return res;
            }
            else
            {
                return check(k,step-1);
            }
        }
    }
    public char kthCharacter(int k) {
        int step = 0;
    
        while((1<<step)<k)
        {
            step++;
        }

        return check(k,step);
    }
}