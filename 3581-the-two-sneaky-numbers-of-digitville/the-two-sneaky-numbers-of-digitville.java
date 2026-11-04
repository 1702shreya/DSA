class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int a[] =new int[2];
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
             {a[c]=nums[i];
                c++;
             }          
           
        }
        return a;
    }
}