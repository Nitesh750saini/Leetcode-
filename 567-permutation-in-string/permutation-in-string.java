class Solution {
    static boolean comparefreq(int count1[],int count2[]){
        for(int i=0;i<26;i++){
            if(count1[i]!=count2[i]){
                return false;


            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        // s1 ka freq table create kar rahe hai
        int count1[]=new int [26];
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            int index = ch-'a';
            count1[index]++;
        }
        //  window ka freq table create kar rahe hai
        int i=0;
        int windowlength=s1.length();
        int count2[]=new int [26];
        for(i=0;i<windowlength;i++){
            char ch=s2.charAt(i);
            int index=ch-'a';
            count2[index]++;
        }
        if(comparefreq(count1,count2)==true){
            return true;

        }
        else{
            while(i<s2.length()){
                //  pahle window ki freq match nahi hui to ab new index table mei add akrenege or window ke starting wale jo remove kar denge
                char newchar=s2.charAt(i);
                int newindex=newchar-'a';
                count2[newindex]++;
                //  new add ho gya ab starting  wala remove kar denge 

                int oldindex=i-windowlength;
                char oldchar=s2.charAt(oldindex);
                int oldfreqindex=oldchar-'a';
                count2[oldfreqindex]--;
                if(comparefreq(count1,count2)==true)
                    return true;
                   i++;



            }
        }
        return false;
        
    }
}