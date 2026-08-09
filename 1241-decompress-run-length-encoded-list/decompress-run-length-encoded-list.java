class Solution {
    public int[] decompressRLElist(int[] nums) {
       int totalSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            totalSize += nums[i];
        }
        int[] ans=new int[totalSize];
        int j=0;
        for(int i=0;i<nums.length;i+=2)
        {int c=1;
        
            while(c<=nums[i])
            {
               ans[j]=nums[i+1];
               j++;
                c++;
            }
        }
        return ans;
    }
}