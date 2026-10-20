class Solution {
    public int compress(char[] chars) {
        int readIndex=0;
        int writeIndex=0;
        while(readIndex<chars.length){
            char currentchar=chars[readIndex];
            int count =0;
            while(readIndex<chars.length&&currentchar==chars[readIndex]){
                readIndex++;
                count++;

            }
            //  current char ka count aa ggya ab uss char ko  chars array mei dal rahe hai 
            chars[writeIndex]=currentchar;
            writeIndex++;
            //  ab count ko dal denge charss array mei;
            if(count >1){
                String countstr=String.valueOf(count );
                for(char digit: countstr.toCharArray()){
                    chars[writeIndex]=digit;
                    writeIndex++;

                }
            }

        }
        return writeIndex;
    }
}