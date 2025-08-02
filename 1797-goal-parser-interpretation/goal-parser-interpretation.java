class Solution {
    public String interpret(String command) {
        if(command.length()==1)
        {
            if(command.charAt(0)!='(' && command.charAt(0)!=')')
            {
                return command;
            }
        }
        StringBuilder ans = new StringBuilder();
        
        int i = 0;
        while(i<command.length()-1)
        {
            if(command.charAt(i)=='(' && command.charAt(i+1)==')')
            {
                ans.append("o");
                i+=2;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1)!=')')
            {
                i++;
                continue;
            }
            else if(command.charAt(i)==')')
            {
                i++;
                continue;
            }
            else
            {
                ans.append(command.charAt(i));
                i++;
            }
        }
        if(command.length()>1)
        {
            if(command.charAt(command.length()-1)!='('&&command.charAt(command.length()-1)!=')')
            {
                ans.append(command.charAt(command.length()-1));
            }
        }
        return ans.toString();
    }
}