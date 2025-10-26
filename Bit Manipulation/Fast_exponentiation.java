// Fast Exponentiation takes less complexity as ......(log n with base 2)+1
//  this makes ocmputation much faster rather than applying the for loop for each multiplication ....
// the power to the base is first converted to binary number , further assigned with the asociative power. If the bit is 1 the number is multiplied by its a and then a is squared for next step . if bit is 0 , simply multiply with 1 and then square a.

import java.util.*;

public class Fast_exponentiation {
    public static int Fast_Expo(int a , int n){
        int ans = 1;
        while(n > 0){
            if((n&1) != 0){
                ans *= a;
            }
            a *= a; 
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(Fast_Expo(a ,n));

        sc.close();
    }
}
