import java.util.Scanner;

public class Sum_loop {
    public static void main(String[] args){
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0 ;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}
