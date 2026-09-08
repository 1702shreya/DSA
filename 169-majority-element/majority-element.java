class Solution {
    public int majorityElement(int[] nums) {
         int count=0;
         int p=0;
       for(int num:nums)
       {
          if(count==0){
            p=num;
       }
          if(num==p)
            count++;
          else
            count--;
            
       }
       return p;
    }
}