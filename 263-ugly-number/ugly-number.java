class Solution {
    public boolean isUgly(int n) {
        int f[] ={2,3,5};
        if(n<=0) return false;
        for(int fact:f)
        {
         while(n%fact==0)
         {
            n/=fact;
         }
         
        }
       return n==1;
    }
}