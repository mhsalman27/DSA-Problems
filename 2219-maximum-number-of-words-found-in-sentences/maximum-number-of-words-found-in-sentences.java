class Solution {
    public int mostWordsFound(String[] sentences) {
        int count = 0 ;
        int maxCount = 0;
        for(String s : sentences){
            count = 1;
            for(char ch : s.toCharArray()){
                if(ch == ' '){
                    count++;
                }
            }
            maxCount = Math.max(count , maxCount);
        }
        return maxCount;
    }
}