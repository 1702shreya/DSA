class Solution {
    public int numOfSubarrays(int[] arr) {
        int odd=0;
        int even=0;
        int total=0;
        for(int num:arr)
        {
            if(num%2==1)
            {   int temp=odd;
                odd=even+1;
                even=temp;
            }
            else
            {
                even=even+1;
               
            }
            total = (total + odd) % 1_000_000_007;;
        }
        return total;
    }
}