import java.util.*;
public class Factorial_n {
    public static int Fact(int n){
        if(n ==1 || n ==0){
            return 1;
        }
        return n*Fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Fact(n);
        System.out.println(ans);
        sc.close();
    }
}
