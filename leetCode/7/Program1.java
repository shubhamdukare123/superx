class Solution {
    int fibonacci(int num){
        int a = 0;
        int b = 1;
        int sum = 0;
        int  ret = 0;
        if(num==0)
            return 0;
        if(num ==1)
            return 1;

        for(int i = 2; i<=num; i++){
            sum = a+b;
            ret = sum;
            a = b;
            b = sum;
        }
        return ret;
    }
    public int fib(int n) {
        if(n==1)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
