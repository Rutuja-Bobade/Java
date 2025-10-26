import java.util.Scanner;

public class NCR {
    public static int fact(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static int bin_coe(int n ,int r){
        int a = fact(n);
        int b = fact(r);
        int c = fact(n-r);
        int ans = a/b*c;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int binomial_coefficient = bin_coe(n , r);
        System.out.println("Binomial coefficient = "+binomial_coefficient);
        sc.close();
    }
}