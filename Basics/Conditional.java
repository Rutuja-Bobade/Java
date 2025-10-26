import java.util.*;

public class Conditional {
    public static void main(String args[]){
        
// greater of 2 numbers
        // int a = 12;
        // int b = 11;
        // if (a > b) {
        //     System.out.println(a +" is greater than "+b);
        // }
        // else{
        //     System.out.println(b +" is greater than "+ a);
        // }

// even/odd
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(a+ " is an even number.");
        }
        else{
            System.out.println(a+ " is not an even number.");
        }
        sc.close();



// tax calculator
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax = 0;
        // if (income < 500000) {
        //     tax = 0 ;   
        // }
        // else if ((income >= 500000)&&(income < 1000000)){
        //     tax = (int)(0.2 * income);
        // }
        // else if (income >= 1000000) {
        //     tax = (int)(0.3 * income);
        // }
        // System.out.println("tax is = " + tax);
        // sc.close();


// 1st approach
// largest of three numbers
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // if (a > b) {
        //     if (a > c) {
        //         System.out.println(a + " is largest.");
        //     } else {
        //         System.out.println(c + " is the largest.");
        //     }
        // } 
        // else {
        //     if (b > c) {
        //         System.out.println(b + " is the largest.");
        //     } else {
        //         System.out.println(c + " is the largest.");
        //     }        
        // }
        // sc.close();


// 2nd approach
// largest of 3
        // int a = 1, b = 3, c = 6;
        // if ((a>=b)&&(a>=c)) {
        //     System.out.println(a+" is the largest.");
        // } else if (b>=c) {
        //     System.out.println(b+" is the largest.");
        // }
        // else {
        //     System.out.println(c+ " is the largest.");
        // }
    }
}
