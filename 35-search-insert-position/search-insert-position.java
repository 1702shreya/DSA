class Solution {
    public int searchInsert(int[] arr, int tar) {


        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
           // int mid=(start+end)/2; 
           //start+end can become greater then int limit so follow below
            int mid=start+(end-start)/2;
            if(tar<arr[mid])
            {
                end=mid-1;
            }
            else if(tar>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }

        }

        return start;

    }
}