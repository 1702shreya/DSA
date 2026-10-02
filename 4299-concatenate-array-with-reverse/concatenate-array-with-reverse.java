class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] a=new int[2*nums.length];
        int i=0;
        while(i<nums.length)
        {
            a[i]=nums[i];
            i++;
        }
        int j=1;
        while(i<a.length)
        {
            a[i]=nums[i-j];
            i++;
            j+=2;

        }
        return a;
    }
}