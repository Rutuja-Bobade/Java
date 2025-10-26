import java.util.Scanner;

public class While_loop {
    public static void main(String[] args){
        int i = 1 ;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        sc.close();
    }
} 