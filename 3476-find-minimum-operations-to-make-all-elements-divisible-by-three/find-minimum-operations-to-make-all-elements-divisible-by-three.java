class Solution {
    public int minimumOperations(int[] nums) {
        int op=0;
        for(int i=0;i<nums.length;i++)
        {int min=Math.min(nums[i]%3,3-(nums[i]%3));
            op+=min;
        }
        return op;
    }
}