class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int digit = 0;
        for(int i = 0 ; i < nums.length ; i++){
            while(nums[i]>0){
               digit++;
               nums[i] /=10;
                // count++
                
            }
            if(digit%2==0){
                count++;
            }
            digit = 0;
        }
        return count;
    }
}