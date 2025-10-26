import java.util.Scanner;

public class Power {
    public static int pow(int x , int n){
        if(n == 1){
            return x;
        }
        return x*pow(x, n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();

        int ans = pow(X , N);
        System.out.println(ans);

        sc.close();
    }
}
