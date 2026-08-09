class Solution {
    public int[] runningSum(int[] nums) {
    for(int i=nums.length-1;i>=0;i--)
    { int j=0;
        while(j<i)
        {nums[i]+=nums[j];
        j++;
        }

    }
    return nums;
    }
}