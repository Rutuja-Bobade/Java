import java.util.*;

public class Sum_n{
    // My Code
    public static int summation(int n , int sum){
        if(n == 1){
            sum += 1;
            return sum;
        }
        return n + summation(n-1, sum);
    }

    public static int addition(int n){
        if(n == 1){
            return 1;
        }
        return n + addition(n-1);
    }
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(summation(a ,0));

        sc.close();
    }
    
}
