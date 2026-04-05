// Sr.No  ---- element
// 0 ----- 0
// 1 ----- 1
// 2 ----- 1
// 3 ----- 2
// 4 ----- 3
// 5 ----- 5 ......etc

public class Fibonacci {
    // using recurrsion
    // Time Compelxity = Exponential
    // public static int fibo(int n){
    //     if( n == 1){
    //         return 1;
    //     } else if(n == 0){
    //         return 0;          
    //  }
    //     return fibo(n-1) + fibo(n-2);
    // }


    // using Dynamic programming (Memoization)
    // Time complexity = O(n) Linear
    public static int fibo(int n , int[] f){
        if(n == 0 || n == 1){
            return n;
        }
        // checks if fibo(n) is already calculated
        if(f[n] != 0){
            return f[n];
        }
        
        // f[n] should be stored so that the calls further can use it.
        f[n] = fibo(n-1, f) + fibo(n-2, f);
        return f[n];
    }


    // Using Dynamic programming (tabulation)
    public static int fib_tab(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < n+1; i++){
            dp[i] = dp[i-1] + dp[i-2]; 
        }

        return dp[n];
    }

    public static void main(String[] args){
        int n = 5;

        // n+1 size , because fibonacci is calculated from 0 to nth position
        int f[] = new int[n+1];

        System.out.println(fibo(n , f));
        System.out.println(fib_tab(n));
    }
}
