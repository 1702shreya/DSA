class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length];
        int i=0;
        while(i<ans.length)
        {
            if(i<nums.length)
            {
                ans[i]=nums[i];
               
            }
            else
            {
                ans[i]=nums[i-nums.length];

            }
             i++;
        }
        return ans;
    }
}