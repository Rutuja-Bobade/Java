// You are climbing a staircase. It takes n steps to reach the top.
// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

import java.util.*;

public class Climbing {
    public static int climb(int n, int[] dp){
        if(n == 1 || n == 2){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }

        dp[n] = climb(n-1, dp) + climb(n-2 , dp);
        return dp[n];
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);        int n = sc.nextInt();

        int[] dp = new int[n+1];
        int ways = climb(n , dp);

        System.out.println(ways);
        sc.close();
    }
}
