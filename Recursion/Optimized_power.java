import java.util.*;

public class Optimized_power {
    // My code (not optimized) : Because you are re-computing the same subproblem twice (no memoization).
    // Time complexity : O(n);

    // public static int exponent(int base , int power){
    //     if(power == 1){
    //         return base;
    //     }
    //     if(power %2 == 1){
    //         return base*exponent(base, power-1);
    //     } 
    //     return exponent(base, power/2) *exponent(base, power/2);
    // }


    // Apna College
    public static int exponent(int base , int power){
        if( power == 0){
            return 1;
        }
        int halfpower = exponent(base, power/2);
        int halfpowerSq = halfpower *halfpower;

        // if power is odd
        if(power % 2 == 1){
            halfpowerSq = base *halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = sc.nextInt();

        System.out.println(exponent(a ,x));
        sc.close();
    }
}
