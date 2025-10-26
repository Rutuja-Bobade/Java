import java.util.Scanner;

public class Binary_decimal {
    public static int Binary_to_Decimal(int n){
        int pow = 0;
        int decimal = 0;
        while (n > 0) {
            int last_digit = n % 10;
            decimal = decimal + (int)(last_digit*Math.pow(2, pow));
            n /= 10;
            pow ++;
        }
        return decimal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int binary = sc.nextInt();
        sc.close();
        System.out.println(Binary_to_Decimal(binary));
    }
}