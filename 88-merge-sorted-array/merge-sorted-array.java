class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        ArrayList<Integer> l=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<m && j<n)
        {
            if(nums1[i]<=nums2[j])
            {
                l.add(nums1[i]);
                i++;
            }
            else
         {   l.add(nums2[j]);
            j++;
        }
        }
        while(j<n)
         {
            l.add(nums2[j]);
         j++;
        }
        while(i<m)
        {
            l.add(nums1[i]);
            i++;
        }
        for(int k=0;k<nums1.length;k++)
        {
            nums1[k]=l.get(k);
        }
        
    }
}