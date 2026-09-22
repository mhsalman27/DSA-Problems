class Solution {
    public int tribonacci(int n) {
        int[] t = new int[n+1];
        if(n<2){
            return n;
        }
        t[0] = 0;
        t[1] = 1;
        t[2] = 1;
        for(int i=3; i < t.length;i++){
            t[i] = t[i-3] + t[i-2] + t[i-1];
        }
        return t[n];
    }
}