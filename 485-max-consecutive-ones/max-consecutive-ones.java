class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i] == 1){
                maxCount++;
                // maxCount = Math.max(maxCount,count);
            }else{
                maxCount = 0;
            }
            if(maxCount>count){
                count = maxCount;
            }
        }
        return count;
    }
}