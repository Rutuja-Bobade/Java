import java.util.Scanner;

public class Sum_integer {
    public static int Sum_of_digits(int num){
        int sum=0;
        int remainder = 0;
        while (num > 0) {
            remainder = num % 10;
            sum = sum +remainder;
            num /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        sc.close();
        System.out.println(Sum_of_digits(a));
    }
}
