// function overloading means class may contain 2 functions with same name but may differ from data type or number of the parameters/arguements passed in them .

import java.util.Scanner;

public class Overload {
    public static int sum(int a ,int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static Float sum(float a, float b){
        return a+b;
    } 
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = sum(x, y);
        System.out.println("sum = "+c);
        System.out.println(sum(2, 3, 3));
        System.out.println(sum(3.2f,4.8f));
        sc.close();
    }
}
