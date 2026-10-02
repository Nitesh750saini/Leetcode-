class Solution {
    public int mySqrt(int x) {
        int low=1;
        int high=x;
        int mid=0;
        int ans=0;
        if(x<=0){
            return x;
        }
       while(low<=high){
        mid=low+(high-low)/2;
        if(mid>x/mid){
                high=mid-1;
        }
        else{
            ans=mid;
            low=mid+1;
        }
        }
        return ans;
    }
}