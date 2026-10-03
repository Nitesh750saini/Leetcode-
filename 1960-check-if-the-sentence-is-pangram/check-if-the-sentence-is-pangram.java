class Solution {
    public boolean checkIfPangram(String sentence) {
        int[]arr=new int[26];
        for(int i=0;i<sentence.length();i++){
            int idx=sentence.charAt(i)-'a';
            arr[idx]++;
        }
            for(int k=0;k<26;k++){
                if(arr[k]==0){
                    return false;
                }
            }
        
        return true;
    }
}