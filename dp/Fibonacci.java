public class Fibonacci {

    // 1 1 2 3 5 8 13 21 34 55 89
    public static int fibonacci(int n){
        if(n==0||n==1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    // TD=Top down
    public static int fibonacciTD(int n, int[] dp) {
        if (n == 1 || n == 2) {
            return 1;
        }
        if (dp[n] != 0)
            return dp[n];
        else {
            int f1=fibonacciTD(n-1, dp);
            int f2=fibonacciTD(n-2, dp);
            dp[n]=f1+f2;
            return dp[n];
        }
    }
    // BU= Bottom Up
    public static int fibonacciBU(int n){
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2; i<dp.length; i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=50;
        int[] dp = new int[n+1];
        System.out.println(fibonacciBU(n));
        System.out.println(fibonacciTD(n, dp));
        System.out.println(fibonacci(n));
    }
}