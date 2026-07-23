class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        int i1 = 0 ,  i2 = 0 , i3 = 0 ;
        int n1 = 0 , n2 = 0 , n3 = 0;
        ugly[0] = 1 ;
        for(int i = 1 ; i< n ; i++ ){

            n1 = ugly[i1] * 2 ;
            n2 = ugly[i2] * 3 ;
            n3 = ugly[i3] * 5 ;

            int minNum = Math.min(n1,Math.min(n2,n3));
            ugly[i] = minNum;

            if(minNum == n1) i1++;
            if(minNum == n2) i2++;
            if(minNum == n3) i3++;

        }

        return ugly[n-1];

    }
}  