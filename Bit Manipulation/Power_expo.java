import java.util.*;

public class Power_expo {
    // public static void power_Of_2(int n){
    //     int res = n&(n-1);

    //     if(res == 0){
    //         System.out.println("YES");
    //     } else{
    //         System.out.println("NO");
    //     }
    // }

    public static boolean power_Of_2(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        // power_Of_2(n);
        System.out.println(power_Of_2(n));
        sc.close();
    }
}
