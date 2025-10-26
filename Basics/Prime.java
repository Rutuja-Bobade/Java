import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = scanner.nextInt();
        scanner.close();
        int i = 2;
        
        boolean isPrime = true;
        if (num == 2) {
            System.out.println("2 is a prime ");
        }else{
            for(i = 2; i < num/2 ; i++){
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println(num+" is a prime number.");
            }else{
                System.out.println(num+" is not a prime number.");
            }
        }
    }
}