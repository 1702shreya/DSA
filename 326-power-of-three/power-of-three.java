class Solution {
    public boolean isPowerOfThree(int n) {
        int b=0;
        while(Math.pow(3,b)<=n)
        {
            if(Math.pow(3,b)==n)
             {   
                return true;
             }
            b++;    
        }
        return false;
    }
}