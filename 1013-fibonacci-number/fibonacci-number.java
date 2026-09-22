class Solution {
    public int fib(int n) {
        int[] f = new int[n+1];
        if(n<2){
            return n;
        }
        f[0] = 0;
        f[1] = 1;
        for(int i = 2 ; i< f.length ; i++){
            f[i] = f[i-2] + f[i-1];
        }
        return f[n];
    }
}