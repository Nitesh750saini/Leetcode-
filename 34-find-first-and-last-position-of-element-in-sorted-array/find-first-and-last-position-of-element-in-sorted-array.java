class Solution {
    public int lowbound (int []nums,int target ){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(nums[mid]>=target){
                ans=mid ;
                e=mid-1;
            }
            else{
                s=mid+1;

            }
        }   
        return ans ;

    }

    public int upbound (int []nums,int  target){
        int s=0;
        int e=nums.length-1;
        int ans =-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<=target){
                ans=mid;
                s=mid+1;

            }
            else{
                e=mid-1;
            }
            
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first =lowbound(nums , target);
        if (first == -1 || nums[first] != target) {
            return new int[]{-1, -1};
        }
        int last =upbound(nums,target);
        return new int []{first,last};
    }
}