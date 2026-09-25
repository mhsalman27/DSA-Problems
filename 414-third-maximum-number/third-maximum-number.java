class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE; 
        long sMax = Long.MIN_VALUE ;
        long tMax = Long.MIN_VALUE ;
        for (int n : nums) {
            if (n > max) {
                tMax = sMax;
                sMax = max;
                max = n;
            } else if (n < max && n>sMax ) {
                tMax = sMax;
                sMax = n;
            } else if (sMax>n && n>tMax) {
                tMax = n;
            }
        }

       return tMax != Long.MIN_VALUE ? (int) tMax : (int) max ;
    }
}