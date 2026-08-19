class Solution {
    public boolean isPowerOfFour(int n) {
         int b=0;
        while(Math.pow(4,b)<=n)
        {
            if(Math.pow(4,b)==n)
             {   
                return true;
             }
            b++;    
        }
        return false;
    }
}