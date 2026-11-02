public class Factorial {
    public static int factorial(int n){
        if(n==0 || n==1) return n;
        return n*factorial(n-1);
    }
    // TD= top down
    public static int factorialTD(int n, int[]dp){
        if(n==0||n==1) return 1;
        if(dp[n]!=0) return dp[n];
        int f1=factorialTD(n-1, dp);
        return dp[n]=n*f1;
    }
    public static int factorialBU(int n){
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<dp.length; i++){
            dp[i]=i*dp[i-1];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=15;
        int[] dp = new int[n+1];
        System.out.println(factorialTD(n, dp));
        System.out.println(factorialBU(n));
        System.out.println(factorial(n));
    }
}
