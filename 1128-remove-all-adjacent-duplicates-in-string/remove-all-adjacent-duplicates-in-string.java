class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char chr=s.charAt(i);

        
        if(ans.length()>0&&ans.charAt(ans.length()-1)==chr){
            ans.deleteCharAt(ans.length()-1);

        }
        else{
            ans.append(chr);
        }
        }
        return ans.toString();

    }
}