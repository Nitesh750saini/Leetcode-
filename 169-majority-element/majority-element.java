class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int pre=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                pre=nums[i];
                

            }
            if(pre==nums[i]){
                count ++;
            }
            else{
                count --;
            }
        }
        return pre ;
    }
}