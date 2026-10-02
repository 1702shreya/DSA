class Solution {
    public int digitFrequencyScore(int n) {
        int[] f=new int[10];
        
        while(n!=0)
        {
            int rem=n%10;
            f[rem]+=1;
            n=n/10;
        }
        int s=0;
        for(int i=0;i<10;i++)
        {
            s+=i*f[i];
        }
        return s;
    }
}