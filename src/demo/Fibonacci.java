package demo;

import java.util.Arrays;

/**
 * @author zyh
 * @date 2020/5/27 21:40
 */
public class Fibonacci {

    private int n;
    private int[] dp;

    public Fibonacci(int n){
        this.n = n;
        init();
    }

    private void init(){
        dp = new int[n+1];
        dp[0] =0;
        dp[1]=1;
        for(int i = 2;i<n+1;i++){
            dp[i] = -1;
        }
    }

    public int fibo(){
        return fibo(n);
    }

    public int fibo(int n){
        if(n==0)
            return dp[0];
        if(n==1)
            return dp[1];
        if(dp[n]==-1)
            dp[n] = fibo(n-1)+fibo(n-2);

        return dp[n];
    }
}
