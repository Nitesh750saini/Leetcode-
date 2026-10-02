class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        for(int val:candyType){
            set.add(val);
        }
        int count =set.size();
        int max=candyType.length/2;
        if(count <max){
            return count ;
        }
        else{
            return max;
        }
    }
}