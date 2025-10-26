import java.util.*;

public class power_exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        int ans = 1;
        while(n != 0 ){
            if(n%2 == 1){
                ans *= a;
                n = n-1;
            } else{
                n = n/2;
                a = a*a;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
