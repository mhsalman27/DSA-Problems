class Solution {
    public int differenceOfSum(int[] nums) {
        int sumOfElements = 0;
        int sumOfDigits = 0;
        for(int n : nums){
            sumOfElements +=n;
            sumOfDigits += isdigit(n); 
        }

        return sumOfElements - sumOfDigits ;
    }

    public static int isdigit(int n){
        int sum = 0;
        while(n>0){
            sum = sum + n%10;
            n=n/10;
        }
        return sum;
    }
}