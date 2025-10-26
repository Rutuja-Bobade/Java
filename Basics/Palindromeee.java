import java.util.*;

public class Palindromeee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(palindromee(num));
        sc.close();
    }

    public static int reverse(int num){
        int remainder = 0 ;
        int reverse = 0;
        while (num > 0) {
            remainder = num % 10;
            reverse = reverse*10 + remainder;
            num /= 10;
        }
        return reverse;
    }
    public static boolean palindromee(int n){
        int reversed = reverse(n);
        if (n == reversed) {
            return true;
        } else{
            return false;
        }
    }
}
