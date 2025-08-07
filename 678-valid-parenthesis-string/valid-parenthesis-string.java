class Solution {
    public boolean checkValidString(String s) {
        return fun(s);
    }
    public boolean fun(String s)
    {
        int min =0; 
        int max =0;
         for(int i =0 ;i < s.length(); i++)
         {
            if(s.charAt(i) == '(')
            {
                min++;
                max++;
            }
            else if(s.charAt(i) ==')')
            {
                min--;
                max--;
            }
            else
            {
                min -=1;
                max++;
                
            }
             if(min < 0)
                {
                    min=0;
                }
                if(max <0)
                {
                    return false;
                }
         }
        

         return (min ==0);
    }
}