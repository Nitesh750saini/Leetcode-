class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list=new ArrayList<>();
        String s=String.valueOf(x);
        for(int val=0;val<words.length;val++){
            if(words[val].contains(s)){
                list.add(val);
            }
        }
        return list;
    }
}