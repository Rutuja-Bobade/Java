import java.util.*;
public class Table {
    public static void main (String[] args){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int num = sc.nextInt();
        // sc.close();
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(num+ " * "+i+" = "+(num*i));
        // }
        multiplication_table();
    }

    public static void multiplication_table(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num+ " * "+i+" = "+(num*i));
        }
    }
}