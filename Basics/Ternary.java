import java.util.Scanner;

public class Ternary {
    public static void main(String args[]){
        // pass/fail
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = (marks >= 33)? "Pass":"Fail";
        System.out.println(result);
        sc.close();

        // even/odd
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // String var = (num % 2 == 0) ? "even" :"odd" ;
        // System.out.println(num + " is "+ var +" number.");
        // sc.close();


    }
}