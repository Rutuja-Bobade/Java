import java.util.*;
public class Continuee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println(num);
            number ++;
        } while (number < 10);
        sc.close();
    }
}