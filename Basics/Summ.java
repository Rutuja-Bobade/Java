import java.util.Scanner;

public class Summ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number ;
        int choice;
        int evensum =0;
        int oddsum =0;
        do {
            System.out.println("Enetr the nummber.");
            number = sc.nextInt();

            if (number % 2 == 0) {
                evensum += number;
            } else {
                oddsum += number;
            }

            System.out.println("Do you want to continue ? \n Press \n 1 for yes \n 2 for no.");
            choice = sc.nextInt();
        } while (choice == 1);
        sc.close();
        System.out.println("The sum of even numbers is : "+evensum);
        System.out.println("The sum of odd numbers is : "+oddsum);
    }
}
