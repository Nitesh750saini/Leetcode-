class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0;
        for(int val:nums){
          totalsum+=val;  
        }
        int leftsum=0;

        for(int i=0;i<nums.length;i++){
            int rightsum=totalsum-nums[i]-leftsum;
            if(rightsum==leftsum){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}