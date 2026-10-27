class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> a =new ArrayList<>();
        int i=nums[0]; //1
        int c=0;
        while(c<nums.length)
        {
            if(nums[c]!=i)
            {
                a.add(i);

            }
            else
            {
                c++;
            }
           i++;
        }
        return a;
    }
}