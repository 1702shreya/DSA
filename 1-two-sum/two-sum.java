class Solution {
    public int[] twoSum(int[] nums, int target) {
    
       
        for(int i=0;i<nums.length;i++)
        {int j=0;
            while(j<nums.length)
            {
                if(nums[i]+nums[j]==target && i!=j)
                {
                    return new int[]{i,j};
                }
                else 
                j++;
            }
        }
        return new int[]{};
    }
}