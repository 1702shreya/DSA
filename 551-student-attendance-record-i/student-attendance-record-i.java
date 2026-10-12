class Solution {
    public boolean checkRecord(String s) {
       
       int a=0;
       int i=0;
       while(i<s.length())

        {
            int l=0;
             if(s.charAt(i)=='A')
        {
            a++;
            i++;
        }
            else if(s.charAt(i)=='P')
            {
                i++;
            }
        while(i<s.length() && s.charAt(i)=='L' )
        {
            l++;
            i++;
        }
        if(l>=3) return false;

        }
        if(a>=2) return false;
        return true;
    }
}