class Solution {
    public int subsetXORSum(int[] nums) {
     int xor=nums[0];
     int y=(int)Math.pow(2,nums.length-1);
      for(int i=1;i<nums.length;i++)
      {
        xor=xor | nums[i];
      }
      return (xor *y );

      
        
    }
}