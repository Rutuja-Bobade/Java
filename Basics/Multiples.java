import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Enter the number.");
            int num = sc.nextInt();
            if (num % 10 ==0) {
                break;
            }
            System.out.println(num);
        } while (true);
        sc.close();
    }
}
