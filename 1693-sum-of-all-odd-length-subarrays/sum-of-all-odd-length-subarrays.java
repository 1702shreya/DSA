class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int n=arr.length;
       int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int l=(i+1)*(n-i);
            int ol=(int)Math.ceil(l/2.0);
            sum+=arr[i]*ol;
        }
        return sum;
    }
}