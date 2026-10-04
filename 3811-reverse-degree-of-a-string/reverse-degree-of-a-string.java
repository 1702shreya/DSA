class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=1;i<=s.length();i++)
        {  int t=i*(123-s.charAt(i-1));
            sum+=t;
            
        }
        return sum;
    }
}