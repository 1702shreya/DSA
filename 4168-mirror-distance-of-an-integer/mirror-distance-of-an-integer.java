class Solution {
    public int mirrorDistance(int n) {
        int s=n;
        int num=0;
        while(s!=0)
        {
                int rem=s%10;
                s/=10;
                num=num*10+rem;
        }
        return Math.abs(n-num);
    }
}