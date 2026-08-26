class Solution {
    static int[] cache= new int[31]; //제약 조건이 0 <= n <= 30 이므로

    public int fib(int n) {
        if(n < 2){
            return n;
        }
        if(cache[n]!=0){
            cache[n] = fib(n-1) + fib(n-2);
        }
        return fib(n-1) + fib(n-2);
    }
}