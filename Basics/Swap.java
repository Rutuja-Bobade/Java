// java supports only call by value.
// call by reference is not supported in java.

import java.util.Scanner;
public class Swap {
    public static void swapping(int num1 , int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("numbers after swapping are : a = "+ num1 +" b = "+num2);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println("Numbers before swapping are :a = "+a+" b = "+b);
        swapping(a , b);
    }
}
