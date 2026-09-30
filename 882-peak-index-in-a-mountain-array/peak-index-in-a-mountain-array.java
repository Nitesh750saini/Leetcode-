class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int n=arr.length;
        int high=   n-1;
        int mid=0;
        int ans=0;

        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1]){
                low=mid+1;

            }
             else{
                //  else case mei hamra mid>=mid-1;
                ans=mid;
                high=mid-1;

            }
        }
        return ans;
    }
}