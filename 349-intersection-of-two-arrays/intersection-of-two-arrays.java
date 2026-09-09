class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer> set1=new HashSet<>();
       HashSet<Integer> i=new HashSet<>();
      for(int num: nums1)
      {
        set1.add(num);
      }
      for(int num:nums2)
      {
        if(set1.contains(num))
        {
            i.add(num);
        }
      }
      int[] r= new int[i.size()];
      int j=0;
      for(int n:i)
      {
        r[j]=n;
        j++;
      }
      return r;
    }
}