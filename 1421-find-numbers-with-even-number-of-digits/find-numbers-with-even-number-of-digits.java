class Solution {
    public int findNumbers(int[] nums) {
        int count =0;
        for(int val:nums){
            int temp=val;
            int  digit=0;
            while(temp!=0){
               int  rem=temp%10;
                digit++;
                temp=temp/10;


            }
            if(digit%2==0){
                count ++;
            }
        }
        return count;
    }
}